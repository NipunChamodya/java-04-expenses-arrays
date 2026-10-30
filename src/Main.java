import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many expenses do you have # ");
        int numberOfItems = input.nextInt();

        double[] expenses = new double[numberOfItems];
        double total = 0;

        System.out.println("\n--- Enter the Expense ---");

        for (int i = 0; i < expenses.length; i++ ){
            System.out.print("Expenses No#" + (i +1) + "Rs. ");
            expenses[i] = input.nextInt();
        }

        System.out.println("\n--- Expenses Summery ---");

        for (int i =0; i < expenses.length; i++){
            System.out.println("Expense No# " + (i + 1) + "Rs" + expenses[i]);
            total = total + expenses[i];
        }

        System.out.println("--------------------------");
        System.out.println("Total Expenses is " + total);




    }
}