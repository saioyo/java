public class ElectricityBill {
    public static void main(String[] args) {

        // electrcity bill
        Bill(12, 1,1,1,2);
        
    }
    public static void Bill(int a,int...v){
        int sum = 0;
        int bill = 1;

        for(int price:v){
            sum += price;
        }
        bill = sum*10;
        System.out.println("electricity bill:" + bill);
        

    }
}
