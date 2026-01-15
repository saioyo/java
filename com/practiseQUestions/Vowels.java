public class Vowels {
    public static void main(String[] args) {
        // to find consonats and vowels in the given string

        vowel("sai");

        
    }
    public static void vowel(String s){

        
        s = s.toLowerCase();

        System.out.print("Vowels:");

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

             if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                System.out.print(ch + " ");
        }


    }
}
}