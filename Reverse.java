import java.util.Scanner;

class Reverse {

    public static void main(String args[]) {
        int number =0, reverse = 0;
        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        number = in.nextInt();
        //we have not mentioned the initialization part of the for loop
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}