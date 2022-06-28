class Animal {
    public void eat() {
        System.out.println("eating...");//lớp cha phải có method void eat()
    }
}

class Cat extends Animal {


    public void eat() {
        System.out.println("Eat meat");
    }

    public void meow() {
        System.out.println("meowing...");
    }

}
public class TEst {

    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal; // downcasting
        ((Cat) animal).meow();
    }

}

