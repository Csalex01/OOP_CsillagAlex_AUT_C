package org.csalex;

public class Car {

    // Privát mezők deklarálása

    private String carBrand;
    private String carType;
    private Color color;
    private FuelType fuel;
    private int numberOfKilometers;
    private int numberOfPassengers;
    private int yearOfManufacture;
    private int speed;

    // ----------

    /**
     * @param carBand               Az autó márkája
     * @param carType               Az autó tipusa
     * @param color                 Az autó színe
     * @param fuel                  Az autó üzemanyagának tipusa (DIESEL, PETROL, GAS, ELECTRIC)
     * @param numberOfKilometers    Az autó által megtett út (kilóméterben kifejezve)
     * @param numberOfPassengers    Az autóban elérhető férőhelyek száma (5 - családi autó)
     * @param yearOfManufacture     Az autó gyártási éve
     * @param speed                 Az autó kurrens sebessége
     */
    Car(String carBand, String carType, Color color, FuelType fuel, int numberOfKilometers, int numberOfPassengers, int yearOfManufacture, int speed) {
        this.carBrand = carBand;
        this.carType = carType;
        this.color = color;
        this.fuel = fuel;
        this.numberOfKilometers = numberOfKilometers;
        this.numberOfPassengers = numberOfPassengers;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    /**
     * @param carBrand              Az autó márkája
     * @param carType               Az autó típusa
     * @param fuel                  Az autó üzemanyagának tipusa (DIESEL, PETROL, GAS, ELECTRIC)
     * @param family                Családi autó? (True / False)
     * @param yearOfManufacture     Az autó gyártási éve
     */
    Car(String carBrand, String carType, int fuel, boolean family, int yearOfManufacture) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.speed = 0;
        this.numberOfKilometers = 0;
        this.yearOfManufacture = yearOfManufacture;

        switch (fuel) {
            case 0:
                this.fuel = FuelType.DIESEL;
                break;
            case 1:
                this.fuel = FuelType.PETROL;
                break;
            case 2:
                this.fuel = FuelType.GAS;
                break;
            default:
                this.fuel = FuelType.ELECTRIC;
        }

        if(family)
            this.numberOfPassengers = 5;
        else
            this.numberOfPassengers = 2;

        switch (Character.toUpperCase(carBrand.charAt(0))) {
            case 'R':
                this.color = Color.RED;
                break;
            case 'G':
                this.color = Color.GREEN;
                break;
            case 'B':
                this.color = Color.BLUE;
                break;
            case 'W':
                this.color = Color.WHITE;
                break;
            default:
                this.color = Color.BLACK;
        }
    }

    // Getter függvények

    public String getCarBrand() {
        return this.carBrand;
    }

    public String getCarType() {
        return this.carType;
    }

    public Color getColor() {
        return this.color;
    }

    public FuelType getFuel() {
        return this.fuel;
    }

    public int getNumberOfKilometers() {
        return this.numberOfKilometers;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    public int getSpeed() {
        return this.speed;
    }

    // ----------

    // Setter függvények

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public void setNumberOfKilometers(int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // ----------

    // Egyéb metódusok/tagfüggvények

    /**
     * Az autó sebessége nem lehet negatív!
     * @param speedIndicator        Az autó jelenlegi gyorsulása
     */
    public void changeSpeed(int speedIndicator) {
        if(this.speed + speedIndicator < 0)
            return;

        this.speed += speedIndicator;
    }

    /**
     * Az autó által megtett távolság minden 200 km után nullázódik!
     * @param length                Az autó által megtett távolságához hozzáadandó távolság
     */
    public void moveCar(int length) {
        if(length < 0)
            return;

        if(this.numberOfKilometers + length > 200) {
            int remaining = this.numberOfKilometers + length - 200;
            this.resetMileage();
            this.numberOfKilometers = remaining;
        } else {
            this.numberOfKilometers += length;
        }

    }

    // Segédfüggvény, amely az autó által megtett távolság nullázásáért felel.
    public void resetMileage() {
        this.numberOfKilometers = 0;
    }

    @Override
    public String toString() {
        return "This car is a " + this.carBrand + " " + this.carType + ((this.numberOfPassengers == 5) ? " family " : " two-seater ") + this.fuel +
                " car which was manufactured in " + this.yearOfManufacture + ". It has " + this.color +
                " color and the number of kilometers traveled is: " + this.numberOfKilometers;
    }

    // ----------
}
