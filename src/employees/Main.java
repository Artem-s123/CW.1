public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // Добавляем сотрудников
        employeeBook.addEmployee(new Employee("Иванов Иван", 1, 50000));
        employeeBook.addEmployee(new Employee("Петров Петр", 2, 60000));
        employeeBook.addEmployee(new Employee("Сидоров Сидор", 3, 70000));

        // Выводим всех сотрудников
        System.out.println("Все сотрудники:");
        employeeBook.printAllEmployees();

        // Подсчитываем общую сумму зарплат
        System.out.println("\nОбщая сумма затрат на зарплаты: " + employeeBook.calculateTotalSalary());

        // Находим сотрудника с минимальной зарплатой
        System.out.println("\nСотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());

        // Находим сотрудника с максимальной зарплатой
        System.out.println("\nСотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());

        // Подсчитываем среднюю зарплату
        System.out.println("\nСредняя зарплата: " + employeeBook.calculateAverageSalary());
    }

    // Вложенный класс EmployeeBook
    private static class EmployeeBook {

        private Employee[] employees;
        private int employeeCount;

        public EmployeeBook() {
            employees = new Employee[10];  // Массив для 10 сотрудников
            employeeCount = 0;
        }

        // Метод для добавления сотрудника
        public boolean addEmployee(Employee employee) {
            if (employeeCount >= employees.length) {
                return false;  // Нет места для нового сотрудника
            }
            employees[employeeCount++] = employee;  // Добавляем сотрудника и увеличиваем счетчик
            return true;
        }

        // Метод для удаления сотрудника по ID
        public void removeEmployee(int id) {
            for (int i = 0; i < employeeCount; i++) {
                if (employees[i].getId() == id) {
                    employees[i] = null;
                    // Перемещаем всех сотрудников, чтобы не было "дырок"
                    for (int j = i; j < employeeCount - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    employees[--employeeCount] = null;
                    break;
                }
            }
        }

        // Метод для получения сотрудника по ID
        public Employee getEmployeeById(int id) {
            for (int i = 0; i < employeeCount; i++) {
                if (employees[i].getId() == id) {
                    return employees[i];
                }
            }
            return null;  // Если сотрудник не найден
        }

        // Метод для вывода всех сотрудников
        public void printAllEmployees() {
            for (int i = 0; i < employeeCount; i++) {
                if (employees[i] != null) {
                    System.out.println(employees[i]);
                }
            }
        }

        // Метод для подсчета общей зарплаты
        public double calculateTotalSalary() {
            double totalSalary = 0.0;
            for (int i = 0; i < employeeCount; i++) {
                totalSalary += employees[i].getSalary();
            }
            return totalSalary;
        }

        // Метод для поиска сотрудника с минимальной зарплатой
        public Employee findEmployeeWithMinSalary() {
            if (employeeCount == 0) return null;
            Employee minSalaryEmployee = employees[0];
            for (int i = 1; i < employeeCount; i++) {
                if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
            return minSalaryEmployee;
        }

        // Метод для поиска сотрудника с максимальной зарплатой
        public Employee findEmployeeWithMaxSalary() {
            if (employeeCount == 0) return null;
            Employee maxSalaryEmployee = employees[0];
            for (int i = 1; i < employeeCount; i++) {
                if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
            return maxSalaryEmployee;
        }

        // Метод для подсчета средней зарплаты
        public double calculateAverageSalary() {
            if (employeeCount == 0) return 0.0;
            return calculateTotalSalary() / employeeCount;
        }
    }
}
