package Homework;

public class exercise {
    public static void main(String[] args) {

        Employee e1 = new Employee(8, "Mahad", "Ahmed", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("First name: " + e1.getFname());
        System.out.println("Second name: " + e1.getSname());
        System.out.println("Salary: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("Annual salary: " + e1.getAnnualSalary());

        System.out.println("raiseSalary is: " + e1.raiseSalary(10));

        System.out.println(e1);
    }
}


class Employee {
    private int id;
    private String fName; // camelCase tusaale: firstName ama fName
    private String sName;
    private int salary;

    Employee(int id, String fName, String sName, int salary) {
        this.id = id;
        this.fName = fName;
        this.sName = sName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fName;
    }

    public String getSname() {
        return sName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return fName + " " + sName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = salary + (salary * percent) / 100;
        return salary;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}

