package Test;

class Animal {
    public void eat() {
        System.out.println("eating...");//lớp cha phải có method void eat()
    }
}

class Cat extends Animal {


    public void eat() {
        System.out.println("Eat meat");
    }

    public void meow() {    // Animal không co lop nay
        System.out.println("meowing...");
    }

}
public class Downcating {

    public static void main(String[] args) {
        Animal animal = new Cat();

       ((Cat) animal).meow();

    }

}
