import java.util.Scanner;
public class Strings {

    // --------------------------------------------
    // Reads in an array of Strings, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt() +1 ;

        strList = new String[size];
        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.nextLine();

        Sorting.selectionSort(strList);
        System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();

        Sorting.selectionSortDesc(strList);
        System.out.println ("\nYour strings in descending sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();

        Sorting.insertionSort(strList);
        System.out.println ("\nYour strings in ascending sorted insertionSort order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();
    }
}