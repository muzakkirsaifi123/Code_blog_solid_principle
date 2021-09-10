package Liskov_Substitution_Principle;

interface Animal{
    static void makeNoise() {

        System.out.println("Dog can making noise when someone try to enter in the house");
    }
}

class Cat implements Animal {
    public static void makeNoise() {

        System.out.println("Cat can eat Non-veg");
    }
}
class Dog implements Animal {

    public static void makeNoise()
    {
        System.out.println("Dog can eat Veg as well as Non-Veg");
    }
}
class DumbDog implements Animal{

    public static void main(String[] args) {
        {
            System.out.println("I am from Liskov_Substitution Principle");

            Dog.makeNoise();
            Animal.makeNoise();
            Cat.makeNoise();


        }
    }
}
