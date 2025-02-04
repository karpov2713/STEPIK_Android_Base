package examples;

public class Worker {
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}
