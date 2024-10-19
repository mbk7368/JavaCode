

public abstract class Manager {
  
abstract public void hireEmployee(String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1);
abstract public void fireEmployee(String name1);
abstract public void promoteEmployee(Employee promotedEmployee);
abstract public void demoteEmployee(Employee demotedEmployee);
abstract public void transferEmployee(Employee transferedEmployee, Departments newDept);
abstract public void displayAllEmployees();
abstract public void displayManagerDetails();

}

//interface multiple implementations.
//testing in Main.
//implement error handling.