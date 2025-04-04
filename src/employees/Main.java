package employees;

public class Main {
public static void main(String[] args) {
    EmployeeBook book = new EmployeeBook();

    book.addEmployee(new Employee(1, "Иван Иванов", "IT", 50000));
    book.addEmployee(new Employee(2, "Петр Петров", "HR", 45000));
    book.addEmployee(new Employee(3, "Сергей Смирнов", "Finance", 55000));

    System.out.println("Список всех сотрудников:");
    book.printAllEmployees();

    System.out.println("\nСумма затрат на зарплату: " + book.getTotalSalary());
    System.out.println("Средняя зарплата: " + book.getAverageSalary());
    System.out.println("Сотрудник с минимальной ЗП: " + book.getEmployeeWithMinSalary());
    System.out.println("Сотрудник с максимальной ЗП: " + book.getEmployeeWithMaxSalary());

    book.removeEmployee(2);

    System.out.println("\nПосле удаления сотрудника с ID 2:");
    book.printAllEmployees();
}
}
