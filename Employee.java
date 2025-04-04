public class Employee {

    private String name;
    private int age;
    protected double salary;

    //Constructor
    public Employee (String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    //Method to get the Name
    public String getName() {
        return this.name;
    }

    //Method to get the Age
    public int getAge() {
        return this.age;
    }

    //Method to take the Salary
    public double getSalary() {
        return this.salary;
    }

    //Method to raise salary
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }

    public static void main (String[] args) {
        Employee emp = new Employee("JuanDelaCruz", 100000, 30);

        System.out.println("Name:" + emp.getName());
        System.out.println("Age:" + emp.getAge());
        System.out.println("Salary:" + emp.getSalary());

        emp.raiseSalary();
        System.out.println("New Salary after raise:" + emp.getSalary());
    }

}

