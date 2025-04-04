package employees;
public class EmployeeBook {
        private static final int SIZE = 100;
        private Employee[] employees = new Employee[SIZE];

        public boolean addEmployee(Employee newEmployee) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = newEmployee;
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
            for (Employee emp : employees) {
                if (emp != null && emp.getId() == id) {
                    return emp;
                }
            }
            return null;
        }

        public void printAllEmployees() {
            for (Employee emp : employees) {
                if (emp != null) {
                    System.out.println(emp);
                }
            }
        }

        public double getTotalSalary() {
            double total = 0;
            for (Employee emp : employees) {
                if (emp != null) {
                    total += emp.getSalary();
                }
            }
            return total;
        }

        public Employee getEmployeeWithMinSalary() {
            Employee minEmp = null;
            for (Employee emp : employees) {
                if (emp != null && (minEmp == null || emp.getSalary() < minEmp.getSalary())) {
                    minEmp = emp;
                }
            }
            return minEmp;
        }

        public Employee getEmployeeWithMaxSalary() {
            Employee maxEmp = null;
            for (Employee emp : employees) {
                if (emp != null && (maxEmp == null || emp.getSalary() > maxEmp.getSalary())) {
                    maxEmp = emp;
                }
            }
            return maxEmp;
        }

        public double getAverageSalary() {
            double total = 0;
            int count = 0;
            for (Employee emp : employees) {
                if (emp != null) {
                    total += emp.getSalary();
                    count++;
                }
            }
            return count > 0 ? total / count : 0;
        }
    }
