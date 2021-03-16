import java.util.Scanner;

class Whileloop {
    public static void main(String[] args) {
        int n, i = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        n = sc.nextInt();
        
        while (i <= n) {
            sum = sum + i; //adding the value of i into sum variable
            i++;//increments the value of i by 1
        }
        
        System.out.println("Sum of First " + n + " Natural Numbers is = " + sum);
    }
}