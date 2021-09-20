import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of item 1");
        int item1 = in.nextInt();
        System.out.print("Enter the quantity of item 1");
        int quant1 = in.nextInt();
        System.out.print("Enter the price of item 2");
        int item2 = in.nextInt();
        System.out.print("Enter the quantity of item 2");
        int quant2 = in.nextInt();
        System.out.print("Enter the price of item 2");
        int item3 = in.nextInt();
        System.out.print("Enter the quantity of item 2");
        int quant3 = in.nextInt();
        double subtotal = item1*quant1+item2*quant2+item3*quant3;
        double tax = .055*subtotal;
        double total = tax+subtotal;
        System.out.printf("Subtotal: $%.2f\n",subtotal);
        System.out.printf("Tax: $%.2f\n",tax);
        System.out.printf("Total: $%.2f\n",total);

    }
}
