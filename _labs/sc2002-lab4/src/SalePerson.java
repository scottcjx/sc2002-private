import java.lang.String;

public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(java.lang.String firstName, java.lang.String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return this.lastName + ", " + this.firstName + " : " + this.totalSales;
    }

    public boolean equals(SalePerson o){
        return (this.firstName.equals(o.firstName)) && (this.lastName.equals(o.lastName));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int compareTo(SalePerson o) {
        if (this.totalSales == o.totalSales) {
            return -1 * (this.lastName.compareTo(o.lastName));
        } else if (this.totalSales < o.totalSales) {
            return -1;
        } else {
            return 1;
        }
    }
}
