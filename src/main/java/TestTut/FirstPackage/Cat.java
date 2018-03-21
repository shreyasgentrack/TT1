package TestTut.FirstPackage;

public class Cat extends Animal{

    //Variables
    private String makeSound = "Miaow";

    @Override
    public String getSound(){
        return makeSound;
    }

    @Override
    public void setMakeSound(String makeSound){
        this.makeSound = makeSound;
    }

}
