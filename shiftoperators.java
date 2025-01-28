import java.util.Scanner;
public class shiftoperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:\t");
        int a=sc.nextInt();
        System.out.println("enter another number");
        int b=sc.nextInt();
        sc.close();
        System.out.println("the left shift operator of a given number:"+(a<<b));
        System.out.println("the right shift operator of given number:"+(a>>b));
    }
}

