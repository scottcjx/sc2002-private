import java.util.Scanner;

public class P3 {
    static final double CONVERSION_RATE_USD_SGD = 1.82;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starting, ending, increment;
        System.out.print("Starting: ");
        starting = scanner.nextInt();

        System.out.print("Ending: ");
        ending = scanner.nextInt();

        if (ending < starting)
        {
            System.out.print("Invalid");
            return;
        }

        System.out.print("Increment: ");
        increment = scanner.nextInt();

//        func_for(starting, ending, increment);
//        func_while(starting, ending, increment);
        func_dowhile(starting, ending, increment);
    }

    public static void func_dowhile(int starting, int ending, int increments)
    {
        System.out.println("US$ \t\t SGD$");

        int i = starting;
        do
        {
            System.out.printf("%d \t\t %.2f \n", i, (i * CONVERSION_RATE_USD_SGD));
            i+= increments;
        } while (i <= ending);
    }
    public static void func_while(int starting, int ending, int increments)
    {
        System.out.println("US$ \t\t SGD$");

        int i = starting;
        while (i <= ending)
        {
            System.out.printf("%d \t\t %.2f \n", i, (i * CONVERSION_RATE_USD_SGD));
            i+= increments;
        }
    }

    public static void func_for(int starting, int ending, int increments)
    {
        System.out.println("US$ \t\t SGD$");
        for (int i = starting; i <= ending; i+= increments)
        {
            System.out.printf("%d \t\t %.2f \n", i, (i * CONVERSION_RATE_USD_SGD));
        }
    }
}
