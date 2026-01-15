# Required: pip install phonenumbers
# Optional for map: pip install folium opencage  (needs free OpenCage API key)

import phonenumbers
from phonenumbers import geocoder, carrier, timezone

# ────────────────────────────────────────────────
#   BASIC VERSION – no API key needed
# ────────────────────────────────────────────────

def get_phone_info_basic(phone_str: str) -> dict:
    try:
        # Parse the phone number (must include country code like +91, +1, +44...)
        parsed = phonenumbers.parse(phone_str)
        
        if not phonenumbers.is_possible_number(parsed):
            return {"error": "Number format not possible"}
        if not phonenumbers.is_valid_number(parsed):
            return {"error": "Invalid phone number"}
        
        info = {
            "formatted": phonenumbers.format_number(
                parsed, phonenumbers.PhoneNumberFormat.INTERNATIONAL
            ),
            "country": geocoder.description_for_number(parsed, "en") or "Unknown",
            "region_guess": geocoder.description_for_number(parsed, "en", strict=False) or None,
            "operator": carrier.name_for_number(parsed, "en") or "Unknown / MVNO / not available",
            "timezones": timezone.time_zones_for_number(parsed) or ["Unknown"],
            "is_mobile": phonenumbers.number_type(parsed) == phonenumbers.PhoneNumberType.MOBILE,
            "type": phonenumbers.number_type(parsed).name if hasattr(phonenumbers, 'number_type') else "Unknown",
        }
        
        return info
    
    except phonenumbers.NumberParseException as e:
        return {"error": f"Parse error: {e}"}
    except Exception as e:
        return {"error": f"Unexpected error: {e}"}


# ────────────────────────────────────────────────
#   ENHANCED VERSION – approximate city + map (needs OpenCage key)
#   Get free key → https://opencagedata.com/users/sign_up (2500 req/day free)
# ────────────────────────────────────────────────

def get_phone_info_with_map(phone_str: str, opencage_api_key: str = None):
    basic = get_phone_info_basic(phone_str)
    
    if "error" in basic:
        return basic
    
    location_text = basic["country"]
    if basic.get("region_guess") and basic["region_guess"] != basic["country"]:
        location_text += f", {basic['region_guess']}"
    
    lat, lng = None, None
    
    if opencage_api_key:
        try:
            from opencage.geocoder import OpenCageGeocode
            geo = OpenCageGeocode(opencage_api_key)
            results = geo.geocode(location_text)
            
            if results and len(results) > 0:
                lat = results[0]['geometry']['lat']
                lng = results[0]['geometry']['lng']
                basic["approx_coordinates"] = (lat, lng)
                basic["map_note"] = "Coordinates are approximate (center of region/country)"
        except ImportError:
            basic["map_note"] = "Install opencage:  pip install opencage"
        except Exception as e:
            basic["map_note"] = f"Geocoding failed: {e}"
    
    # Optional: save simple map (uncomment if you want)
    # if lat and lng:
    #     import folium
    #     m = folium.Map(location=[lat, lng], zoom_start=6)
    #     folium.Marker([lat, lng], popup=location_text).add_to(m)
    #     m.save("phone_location_map.html")
    #     basic["map_file"] = "phone_location_map.html"
    
    return basic


# ────────────────────────────────────────────────
if __name__ == "__main__":
    print("Phone Number Approximate Location Lookup (2026 version)")
    print("Enter number with country code, e.g. +919876543210 or +12025550123\n")
    
    number = input("Phone number → ").strip()
    
    # Basic version (no key needed)
    result = get_phone_info_basic(number)
    
    if "error" in result:
        print("\nError:", result["error"])
    else:
        print("\n┌──────────────────────────────────────────────┐")
        print(f" Number       : {result['formatted']}")
        print(f" Country       : {result['country']}")
        if result.get("region_guess"):
            print(f" Region/city   : {result['region_guess']}")
        print(f" Operator      : {result['operator']}")
        print(f" Timezones     : {', '.join(result['timezones'])}")
        print(f" Likely mobile : {'Yes' if result['is_mobile'] else 'No / Fixed / Unknown'}")
        print("└──────────────────────────────────────────────┘")
    
    # If you want better city approximation + map, uncomment and add your key:
    # YOUR_OPENCAGE_KEY = "paste_your_free_key_here"
    # enhanced = get_phone_info_with_map(number, YOUR_OPENCAGE_KEY)
    # print(enhanced)