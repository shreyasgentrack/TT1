Feature: animals
  Scenario: The dog makes a bark sound
    Given I have a dog
    When the animal makes a sound
    Then I expect the sound to be a bark