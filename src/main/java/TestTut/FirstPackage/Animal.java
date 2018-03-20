package TestTut.FirstPackage;

public class Animal {

    //variables
    private String name;
    private int number_of_legs;
    private String colour;
    private String makeSound = "MOOO"; //Should be overridden if dog

    private static String owner = "Rajiv"; // static variable must be accessed directly

    //functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSound(){
        return makeSound;
    }
    public void setMakeSound(String makeSound){
        this.makeSound = makeSound;
    }

}

