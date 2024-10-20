
class main {
    
    public static void main(String[] args) {

        //Creating Departments
        Departments IT = new Departments("IT");
        IT.mappingDepartments();
        Departments Marketing = new Departments("Marketing");
        Marketing.mappingDepartments();

        //Creating Roles
        Roles CEO = new Roles("CEO");
        CEO.mappingRoles();
        Roles COO = new Roles("COO");
        COO.mappingRoles();
        Roles DepartmentManager = new Roles("DepartmentManager");
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
        
        RegularEmployee MattDaemon = new RegularEmployee ("Matt Daemon", 38, "IT", "Worker", 3000, 1);
        MattDaemon.mappingEmployees();
        
        RegularEmployee WillFing = new RegularEmployee ("Will Fing", 32, "Marketing", "ManagerAssisstant", 6000, 5);
        WillFing.mappingEmployees();

        ManagerEmployee MarryCurry  = new ManagerEmployee("Marry Curry", 33, "Marketing", "DepartmentManager", 7000, 5);
        MarryCurry.mappingEmployees();

/*         //testing department methods 
        IT.addEmployeeToDepartment(WillFing.getEmployeename());
        IT.removeEmployee(MattDaemon.getEmployeename());
        IT.getDepartmentDetails(); 

        //testing employee methods

        Employee.getNumberOfAllEmployees();
        MarryCurry.getEmployeeage();
        MarryCurry.getEmployeename();
        MarryCurry.getEmployeeId();
        MarryCurry.changeDepartment("IT");
        MarryCurry.changeRole("DepartmentManager");
        MarryCurry.displayEmployeeDetails();
        MarryCurry.increaseSalary();
        MarryCurry.displayEmployeeDetails();
        MarryCurry.assignPerformanceLevel(0.7);
        MarryCurry.displayEmployeeDetails();
        MarryCurry.promote();
        MarryCurry.displayEmployeeDetails();
        MarryCurry.demote();
        MarryCurry.displayEmployeeDetails();
    */     



        //testing HRManager Methods


        SarahWalker.promote();
        SarahWalker.demote();
        SarahWalker.displayManagerDetails();
        SarahWalker.salaryCalculator();
        SarahWalker.displayManagerDetails();
        SarahWalker.assignPerformanceLevel(0.7);
        SarahWalker.displayManagerDetails();
        SarahWalker.displayEmployeeDetails();
        SarahWalker.getEffectiveSalary();
        SarahWalker.hireEmployee ("NoorKanaan", 28, "IT", "Specialist", 4200,2);
        SarahWalker.displayAllEmployees ();
        Employee.EmployeesMap.get("NoorKanaan").displayEmployeeDetails();
        SarahWalker.promoteEmployee (Employee.EmployeesMap.get("NoorKanaan"));
        Employee.EmployeesMap.get("NoorKanaan").displayEmployeeDetails();
        SarahWalker.demoteEmployee (Employee.EmployeesMap.get("NoorKanaan"));
        Employee.EmployeesMap.get("NoorKanaan").displayEmployeeDetails();
        SarahWalker.transferEmployee(Employee.EmployeesMap.get("NoorKanaan"), Marketing);
        Employee.EmployeesMap.get("NoorKanaan").displayEmployeeDetails();
        SarahWalker.fireEmployee ("NoorKanaan");
        Employee.EmployeesMap.get("NoorKanaan").displayEmployeeDetails();
        SarahWalker.displayAllEmployees ();
         
        

          //Testing ManagerEmployee Methods

          /* 
           * promote()
           * demote()
           * increaseSalary()
           */

          //Testing RegularEmployee Methods

          /* 
           * promote()
           * demote()
           * increaseSalary()
           */

          //Testing Roles Methods





           /* 
            * addResposibility(String res)
            * addEmployeeToRole(String V1)
            * getRoleDetails()
            */

    }
}






