package dealingwithgeneralization.extractsuperclass;

public class Worker {
    private String name;
    private double salary;
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

}
