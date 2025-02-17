public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    // Method to get the full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method to calculate annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise the salary by a given percentage
    public double raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        } else {
            System.out.println("Percentage must be positive.");
        }
        return salary;
    }

    // toString method for displaying employee information
    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", salary=" + salary +
               '}';
    }
}
