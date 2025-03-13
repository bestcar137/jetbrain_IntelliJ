import  java.util.Scanner;

public class hw2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int square_x1 = 100;
        int square_y1 = 100;
        int square_x2 = 200;
        int square_y2 = 200;

        int x1,x2,y1,y2;
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        if (x1 < x2 && y1 < y2) {
            if ( x1 < square_x1 && y1 < square_y1) {}
        }


        sc.close();
    }
}
