package learnProgramming;

public class Dog extends Animal {

    public Dog()
    {
        System.out.println("I am in Dog class");
    }

     @Override
    public void animalMethod() {
        int a = 1;
        System.out.println("This is a overrided animal method");
    }

    }

