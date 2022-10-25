package web.model;

public class Car {
    private String countryOfOrigin;
    private String brand;
    private int yearOfProduction;

    public Car() {

    }

    public Car(String countryOfOrigin, String brand, int yearOfProduction) {
        this.countryOfOrigin = countryOfOrigin;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "This car is from " + countryOfOrigin + " manufactured " + " by " + brand + " in " + yearOfProduction ;
    }
}
