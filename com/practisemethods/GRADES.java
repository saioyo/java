package practisemethods;

public class GRADES {
    public static void Grades(int a){

        String grade = switch(a/10){ //92 -> 9
            case 10, 9 -> "grade A";
            case 8 -> "grade B";
            case 7 -> "grade C";
            case 6 -> "grade D";
            case 5 -> "grade E";
            default -> "BSDk tu fail ho gaya";

        };
        System.out.println(grade);

    }
    public static void main(String[] args) {
        Grades(9);
    }

    
}
