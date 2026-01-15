public class KunalHoliday {
    public static void Holidays(String month){
        String Str1 = month.toLowerCase();

        switch(Str1){
            case "jan","march","may","july","august","oct","dec" -> System.out.println(16);
            case "april","june","sep","nov" -> System.out.println(15);
            case "feb" -> System.out.println(14);
        }
    }
    public static void main(String[] args) {
        Holidays("jan");
    }
}
