public class Distance {
    public static void main(String[] args) {
        
        // Distance
        distance( 3,3 ,4,4);


    }
    public static void distance(int a,int b,int c,int d){
        System.out.println("point A is at(" + a + " ," + b +" )");
        System.out.println("point B is at(" + c + " ," + d +" )");

        int dis = a - c;
        int dis2 = b - d;
        double distance = Math.sqrt(dis*dis + dis2*dis2);


        System.out.println("distance between them is :" + distance);

    }


        
}

