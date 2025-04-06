public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        book.addEmployee(new Employee("Иванов Иван Иванович", 1, 50000));
        book.addEmployee(new Employee("Петров Петр Петрович", 2, 60000));
        book.addEmployee(new Employee("Сидорова Анна Сергеевна", 1, 55000));
        book.addEmployee(new Employee("Кузнецов Дмитрий Олегович", 3, 70000));
        book.addEmployee(new Employee("Смирнова Ольга Николаевна", 4, 65000));

        book.printAllEmployees();
        System.out.println("Сумма затрат на ЗП: " + book.totalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + book.getMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной ЗП: " + book.getMaxSalaryEmployee());
        System.out.println("Средняя ЗП: " + book.averageSalary());
        System.out.println("Список ФИО:");
        book.printAllNames();
    }
}