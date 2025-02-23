public class Dog extends Mammal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog: Woof!");
    }

    @Override
    public String toString() {
        return "A Dog named " + name + " that is a Mammal";
    }
}
