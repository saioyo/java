import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {

        //boolean ans = search("sai", 'a');
        String name = "sai";
        char target = 'a';

        //System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray()));
        
    }
    public static boolean search2(String str,char target){
        
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    public static boolean search(String str,char target){
        
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i <str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    
}
