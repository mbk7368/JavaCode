import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Employee implements EmployeeBehaviours {

    /////////vars
    final private int id;
    final private String name;
    private int age;
    String role;
    String department;
    double initialSalary;
    double effectiveSalary;
    int yearsOfExperience;
    double PerformanceLevel;



    static private int numberOfAllEmployees = 1;
    static public Map<String, Employee> EmployeesMap = new HashMap<>();
    static public List<String> allEmployees = new ArrayList<>();


    ////////constructor....................................................................................
    public Employee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1){
        this.id = numberOfAllEmployees;
        numberOfAllEmployees = ( numberOfAllEmployees + 1);
        allEmployees.add(name1);
        this.name = name1;
        this.age = age1;
        this.role = role1;
        this.initialSalary = initialSalary1;
        this.department = department1;
        this.PerformanceLevel = 0.5;
        this.yearsOfExperience = yearsOfExperience1;
        this.effectiveSalary = 0;


        //Assigning department........................................................
        boolean DepartmentExist = false;
        for (String dept : Departments.DepartmentList){
            if ( dept.equals(department1)  ){
                DepartmentExist = true;
            }
        }
        if (DepartmentExist) {
            Departments Department = Departments.DepartmentMap.get(department1);
            if (Department != null) {
                Department.addEmployeeToDepartment(name1);
            } else {
                System.out.println("Error: Department object not found");
            }

        } else {
            System.out.println("Department does not exist");

        }

        //Assigning role...........................................................
        boolean roleExist = false;
        for (String Role : Roles.rolelist){
            if ( Role.equals(role1)  ){
                roleExist = true;
            }
        }
        if (roleExist) {
            Roles roleobj = Roles.RolesMap.get(role1);
            if (roleobj != null) {
                roleobj.addUninitiatedEmployeeToRole(name1);
            } else {
                System.out.println("Error: Role object not found");
            }

        }
        else {System.out.println("Role does not exist");}


        //calculating effective salary..............................................................
        double  roleFactor;
        double  experienceFactor;
        switch (role1) {
            case "CEO" -> {roleFactor = 2; }
            case "COO" -> { roleFactor = 1.9; }
            case "DepartmentManager" -> { roleFactor = 1.8; }
            case "ManagerAssisstant" -> { roleFactor = 1.6; }
            case "Supervisor" -> { roleFactor = 1.4; }
            case "Specialist" -> { roleFactor = 1.2; }
            case "Worker" -> { roleFactor = 1.1; }
            default -> { roleFactor = 1; }
        }

        switch (yearsOfExperience1) {
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
        this.effectiveSalary = ((initialSalary1 * roleFactor ) * experienceFactor);

    }

    ///////Methods
    
    @Override
    public void promote() {
        switch (this.role) {
            case "CEO" -> System.out.println("You can not promote a CEO");
            case "COO" -> {
                this.role = "CEO";
                System.out.println("Employee was promoted to CEO");
            }
            case "DepartmentManager" -> {
                this.role = "COO";
                System.out.println("Employee was promoted to COO");
            }
            case "ManagerAssisstant" -> {
                this.role = "DepartmentManager";
                System.out.println("Employee was promoted to DepartmentManager");
            }
            case "Supervisor" -> {
                this.role = "ManagerAssisstant";
                System.out.println("Employee was promoted to ManagerAssisstant");
            }
            case "Specialist" -> {
                this.role = "Supervisor";
                System.out.println("Employee was promoted to Supervisor");
            }
            case "Worker" -> {
                this.role = "Specialist";
                System.out.println("Employee was promoted to Specialist");
            }
            default -> System.out.println("Employee role is unknown");
        }
        this.salaryCalculator();

    }

    @Override
    public void demote() {
        switch (this.role) {
            case "CEO" -> {
                this.role = "COO";
                System.out.println("Employee was demoted to COO");
            }
            case "COO" -> {
                this.role = "DepartmentManager";
                System.out.println("Employee was demoted to DepartmentManager");
            }
            case "DepartmentManager" -> {
                this.role = "ManagerAssisstant";
                System.out.println("Employee was demoted to ManagerAssisstant");
            }
            case "ManagerAssisstant" -> {
                this.role = "Supervisor";
                System.out.println("Employee was demoted to Supervisor");
            }
            case "Supervisor" -> {
                this.role = "Specialist";
                System.out.println("Employee was demoted to Specialist");
            }
            case "Specialist" -> System.out.println("You can not demote a Specialist");
            case "Worker" -> System.out.println("You can not demote a worker");
            default -> System.out.println("Employee role is unknown");
        }
        this.salaryCalculator();

    }

    @Override
    public void salaryCalculator() {
        double  roleFactor;
        double  experienceFactor;
        double  PerformanceLevelFactor;
        switch (this.role) {
            case "CEO" -> {roleFactor = 2; }
            case "COO" -> { roleFactor = 1.9; }
            case "DepartmentManager" -> { roleFactor = 1.8; }
            case "ManagerAssisstant" -> { roleFactor = 1.6; }
            case "Supervisor" -> { roleFactor = 1.4; }
            case "Specialist" -> { roleFactor = 1.2; }
            case "Worker" -> { roleFactor = 1.1; }
            default -> { roleFactor = 1.00; }
        }

        
        if      (this.PerformanceLevel >= 1.0) {PerformanceLevelFactor = 1.50;}
        else if (this.PerformanceLevel >= 0.9) PerformanceLevelFactor = 1.40;
        else if (this.PerformanceLevel >= 0.8) PerformanceLevelFactor = 1.30;
        else if (this.PerformanceLevel >= 0.7) PerformanceLevelFactor = 1.20;
        else if (this.PerformanceLevel >= 0.6) PerformanceLevelFactor = 1.10;
        else if (this.PerformanceLevel >= 0.5) PerformanceLevelFactor = 1.00;
        else if (this.PerformanceLevel >= 0.4) PerformanceLevelFactor = 0.95;
        else if (this.PerformanceLevel >= 0.3) PerformanceLevelFactor = 0.90;
        else if (this.PerformanceLevel >= 0.2) PerformanceLevelFactor = 0.85;
        else if (this.PerformanceLevel <= 0.2) PerformanceLevelFactor = 0.80;
        else                                   PerformanceLevelFactor = 1.00;

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
        this.effectiveSalary = (((this.initialSalary * roleFactor ) * PerformanceLevelFactor )* experienceFactor);
    }

    @Override
    public void assignPerformanceLevel(double PerformanceLevel) {
        this.PerformanceLevel = PerformanceLevel; 
        this.salaryCalculator();
    }
  
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID:"+ this.id);
        System.out.println("Name:"+ this.name);
        System.out.println("Age:"+ this.age);
        System.out.println("Department:"+ this.department);
        System.out.println("Role:"+ this.role);
        System.out.println("Salary:"+ this.effectiveSalary);
    }

    public void increaseSalary(){
        this.initialSalary = (this.initialSalary * 1.2 );
        this.salaryCalculator();
    }

    public void mappingEmployees() {
        EmployeesMap.put(this.name,this);
        this.salaryCalculator();    
    }
    
    public void changeRole(String role1){
        if (this.role.equals(role1)) {System.out.println("The Role you entered is identical to the previous role.");}
        else {
            for (String roleIterator: Roles.rolelist)
                if (roleIterator.equals(role1)) {
                    this.role = role1;
                    Roles roleobj = Roles.RolesMap.get(role1);
                    roleobj.addInitiatedEmployeeToRole(this.name);
    }
            if (this.role.equals(role1)) {System.out.println("Role was changes successfully");}
            else {{System.out.println("Role does not exist in the role list, you need to create the role then add emplotyees to it.");}}
        }
        this.salaryCalculator();
    }
    
    public void changeDepartment(String department1) {
        if (this.department.equals(department1)) {System.out.println("The Department you entered is identical to the previous Department.");}
        else {
            for (String departmentIterator: Departments.DepartmentList)
                if (departmentIterator.equals(department1)) {
                    this.department = department1;
                    Departments departmentobj = Departments.DepartmentMap.get(department1);
                    departmentobj.addEmployeeToDepartment(this.name);
                }
            if (this.department.equals(department1)) {System.out.println("Department was changes successfully");}
            else {System.out.println("Department does not exist in the Department list, you need to create the Deparment then add emplotyees to it.");}
        }
        this.salaryCalculator();
    }
    
    public int getEmployeeId() {
        return this.id;
    }
    
    public String getEmployeename() {
        return this.name;
    }
    
    public int getEmployeeage() {
        return this.age;
    }
    
    static public int getNumberOfAllEmployees() {
        return Employee.numberOfAllEmployees;
    }

}

