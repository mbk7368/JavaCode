import java.util.HashMap;
import java.util.Map;


class Employee{

    /////////vars
    int id;
    String name;
    int age;
    String role;
    String department;
    int salary;
    static public Map<String, Departments> DepartmentMap = new HashMap<>();

    ////////constructor....................................................................................
    public void Employee(int id1, String name1, int age1, String department1, String role1, int salary1 ){
        this.id = id1;
        this.name = name1;
        this.age = age1;
        this.role = role1;
        this.salary = salary1;
        this.department = department1;


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
            case "CEO":
                System.out.println("You can not promote a CEO");
                break;        
            case "COO":
                object.role = "CEO";
                System.out.println("Employee was promoted to CEO");
                break;
            case "DepartmentManager":
                object.role = "COO";
                System.out.println("Employee was promoted to COO");
                break;
            case "ManagerAssisstant":
                object.role = "DepartmentManager";
                System.out.println("Employee was promoted to DepartmentManager");
                break;
            case "Supervisor":
                object.role = "ManagerAssisstant";
                System.out.println("Employee was promoted to ManagerAssisstant");
                break;
            case "Specialist":
                object.role = "Supervisor";
                System.out.println("Employee was promoted to Supervisor");
                break;
            case "Worker":
                object.role = "Specialist";
                System.out.println("Employee was promoted to Specialist");
                break;
            default:
                System.out.println("Employee role is unknown");
                break;
        }

    }
    public void demote(Employee object) {
        switch (object.role) {
            case "CEO":
                object.role = "COO";
                System.out.println("Employee was demoted to COO");
                break;        
            case "COO":
                object.role = "DepartmentManager";
                System.out.println("Employee was demoted to DepartmentManager");
                break;
            case "DepartmentManager":
                object.role = "ManagerAssisstant";
                System.out.println("Employee was demoted to ManagerAssisstant");
                break;
            case "ManagerAssisstant":
                object.role = "Supervisor";
                System.out.println("Employee was demoted to Supervisor");
                break;
            case "Supervisor":
                object.role = "Specialist";
                System.out.println("Employee was demoted to Specialist");
                break;
            case "Specialist":
                System.out.println("You can not demote a Specialist");
                break;
            case "Worker":
                System.out.println("You can not demote a worker");
                break;
            default:
                System.out.println("Employee role is unknown");
                break;
        }

    }

    public void increaseSalary(Employee object){
        int x = object.salary;
        object.salary = (object.salary+ (int) Math.round( 0.1 * x ));
    }
    public void displayDetails(Employee object) {
        System.out.println("Employee Details:");
        System.out.println("ID:"+ object.id);
        System.out.println("Name:"+ object.name);
        System.out.println("Age:"+ object.age);
        System.out.println("Department:"+ object.department);
        System.out.println("Role:"+ object.role);
        System.out.println("Salary:"+ object.salary);
    }

}


//manager class
class Manager {
    

    public void addEmployee () {
        System.out.println("adding an employee by the manager");
    }
}




// regular class
class Regular {

}

