


class Main {
    
    public static void main(String[] args) {

        //Creating Departments
        Departments itDept = new Departments("IT");
        itDept.mappingDepartments();
        Departments HR = new Departments("Human Resources");
        HR.mappingDepartments();
        Departments Accounting = new Departments("Accounting");
        Accounting.mappingDepartments();
        Departments Marketing = new Departments("Marketing");
        Marketing.mappingDepartments();

        //Creating Roles
        Roles CEO = new Roles("CEO");
        CEO.mappingRoles();
        Roles COO = new Roles("COO");
        COO.mappingRoles();
        Roles DepartmentManager = new Roles("Department Manager");
        DepartmentManager.mappingRoles();
        Roles ManagerAssisstant = new Roles("ManagerAssisstant");
        ManagerAssisstant.mappingRoles();
        Roles Supervisor = new Roles("Supervisor");
        Supervisor.mappingRoles();
        Roles Specialist = new Roles("Specialist");
        Specialist.mappingRoles();
        Roles Worker = new Roles("Worker");
        Worker.mappingRoles();

        //Creating HRManager

        HRManager SarahWalker = new HRManager ( "Sarah Walker", 5000.0);
        SarahWalker.MappingHRManager();
        HRManager RobertSapolsky = new HRManager ( "Robert Sapolsky", 5000.0);
        RobertSapolsky.MappingHRManager();

        //Creating Employees



        Employee JohnMane = new Employee("John Mane", 28, "IT", "Specialist", 4000, 2);
        JohnMane.mappingEmployees();

        ManagerEmployee MarryCurry  = new ManagerEmployee("Marry Curry", 33, "IT", "DepartmentManager", 7000, 5);
        MarryCurry.mappingEmployees();

        RegularEmployee MattDaemon = new RegularEmployee ("Matt Daemon", 38, "IT", "Worker", 3000, 1);
        MattDaemon.mappingEmployees();







        itDept.addEmployeeToDepartment("noor");
        itDept.addEmployeeToDepartment("Daniel");
        itDept.addEmployeeToDepartment("john");
        itDept.addEmployeeToDepartment("tony");
        itDept.removeEmployee("noor");
        itDept.removeEmployee("tony");

        itDept.getDepartmentDetails();

        JohnMane.assignPerformanceLevel(0.7);

        
    }
}






