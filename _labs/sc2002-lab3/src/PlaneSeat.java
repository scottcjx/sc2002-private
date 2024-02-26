public class PlaneSeat {
    private int seatId;
    private boolean assigned = false;
    private int customerId = -1;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unassign() {
        this.customerId = -1;
        this.assigned = false;
    }
}
