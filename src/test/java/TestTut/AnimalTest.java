package TestTut;

import TestTut.FirstPackage.Animal;
import junit.framework.Assert;
import org.junit.Test;

public class AnimalTest {

    private Animal animal = new Animal();
    private Animal animalTwo = new Animal();

    @Test
    public void animalTest() {

        animal.setName("Rex");
        animal.setColour("Brown");
        animal.setNumber_of_legs(4);

        Assert.assertEquals(animal.getName(),"Rex");
        Assert.assertEquals(animal.getColour(), "Brown");
        Assert.assertEquals(animal.getNumber_of_legs(),4);
    }

    @Test
    public void animalTwoTest(){

        animalTwo.setName("Rio");
        animalTwo.setColour("Black");
        animalTwo.setNumber_of_legs(12);

        Assert.assertEquals(animalTwo.getName(),"Rio");
        Assert.assertEquals(animalTwo.getColour(), "Black");
        Assert.assertEquals(animalTwo.getNumber_of_legs(),12);
    }

}
