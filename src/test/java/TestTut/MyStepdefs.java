package TestTut;

import TestTut.FirstPackage.Animal;
import TestTut.FirstPackage.Dog;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;


public class MyStepdefs {

    private Animal myDog;
    private String animalSound;

    @Given ("^I have a dog")
    public void iHaveADog(){
        myDog = new Dog();
    }

    @When("^the animal makes a sound$")
    public void theAnimalMakesASound(){
        animalSound = myDog.getSound();
    }

    @Then("^I expect the sound to be a bark$")
    public void iExpectTheSoundToBeABark(){
        assertEquals("Woof", animalSound);
    }

   /* public TestTut.MyStepdefs() {
        Given("^I have a dog$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }*/
}
