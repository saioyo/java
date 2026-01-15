public class ArmstrongNumber {
    public static void armstrongNumber(int a)
    {
        int r;
        int num = 0;
        int original = a;
        while(a>0){
            r = a%10;
            num = num +r*r*r;
            a = a/10;
        }
        if(num == original){
        System.out.println("it is an armstrong number"+num);}
        else{
        System.out.println("not an armstrong number");
        }

    }
    public static void main(String[] args) {
        armstrongNumber(153);
    }
    
}
