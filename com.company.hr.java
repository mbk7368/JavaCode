
@SuppressWarnings("unused")
interface EmployeeBehaviours {
    
    public void promote();
    public void demote();
    public void salaryCalculator();
    public void assignPerformanceLevel(double PerformanceLevel);
    public void displayEmployeeDetails();
    
}

@SuppressWarnings("unused")
abstract class Manager {
  
abstract public void hireEmployee(String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1);
abstract public void fireEmployee(String name1);
abstract public void promoteEmployee(Employee promotedEmployee);
abstract public void deomoteEmployee(Employee demotedEmployee);
abstract public void transferEmployee(Employee transferedEmployee, Departments newDept);
abstract public void displayAllEmployees();
abstract public void displayManagerDetails();

}

//interface multiple implementations.
//testing in Main.
//implement error handling.