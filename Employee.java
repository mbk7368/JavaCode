import java.util.HashMap;
import java.util.Map;


class Employee{

    /////////vars
    int id;
    String name;
    int age;
    String role;
    String department;
    int initialSalary;
    int yearsOfExperience;
    double PerformanceLevel;
    static public Map<String, Departments> DepartmentMap = new HashMap<>();

    ////////constructor....................................................................................
    public Employee (int id1, String name1, int age1, String department1, String role1, int salary1,int yearsOfExperience1){
        this.id = id1;
        this.name = name1;
        this.age = age1;
        this.role = role1;
        this.initialSalary = salary1;
        this.department = department1;
        this.PerformanceLevel = 0.5;
        this.yearsOfExperience = yearsOfExperience1;


        boolean DepartmentExist = false;
        for (String dept : Departments.DepartmentList){
            if ( dept.equals(department1)  ){
                DepartmentExist = true;
            }
        }
        if (DepartmentExist) {
            Departments Department = DepartmentMap.get(department1);
            if (Department != null) {
                Department.addEmployee(name1);
            } else {
                System.out.println("Error: Department object not found");
            }

        } else {
            System.out.println("Department does not exist");

        }

    }

    ///////Methods
    public void promote(Employee object) {
        switch (object.role) {
            case "CEO" -> System.out.println("You can not promote a CEO");
            case "COO" -> {
                object.role = "CEO";
                System.out.println("Employee was promoted to CEO");
            }
            case "DepartmentManager" -> {
                object.role = "COO";
                System.out.println("Employee was promoted to COO");
            }
            case "ManagerAssisstant" -> {
                object.role = "DepartmentManager";
                System.out.println("Employee was promoted to DepartmentManager");
            }
            case "Supervisor" -> {
                object.role = "ManagerAssisstant";
                System.out.println("Employee was promoted to ManagerAssisstant");
            }
            case "Specialist" -> {
                object.role = "Supervisor";
                System.out.println("Employee was promoted to Supervisor");
            }
            case "Worker" -> {
                object.role = "Specialist";
                System.out.println("Employee was promoted to Specialist");
            }
            default -> System.out.println("Employee role is unknown");
        }

    }
    public void demote(Employee object) {
        switch (object.role) {
            case "CEO" -> {
                object.role = "COO";
                System.out.println("Employee was demoted to COO");
            }
            case "COO" -> {
                object.role = "DepartmentManager";
                System.out.println("Employee was demoted to DepartmentManager");
            }
            case "DepartmentManager" -> {
                object.role = "ManagerAssisstant";
                System.out.println("Employee was demoted to ManagerAssisstant");
            }
            case "ManagerAssisstant" -> {
                object.role = "Supervisor";
                System.out.println("Employee was demoted to Supervisor");
            }
            case "Supervisor" -> {
                object.role = "Specialist";
                System.out.println("Employee was demoted to Specialist");
            }
            case "Specialist" -> System.out.println("You can not demote a Specialist");
            case "Worker" -> System.out.println("You can not demote a worker");
            default -> System.out.println("Employee role is unknown");
        }

    }

    public void increaseSalary(Employee object){
        int x = object.initialSalary;
        object.initialSalary = (object.initialSalary+ (int) Math.round( 0.1 * x ));
    }
    public void displayDetails(Employee object) {
        System.out.println("Employee Details:");
        System.out.println("ID:"+ object.id);
        System.out.println("Name:"+ object.name);
        System.out.println("Age:"+ object.age);
        System.out.println("Department:"+ object.department);
        System.out.println("Role:"+ object.role);
        System.out.println("Salary:"+ object.initialSalary);
    }

    public void salaryMultiplier(Employee object) {
        int x = object.initialSalary;
        double roleFactor;
        double experienceFactor;
        double PerformanceLevelMonetizer
        switch (object.role) {
            case "CEO" -> {roleFactor = 2; }
            case "COO" -> { roleFactor = 1.9; }
            case "DepartmentManager" -> { roleFactor = 1.8; }
            case "ManagerAssisstant" -> { roleFactor = 1.6; }
            case "Supervisor" -> { roleFactor = 1.4; }
            case "Specialist" -> { roleFactor = 1.2; }
            case "Worker" -> { roleFactor = 1.1; }
            default -> { roleFactor = 1.01; }
        }
        if      (object.PerformanceLevel >= 1.0) PerformanceLevelMonetizer = 1.50;
        else if (object.PerformanceLevel >= 0.9) PerformanceLevelMonetizer = 1.40;
        else if (object.PerformanceLevel >= 0.8) PerformanceLevelMonetizer = 1.30;
        else if (object.PerformanceLevel >= 0.7) PerformanceLevelMonetizer = 1.20;
        else if (object.PerformanceLevel >= 0.6) PerformanceLevelMonetizer = 1.10;
        else if (object.PerformanceLevel >= 0.5) PerformanceLevelMonetizer = 1.00;
        else if (object.PerformanceLevel >= 0.4) PerformanceLevelMonetizer = 1.95;
        else if (object.PerformanceLevel >= 0.3) PerformanceLevelMonetizer = 1.90;
        else if (object.PerformanceLevel >= 0.2) PerformanceLevelMonetizer = 1.85;
        else if (object.PerformanceLevel >= 0.1) PerformanceLevelMonetizer = 1.80;
        else                                     PerformanceLevelMonetizer = 1.00;

        switch (object.yearsOfExperience) {
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
    


    }
    public void assignPerformance(Employee object, double PerformanceLevel) {
        object.PerformanceLevel = PerformanceLevel; 
    }

}


//Classes.....................................................
class Manager {
    

}


class Regular {

}

