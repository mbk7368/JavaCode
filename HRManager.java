


class HRManager extends Manager {

///Vars
private int id;
private String name;

///constructor

public void HRManager(int id1, String name1) {
    this.id = id1;
    this.name= name1;

}

///methods
@Override
public void hireEmployee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1){
    Employee newEmployee = new Employee(name1, age1, department1, role1, initialSalary1,yearsOfExperience1);
    newEmployee.mappingEmployees();
}
@Override
public void fireEmployee (String name1){
    if (Employee.EmployeesMap.containsKey(name1)){Employee.EmployeesMap.remove(name1);}
    else {System.err.println("Employee was not found, make sure you enter the correct name.");}
}
@Override
public void promoteEmployee (Employee promotedEmployee){
    promotedEmployee.promote();
}
@Override
public void deomoteEmployee (Employee demotedEmployee){
    demotedEmployee.demote();
}
@Override
public void transferEmployee(Employee transferedEmployee, Departments newDept){
    Departments oldDpetObj = Departments.DepartmentMap.get(transferedEmployee.department);
    if (!transferedEmployee.department.equals(newDept.name)) {
        for (String dept : Departments.DepartmentList) {
            if (dept.equals(newDept.name)){
                transferedEmployee.department =  newDept.name;
                newDept.addEmployeeToDepartment(transferedEmployee.getEmployeename());
                oldDpetObj.removeEmployee(transferedEmployee.getEmployeename());
            }

            }
        }
    else if (transferedEmployee.department.equals(newDept.name)) {System.err.println("The old Department is identical to the new department");}
    else {System.err.println("The old Department is identical to the new department");}

}
@Override
public void displayAllEmployees (){
    for (String employee : Employee.allEmployees) {
        Employee EmployeeObject  = Employee.EmployeesMap.get(employee);
        EmployeeObject.displayEmployeeDetails();

    }
}
@Override
public void displayManagerDetails() {
    System.err.println(this.id);
    System.err.println(this.name);
}

}