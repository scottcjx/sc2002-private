import java.util.Scanner;

public class PlaneApp {

    public static void main(String[] args) {
        Plane plane;
        plane = new Plane();

        int seatId, cust_id;

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true)
        {
            System.out.println("(1) Show the number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of customers together with their seat numbers in the order of the seat numbers");
            System.out.println("(4) Show the list of customers together with their seat numbers in the order of the customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Quit");

            System.out.print("Enter the number of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.print("\tPlease enter Seat Id: ");
                    seatId = sc.nextInt();
                    System.out.print("\tPlease enter Customer Id: ");
                    cust_id = sc.nextInt();

                    plane.assignSeat(seatId, cust_id);
                    break;
                case 6:
                    System.out.print("\tPlease enter Seat Id: ");
                    seatId = sc.nextInt();

                    plane.unAssignSeat(seatId);
                    break;
                default:
                    return;
            }
        }
    }
}