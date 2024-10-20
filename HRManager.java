import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class HRManager extends Manager implements EmployeeBehaviours {

///Vars
final private int id;
final private String name;
double PerformanceLevel;
int yearsOfExperience;
double initialSalary;
double effectiveSalary;


static private int IdCounter = 0;
static public List<String> HRManagerList = new ArrayList<>(); 
static public Map<String, HRManager> HRManagerMap = new HashMap<>();

///constructor

public HRManager(String name1, double initialSalary1, int yearsOfExperience1) {
    IdCounter += 1;
    this.id = IdCounter;
    this.name = name1;
    this.PerformanceLevel = 0.5;
    this.initialSalary = initialSalary1;
    this.effectiveSalary = this.initialSalary;
    this.yearsOfExperience = yearsOfExperience1;
    HRManagerList.add(name1);
}

///methods

@Override
public void promote() {
    System.out.println("You can not promote an HRManager");
};
@Override
public void demote() {
    System.err.println("You can not demote and HRManager");

};
@Override
public void salaryCalculator() {
    double  experienceFactor;
    double  PerformanceLevelFactor;
    if      (this.PerformanceLevel >= 1.0) PerformanceLevelFactor = 1.50;
    else if (this.PerformanceLevel >= 0.9) PerformanceLevelFactor = 1.40;
    else if (this.PerformanceLevel >= 0.8) PerformanceLevelFactor = 1.30;
    else if (this.PerformanceLevel >= 0.7) PerformanceLevelFactor = 1.20;
    else if (this.PerformanceLevel >= 0.6) PerformanceLevelFactor = 1.10;
    else if (this.PerformanceLevel >= 0.5) PerformanceLevelFactor = 1.00;
    else if (this.PerformanceLevel >= 0.4) PerformanceLevelFactor = 1.95;
    else if (this.PerformanceLevel >= 0.3) PerformanceLevelFactor = 1.90;
    else if (this.PerformanceLevel >= 0.2) PerformanceLevelFactor = 1.85;
    else if (this.PerformanceLevel >= 0.1) PerformanceLevelFactor = 1.80;
    else                                     PerformanceLevelFactor = 1.00;

    switch (this.yearsOfExperience) {
        case 10 -> { experienceFactor = 1.50; }
        case 9 -> { experienceFactor = 1.45; }
        case 8 -> { experienceFactor = 1.40; }
        case 7 -> { experienceFactor = 1.35; }
        case 6 -> { experienceFactor = 1.30; }
        case 5 -> { experienceFactor = 1.25; }
        case 4 -> { experienceFactor = 1.20; }
        case 3 -> { experienceFactor = 1.15; }
        case 2 -> { experienceFactor = 1.1; }
        case 1 -> { experienceFactor = 1.0; }
        default -> { experienceFactor = 1.00; }
    }
    this.effectiveSalary = ((this.initialSalary * PerformanceLevelFactor )* experienceFactor);

};
@Override
public void assignPerformanceLevel(double PerformanceLevel1) {
    this.PerformanceLevel = PerformanceLevel1; 
    this.salaryCalculator();
};
@Override
public void displayEmployeeDetails() {
    displayManagerDetails();
};

@Override
public void hireEmployee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1){
    Employee newEmployee = new Employee(name1, age1, department1, role1, initialSalary1,yearsOfExperience1);
    newEmployee.mappingEmployees();
}
@Override
public void fireEmployee (String name1){
    if (Employee.EmployeesMap.containsKey(name1)){
        Employee firedEmployee = Employee.EmployeesMap.get(name1);
        Departments dept1 = Departments.DepartmentMap.get(firedEmployee.department);
        Employee.EmployeesMap.remove(name1);
        Employee.allEmployees.remove(name1);
        dept1.removeEmployee(name1);
        System.out.println("Employee was successfully removed");
    }
    else {System.out.println("Employee was not found, make sure you enter the correct name.");}
}
@Override
public void promoteEmployee (Employee promotedEmployee){
    promotedEmployee.promote();
}
@Override
public void demoteEmployee (Employee demotedEmployee){
    demotedEmployee.demote();
}
@Override
public void transferEmployee(Employee transferedEmployee, Departments newDept){
    Departments oldDpetObj = Departments.DepartmentMap.get(transferedEmployee.department);
    for (String dept : Departments.DepartmentList){
        if (dept.equals(newDept.name)) {
            if (!transferedEmployee.department.equals(newDept.name)) {            
                transferedEmployee.department =  newDept.name;
                newDept.addEmployeeToDepartment(transferedEmployee.getEmployeename());
                oldDpetObj.removeEmployee(transferedEmployee.getEmployeename());              
                }

            else if (transferedEmployee.department.equals(newDept.name)) {System.out.println("The old Department is identical to the new department");}
        }
    }
    if (transferedEmployee.department.equals(newDept.name)) {System.out.println("Employee was transfered suyccessfully");}
    else {System.out.println("Department was not found");}

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
    System.out.println("ID:" + this.id);
    System.out.println("Name:" + this.name);
    System.out.println("Experience:" + this.yearsOfExperience);
    System.out.println("EffectiveSalary:" + this.effectiveSalary);
}

public void MappingHRManager(){
    HRManagerMap.put(this.name , this);
}

public double getEffectiveSalary() {
        return this.effectiveSalary;
    }

}