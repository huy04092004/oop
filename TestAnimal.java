public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");

        animal.makeSound();
        mammal.makeSound();
        cat.makeSound();
        dog.makeSound();

        System.out.println();
        System.out.println(cat);
        System.out.println(dog);
    }
}
