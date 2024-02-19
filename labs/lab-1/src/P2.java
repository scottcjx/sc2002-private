import java.util.Scanner;

public class P2 {
    enum EmployeeGrade
    {
        A,
        B,
        C,
        NA
    }

    public static void main(String[] args)
    {
            int salary, merit;
            salary = get_salary();
            merit = get_merit();
            print_grade(salary, merit);
    }

    public static void print_grade(int salary, int merit)
    {
        EmployeeGrade employeeGrade;
        if (salary < 500 || salary > 899)
        {
            employeeGrade = EmployeeGrade.NA;
        }
        else if (salary < 600)
        {
            employeeGrade = EmployeeGrade.C;
        }
        else if (salary <= 649)
        {
            if (merit < 10)
                employeeGrade = EmployeeGrade.C;
            else
                employeeGrade = EmployeeGrade.B;
        }
        else if (salary < 700)
        {
            employeeGrade = EmployeeGrade.B;
        }
        else if (salary <= 799)
        {
            if (merit < 20)
                employeeGrade = EmployeeGrade.B;
            else
                employeeGrade = EmployeeGrade.A;
        }
        else
        {
            employeeGrade = EmployeeGrade.A;
        }

        switch (employeeGrade)
        {
            case A -> System.out.printf("Salary: $%d - Merit: %d -> Grade: %c", salary, merit, 'A');
            case B -> System.out.printf("Salary: $%d - Merit: %d -> Grade: %c", salary, merit, 'B');
            case C -> System.out.printf("Salary: $%d - Merit: %d -> Grade: %c", salary, merit, 'C');
            default -> System.out.printf("Salary: $%d - Merit: %d -> Grade: %s", salary, merit, "NA");
        }
        System.out.println(" ");
    }

    public static int get_salary()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("salary: $");

        return scanner.nextInt();
    }

    public static int get_merit()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("merit: ");

        return scanner.nextInt();
    }
}
