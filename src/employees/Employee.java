public class Employee {
    private static int idCounter = 1;

    private final int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ФИО: " + fullName + ", Отдел: " + department + ", Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}