import java.security.PublicKey;
import java.util.Arrays;

public class Plane {
    static final int NUM_OF_SEATS = 12;

    private PlaneSeat[] seat;
    private int numEmptySeat = NUM_OF_SEATS;

    public Plane() {
        this.seat = new PlaneSeat[NUM_OF_SEATS];
        for (int i = 0; i < NUM_OF_SEATS; i++)
        {
            this.seat[i] = new PlaneSeat(i + 1);
        }
    }

    private PlaneSeat[] sortSeats() {
//        a method to sort the seats according to ascending order of customerID.
//        A copy of the original seat array is used for sorting instead of the original
        int numTakenSeats = NUM_OF_SEATS - this.numEmptySeat;
        int[] takenSeatsCustId;
        takenSeatsCustId = new int [numTakenSeats];

        int c = 0;
        for (int i = 0; i < NUM_OF_SEATS; i++)
        {
            if (this.seat[i].isOccupied())
            {
                takenSeatsCustId[c] = this.seat[i].getCustomerId();
                c++;
            }
        }

        Arrays.sort(takenSeatsCustId);

        PlaneSeat[] takenSeats;
        takenSeats = new PlaneSeat[numTakenSeats];
        for (int i = 0; i < numTakenSeats; i++)
        {
            for (int j = 0; j < NUM_OF_SEATS; j++)
            {
                if (takenSeatsCustId[i] == this.seat[j].getCustomerId())
                {
                    takenSeats[i] = new PlaneSeat(this.seat[j].getSeatId());
                    takenSeats[i].assign(takenSeatsCustId[i]);
                    break;
                }
            }
        }

        return takenSeats;
    }

    public void showNumEmptySeats() {
        System.out.printf("There are %d empty seats\n\n", this.numEmptySeat);
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");

        for (int i = 0; i < NUM_OF_SEATS; i++)
        {
            if (!this.seat[i].isOccupied()) {
                System.out.printf("SeatID %d\n", this.seat[i].getSeatId());
            }
        }
        System.out.println();
    }

    public void showAssignedSeats(boolean bySeatId) {
        if (this.numEmptySeat == NUM_OF_SEATS) {
            System.out.println("There is no assigned seats");
            System.out.println();
            return;
        }

        System.out.println("The seat assignments are as follow:");

        if (!bySeatId)
        {
            PlaneSeat[] sortedByCustSeats;
            sortedByCustSeats = sortSeats();

            for (PlaneSeat sortedByCustSeat : sortedByCustSeats) {
                System.out.printf("SeatID %d assigned to CustomerID %d.\n", sortedByCustSeat.getSeatId(), sortedByCustSeat.getCustomerId());
            }
        }
        else
        {
            for (int i = 0; i < NUM_OF_SEATS; i++)
            {
                if (this.seat[i].isOccupied()) {
                    System.out.printf("SeatID %d assigned to CustomerID %d.\n", this.seat[i].getSeatId(), this.seat[i].getCustomerId());
                }
            }
        }
        System.out.println();
    }

    public void assignSeat(int seatId, int cust_id)
    {
        if (seatId > NUM_OF_SEATS || seatId < 1) {
            System.out.println("Error, SeatId invalid");
            return;
        }
        if (this.seat[seatId-1].getCustomerId() != -1)
        {
            System.out.println("Seat already assigned!");
            return;
        }

        this.seat[seatId-1].assign(cust_id);
        System.out.printf("Seat %d assigned to customer %d", seatId, cust_id);
        System.out.println();
        System.out.println();


        this.numEmptySeat--;
    }

    public void unAssignSeat(int seatId) {
        if (seatId > NUM_OF_SEATS || seatId < 1)
        {
            System.out.println("Error, SeatId invalid");
            return;
        }

        if (this.seat[seatId-1].getCustomerId() < 0)
        {
            System.out.println("Seat isn't already assigned!");
            return;
        }

        this.seat[seatId-1].unassign();
        System.out.printf("Seat %d unassigned", seatId);
        System.out.println();
        System.out.println();

        this.numEmptySeat++;
    }
}
