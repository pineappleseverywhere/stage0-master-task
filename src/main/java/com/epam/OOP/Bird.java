package com.epam.OOP;

public class Bird extends Animal{
    public Bird(){
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
    /*
    Override getDescription() method for class Bird: add one more sentence to the
    description. The result must be "This animal is mostly blue. It has 2 paws and
     no fur. Moreover, it has 2 wings and can fly."
(Optional) Create an object of each class and call getDescription() method for both
 of them. Try to explain the output results.
     */
}
