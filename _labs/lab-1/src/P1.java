import java.util.Scanner;

public class P1
{
    public static void main(String[] args) {
        char choice;
        choice = get_choice();
        func_sw(choice);
    }

    public static char get_choice()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice: ");

        return scanner.next().charAt(0);
    }

    public static void func_sw(char choice)
    {
        switch (choice)
        {
            case 'A', 'a': System.out.println("Action movie fan");
                break;
            case 'C', 'c': System.out.println("Comedy movie fan");
                break;
            case 'D', 'd': System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void func_if(char choice)
    {
        if ((choice == 'A') || (choice == 'a'))
            System.out.println("Action movie fan");
        else if ((choice == 'C') || (choice == 'c'))
            System.out.println("Comedy movie fan");
        else if ((choice == 'D') || (choice == 'd'))
            System.out.println("Drama movie fan");
        else
            System.out.println("Invalid choice");
    }
}
