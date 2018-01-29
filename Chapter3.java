package Chapter3;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a, b, c, d, e, f :");
        int a= keyboard.nextInt();
        int b= keyboard.nextInt();
        int c= keyboard.nextInt();
        int d= keyboard.nextInt();
        int e= keyboard.nextInt();
        int f= keyboard.nextInt();
        int Denominator=a*d-b*c;
        if(Denominator==0) {
            System.out.println("The equation has no soloution");
        }
        else{
            int x=(e*d-b*f)/Denominator;
            int y=(a*f-e*c)/Denominator;
            System.out.println("X is:"+x +" and y is:"+y);
        }
    }
}
