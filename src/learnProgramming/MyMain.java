package learnProgramming;

public class MyMain {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.animalMethod();
        System.out.println(" ******************************************");

        Dog myDog = new Dog();
        myDog.animalMethod();
        System.out.println("****************************************");

        Cat myCat = new Cat();
        System.out.println("**********************************************");

        GermanShepard myGerShp = new GermanShepard();

    }

}
