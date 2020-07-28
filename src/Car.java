/**
 * @author Jacob Sandefur
 * @version 3/9/2020
 */
public class Car {
    private Classification type;
    private int maxSeating;
    private int towingCapacity;
    private double fuelEconomy;
    private String make;
    private String model;
    private String vin;
    private double purchasePrice;
    private int mileage;

    public Car(Classification type, int maxSeating, int towingCapacity, double fuelEconomy, String make, String model,
               String vin, double purchasePrice, int mileage) {
        this.type = type;
        this.maxSeating = maxSeating;
        this.towingCapacity = towingCapacity;
        this.fuelEconomy = fuelEconomy;
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.purchasePrice = purchasePrice;
        this.mileage = mileage;
    }
    public Car() {
        this.type = null;
        this.maxSeating = -1;
        this.towingCapacity = -1;
        this.fuelEconomy = -1;
        this.make = null;
        this.model = null;
        this.vin = null;
        this.purchasePrice = 0;
        this.mileage = 0;
    }


    public Classification getType() {

        return type;
    }

    public void setType(Classification type) {

        this.type = type;
    }

    public int getMaxSeating() {
        return maxSeating;
    }

    public void setMaxSeating(int maxSeating) {

        this.maxSeating = maxSeating;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {

        this.towingCapacity = towingCapacity;
    }

    public double getFuelEconomy() {

        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {

        this.fuelEconomy = fuelEconomy;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getVin() {

        return vin;
    }

    public void setVin(String vin) {

        this.vin = vin;
    }

    public double getPurchasePrice() {

        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {

        this.purchasePrice = purchasePrice;
    }

    public int getMileage() {

        return mileage;
    }

    public void setMileage(int mileage) {

        this.mileage = mileage;
    }

    public double calculateRate(int daysRent, boolean insurance) {
        double rentPrice = 20.00;
        double rate = 0;
        if (insurance) {
            rentPrice += 15;
        }

        if (type == Classification.ECONOMY || type == Classification.COMPACT) {
            rentPrice += 10;
        }
        else if (type == Classification.PREMIUM || type == Classification.SPORT) {
            rentPrice += 20;
        }
        else if (type == Classification.SUV || type == Classification.PICKUP) {
            rentPrice += 30;
        }
        else if (type == Classification.LUXURY) {
            rentPrice += 40;
        }

        rate  = (rentPrice * daysRent);

        return rate;
    }
    public double calculateSellPrice() {
        double sellPrice = 0;
        sellPrice = purchasePrice - (mileage * 0.05);
        return sellPrice;
    }


}
