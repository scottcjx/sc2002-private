import java.util.Scanner;

public class P4
{
    public static String A = "AA";
    public static String B = "BB";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height;
        System.out.print("Height: ");
        height = scanner.nextInt();

        if (height < 1)
        {
            System.out.println("Error, invalid");
            return;
        }

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                if ((i+j) % 2 == 0) System.out.print(A);
                else System.out.print(B);
            }
            System.out.println("");
        }

    }
}
