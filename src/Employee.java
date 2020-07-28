/**
 * @author Jacob Sandefur
 * @version 3/9/2020
 */
public class Employee {
    private String name;
    private int yearsWorked;
    private int totalRentals;
    private double baseSalary;
    private int id;

    public Employee(String name, int yearsWorked, int totalRentals, double baseSalary, int id) {
        this.name = name;
        this.yearsWorked = yearsWorked;
        this.totalRentals = totalRentals;
        this.baseSalary = baseSalary;
        this.id = id;
    }
    public Employee() {
        this.name = null;
        this.yearsWorked = -1;
        this.totalRentals = -1;
        this.baseSalary = -1;
        this.id = -1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public int getTotalRentals() {
        return totalRentals;
    }

    public void setTotalRentals(int totalRentals) {
        this.totalRentals = totalRentals;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calculateSalary() {
        double salary = 0.00;
        salary = baseSalary + (yearsWorked * 0.5 * totalRentals);

        return salary;
    }
}
