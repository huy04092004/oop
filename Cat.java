public class Cat extends Mammal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat: Meow!");
    }

    @Override
    public String toString() {
        return "A Cat named " + name + " that is a Mammal";
    }
}
