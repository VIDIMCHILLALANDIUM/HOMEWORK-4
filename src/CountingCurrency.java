import java.util.Scanner;

public class CountingCurrency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму долларов ");
        double amount = input.nextDouble();

        int amountInCents = (int) (amount * 100);
        System.out.println("Ваша сумма в центах " + amountInCents);

        int dollarAmount  = amountInCents / 100;
        System.out.println("Ваша сумма в долларах " + dollarAmount);
        amountInCents = amountInCents % 100;
        System.out.println("Ваша сумма в центах " + amountInCents);

        int quarter  = amountInCents / 25;
        System.out.println("Ваша сумма в четвертаках " + quarter);
        amountInCents = amountInCents % 25;
        System.out.println("Ваш остаток " + amountInCents);

        int dime  = amountInCents / 10;
        System.out.println("Ваша сумма в десятках " + dime);
        amountInCents = amountInCents % 10;
        System.out.println("Ваш остаток " + amountInCents);

        int nickel  = amountInCents / 5;
        System.out.println("Ваша сумма в пятаках " + nickel);
        amountInCents = amountInCents % 5;
        System.out.println("Ваш остаток " + amountInCents);
    }
}