//Classes.....................................................
class ManagerEmployee extends Employee {

    public ManagerEmployee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1) {
        super(name1,age1, department1,  role1,  initialSalary1, yearsOfExperience1);
    }
    @Override
    public void promote() {
        switch (this.role) {
            case "CEO" -> System.out.println("You can not promote a CEO");
            case "COO" -> {
                this.role = "CEO";
                System.out.println("COO was promoted to CEO");
            }
            case "DepartmentManager" -> {
                this.role = "COO";
                System.out.println("Department Manager was promoted to COO");
            }
            default -> System.out.println("The Manager role is unknown");
        }
        this.salaryCalculator();
    
    }

    @Override
    public void demote() {
        switch (this.role) {
            case "CEO" -> {
                this.role = "COO";
                System.out.println("Employee was demoted to COO");
            }
            case "COO" -> {
                this.role = "DepartmentManager";
                System.out.println("Employee was demoted to DepartmentManager");
            }
            case "DepartmentManager" -> {
                System.out.println("You can not demote a manager to a non-managerial position");
            }
            default -> System.out.println("The managerial role is unknown");
        }
        this.salaryCalculator();

    }

    @Override
    public void increaseSalary(){
        this.initialSalary = (this.initialSalary * 1.3 );
        this.salaryCalculator();

    }

}


