import java.util.Scanner;

public class Variable_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String textString = scanner.nextLine();
        
        System.out.println("Enter an integer: ");
        int wholenumber = scanner.nextInt();

        System.out.println("Enter a double: ");
        double floatingnum = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        boolean TrueOrFalse = scanner.nextBoolean();

    
        System.out.println("Your string is " + textString);
        System.out.println("Your integer is " + wholenumber);
        System.out.println("Your double is " + floatingnum);
        System.out.println("Your boolean is " + TrueOrFalse);

        scanner.close();
    }
}
