import java.util.Scanner;


public class Q3_sumPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum " + a + " + " + b+ " = " + sum );
    }
}
