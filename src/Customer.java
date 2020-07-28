/**
 * @author Jacob Sandefur
 * @version 3/9/2020
 */
public class Customer {
    private String name;
    private String address;
    private String zipCode;
    private int numRentals;

    public Customer(String name, String address, String zipCode, int numRentals) {
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.numRentals = numRentals;
    }
    public Customer() {
        this.name = null;
        this.address = null;
        this.zipCode = null;
        this.numRentals = -1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static void setZipCode(String zipCode) {
        zipCode = zipCode;
    }

    public int getNumRentals() {
        return numRentals;
    }

    public void setNumRentals(int numRentals) {
        this.numRentals = numRentals;
    }

    public double calculateDiscount() {
        double discount = 0.00;
        discount = (numRentals * 0.25) / 100;
        if (discount > 0.25) {
            discount = 0.25;
        }

        return discount;
    }
}