class RegularEmployee extends Employee {


    public RegularEmployee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1) {
        super(name1,age1, department1,  role1,  initialSalary1, yearsOfExperience1);
    }

    @Override
    public void promote() {
        switch (this.role) {

            case "ManagerAssisstant" -> {
                System.out.println("You cant promote a regular employee to a managerial position");
            }
            case "Supervisor" -> {
                this.role = "ManagerAssisstant";
                System.out.println("Employee was promoted to ManagerAssisstant");
            }
            case "Specialist" -> {
                this.role = "Supervisor";
                System.out.println("Employee was promoted to Supervisor");
            }
            case "Worker" -> {
                this.role = "Specialist";
                System.out.println("Employee was promoted to Specialist");
            }
            default -> System.out.println("Employee role is unknown");
        }
        this.salaryCalculator();
        
    
    }

    @Override
    public void demote() {
        switch (this.role) {
            case "ManagerAssisstant" -> {
                this.role = "Supervisor";
                System.out.println("Employee was demoted to Supervisor");
            }
            case "Supervisor" -> {
                this.role = "Specialist";
                System.out.println("Employee was demoted to Specialist");
            }
            case "Specialist" -> System.out.println("You can not demote a Specialist");
            case "Worker" -> System.out.println("You can not demote a worker");
            default -> System.out.println("Employee role is unknown");
        }
        this.salaryCalculator();

    }

    @Override
    public void increaseSalary(){
        this.initialSalary = (this.initialSalary * 1.1 );
        this.salaryCalculator();

    }

}

