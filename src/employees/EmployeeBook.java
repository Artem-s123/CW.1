public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee e : employees) {
            if (e != null && e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public double totalSalary() {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public Employee getMinSalaryEmployee() {
        Employee min = null;
        for (Employee e : employees) {
            if (e != null && (min == null || e.getSalary() < min.getSalary())) {
                min = e;
            }
        }
        return min;
    }

    public Employee getMaxSalaryEmployee() {
        Employee max = null;
        for (Employee e : employees) {
            if (e != null && (max == null || e.getSalary() > max.getSalary())) {
                max = e;
            }
        }
        return max;
    }

    public double averageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public void printAllNames() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getFullName());
            }
        }
    }

    public void indexSalary(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                double newSalary = e.getSalary() * (1 + percent / 100);
                e.setSalary(newSalary);
            }
        }
    }

    // Методы для работы с отделами
    public Employee getMinSalaryInDepartment(int department) {
        Employee min = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (min == null || e.getSalary() < min.getSalary()) {
                    min = e;
                }
            }
        }
        return min;
    }

    public Employee getMaxSalaryInDepartment(int department) {
        Employee max = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (max == null || e.getSalary() > max.getSalary()) {
                    max = e;
                }
            }
        }
        return max;
    }

    public double totalSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public double averageSalaryInDepartment(int department) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public void indexSalaryInDepartment(int department, double percent) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                double newSalary = e.getSalary() * (1 + percent / 100);
                e.setSalary(newSalary);
            }
        }
    }

    public void printEmployeesInDepartment(int department) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double amount) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < amount) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryMoreThanOrEqual(double amount) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= amount) {
                System.out.println("ID: " + e.getId() + ", ФИО: " + e.getFullName() + ", Зарплата: " + e.getSalary());
            }
        }
    }
}