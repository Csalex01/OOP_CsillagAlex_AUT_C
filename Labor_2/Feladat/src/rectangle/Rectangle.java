package rectangle;

public class Rectangle {

    // Attributes, Data - Tulajdonsagok
    // Egysegbezaras - Encapsulation

    private double width;
    private double length;


    //public String rectangleName; //egysegbezaras nincs betartva

    //Methods, behaviour - viselkedes

    //Constructor - inicializalas, lefoglalas
    //default constructor

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width) {
        this.width = width;
        this.length = 0;
    }

    //Getters
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    //Setters
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {

        //felepithetjuk a kimenetet
        //Rectangle: hossz X szelesseg
        //Rectangle: 10 X 12
        return "Rectangle: " + this.width + " X " + this.length;
    }


}
