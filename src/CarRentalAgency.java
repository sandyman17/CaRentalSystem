/**
 * @author Jacob Sandefur
 * @version 3/9/2020
 */

import java.util.Scanner;


public class CarRentalAgency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What would you like to do?");

        while (true) {
            int sel1 = -1;
            while (sel1 < 0 || sel1 > 5) {

                System.out.println("1. Rent a Car");
                System.out.println("2. Buy a Car");
                System.out.println("3. Calculate Salary");
                System.out.println("4. Quit");
                sel1 = sc.nextInt();
                if (sel1 < 0 || sel1 > 4) {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter a number between 1 and 4!");
                }
            }
            if (sel1 == 4) {
                System.out.println("Shutting down the program!");
                return;
            }
            if (sel1 == 1) {
                String temp = sc.nextLine();
                System.out.println("Please enter the Customer's Information:");
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Address:");
                String address = sc.nextLine();
                System.out.println("Zip Code:");
                String zipCode = sc.nextLine();
                int numPrevRent = -1;
                System.out.println("Number of Previous Rentals:");
                while (numPrevRent < 0) {
                    numPrevRent = sc.nextInt();
                    if (numPrevRent < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                Customer customer = new Customer(name, address, zipCode, numPrevRent);

                String temp2 = sc.nextLine();
                System.out.println("Please enter the Car's Information:");
                System.out.println("Classification Type:");
                String classif = sc.nextLine();

                int maxSeat = -1;
                System.out.println("Max Seating:");
                while (maxSeat < 0) {

                    maxSeat = sc.nextInt();
                    if (maxSeat < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }

                int towCap = -1;
                System.out.println("Towing Capacity:");
                while (towCap < 0) {

                    towCap = sc.nextInt();
                    if (towCap < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }

                double fuelEcon = -1;
                System.out.println("Fuel Economy:");
                while (fuelEcon < 0) {

                    fuelEcon = sc.nextDouble();
                    if (fuelEcon < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                String temp3 = sc.nextLine();
                System.out.println("Make:");
                String make = sc.nextLine();
                System.out.println("Model:");
                String model = sc.nextLine();
                System.out.println("Vin:");
                String vin = sc.nextLine();
                double purchPrice = -1;
                System.out.println("Purchase Price:");
                while (purchPrice < 0) {

                    purchPrice = sc.nextDouble();
                    if (purchPrice < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                int mileage = -1;
                System.out.println("Mileage:");
                while (mileage < 0) {

                    mileage = sc.nextInt();
                    if (mileage < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                String sel2 = " ";
                System.out.println("Does " + name + " want insurance?");
                sel2 = sc.nextLine();

                while (true) {
                    sel2 = sc.nextLine();
                    if ((sel2.equalsIgnoreCase("yes") || (sel2.equalsIgnoreCase("y")))) {
                        break;
                    }
                    if ((sel2.equalsIgnoreCase("no")) || (sel2.equalsIgnoreCase("n"))) {
                        break;
                    }
                    else {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter either Yes/yes/y or No/no/n.");
                    }
                }
                int daysRent = -1;
                System.out.println("How many days are in the rental period?");
                while (daysRent < 0) {

                    daysRent = sc.nextInt();
                    if (daysRent < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                boolean insurance = false;
                switch (sel2) {
                    case "Yes":
                        insurance = true;
                        break;
                    case "yes":
                        insurance = true;
                        break;
                    case "y":
                        insurance = true;
                        break;
                    case "No":
                        insurance = false;
                        break;
                    case "no":
                        insurance = false;
                        break;
                    case "n":
                        insurance = false;
                        break;
                    default:
                        insurance = false;
                        break;
                }
                Car car = new Car(Classification.valueOf(classif), maxSeat, towCap, fuelEcon, make, model, vin,
                        purchPrice, mileage);

                double totalPrice = car.calculateRate(daysRent, insurance);
                double discount = customer.calculateDiscount();

                double totAfterDiscount = totalPrice - (totalPrice * discount);

                System.out.printf("The total Price is: $%.2f.%n", totAfterDiscount);

            }
            if (sel1 == 2) {
                String temp = sc.nextLine();
                System.out.println("Please enter the Customer's Information:");
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Address:");
                String address = sc.nextLine();
                System.out.println("Zip Code:");
                String zipCode = sc.nextLine();
                int numPrevRent = -1;
                System.out.println("Number of Previous Rentals:");
                while (numPrevRent < 0) {
                    numPrevRent = sc.nextInt();
                    if (numPrevRent < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                Customer customer = new Customer(name, address, zipCode, numPrevRent);
                String temp2 = sc.nextLine();

                System.out.println("Please enter the Car's Information:");
                System.out.println("Classification Type:");
                String classif = sc.nextLine();

                int maxSeat = -1;
                System.out.println("Max Seating:");
                while (maxSeat < 0) {

                    maxSeat = sc.nextInt();
                    if (maxSeat < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }

                int towCap = -1;
                System.out.println("Towing Capacity:");
                while (towCap < 0) {

                    towCap = sc.nextInt();
                    if (towCap < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }

                double fuelEcon = -1;
                System.out.println("Fuel Economy:");
                while (fuelEcon < 0) {

                    fuelEcon = sc.nextDouble();
                    if (fuelEcon < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                String temp3 = sc.nextLine();
                System.out.println("Make:");
                String make = sc.nextLine();
                System.out.println("Model:");
                String model = sc.nextLine();
                System.out.println("Vin:");
                String vin = sc.nextLine();
                double purchPrice = -1;
                System.out.println("Purchase Price:");
                while (purchPrice < 0) {

                    purchPrice = sc.nextDouble();
                    if (purchPrice < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                int mileage = -1;
                System.out.println("Mileage:");
                while (mileage < 0) {

                    mileage = sc.nextInt();
                    if (mileage < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                Car car = new Car(Classification.valueOf(classif), maxSeat, towCap, fuelEcon, make, model, vin,
                        purchPrice, mileage);

                double totalPrice = car.calculateSellPrice();


                System.out.printf("The total Price is: $%.2f.%n", totalPrice);


            }
            if (sel1 == 3) {
                String temp3 = sc.nextLine();
                System.out.println("Please enter the Employee's information:");
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Years Worked:");
                int yrsWorked = -1;
                while (yrsWorked < 0) {
                    yrsWorked = sc.nextInt();
                    if (yrsWorked < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                System.out.println("Total Rentals:");
                int totRentals = -1;
                while (totRentals < 0) {
                    totRentals = sc.nextInt();
                    if (totRentals < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                System.out.println("Base Salary:");
                double baseSalary = -1;
                while (baseSalary < 0) {
                    baseSalary = sc.nextDouble();
                    if (baseSalary < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }
                System.out.println("Id:");
                int id = -1;
                while (id < 0) {
                    id = sc.nextInt();
                    if (id < 0) {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter a number greater than or equal to 0.");
                    }
                }

                Employee employee = new Employee(name, yrsWorked, totRentals, baseSalary, id);

                double salary = employee.calculateSalary();

                System.out.printf(name + "'s salary is: $%.2f.%n", salary);

            }
        }

    }
}

