package TestTut.FirstPackage;

public class Dog extends Animal {

    //Variables
    private String makeSound = "Woof";

    @Override
    public String getSound(){
        return makeSound;
    }

    @Override
    public void setMakeSound(String makeSound){
        this.makeSound = makeSound;
    }

}