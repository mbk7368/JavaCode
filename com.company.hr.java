
interface EmployeeInterface {
    
    public void promote();
    public void demote();
    public void increaseSalary();
    public void changeRole(String role1);
    public void changeDepartment(String department1);
    public void salaryCalculator();
    public void assignPerformanceLevel(double PerformanceLevel);
    public int getEmployeeId();
    public String getEmployeename();
    public int getEmployeeage();
    public int getNumberOfAllEmployees();
    public void mappingEmployees();
    public void displayEmployeeDetails();
    
}

abstract class Manager {
  
abstract public void hireEmployee(String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1);
abstract public void fireEmployee(String name1);
abstract public void promoteEmployee(Employee promotedEmployee);
abstract public void deomoteEmployee(Employee demotedEmployee);
abstract public void transferEmployee(Employee transferedEmployee, Departments newDept);
abstract public void displayAllEmployees();
abstract public void displayManagerDetails();

}

/////employee subclasses
///interface multiple implementations
///testing in Main
///implement error handling