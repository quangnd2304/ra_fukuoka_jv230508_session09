package collection;

public class Demo {
    public static void main(String[] args) {
        Animal[] arrDog = new Dog[10];
        Dog dog = new Dog();
        Cat cat = new Cat();
        arrDog[0] = dog;
        arrDog[1] = cat;
    }
}
