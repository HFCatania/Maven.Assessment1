package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    public String name;
    public Integer age;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        name = "";
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        age = 0;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        name = "";
        age = 0;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return null;
    }
}
