public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

       dog.eat();
       cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

    }
}
