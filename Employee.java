public class Employee {
    private String firstName;
    private String lastName;

    // Parameterized constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter methods (if needed)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Creating an Employee object with a parameterized constructor
        Employee employee = new Employee("John", "Doe");

        // Accessing the employee's first name and last name
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
    }
}