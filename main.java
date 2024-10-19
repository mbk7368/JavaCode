




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


        //testing department methods 

        IT.addEmployeeToDepartment(WillFing.getEmployeename());
        IT.removeEmployee(MattDaemon.getEmployeename());
        IT.getDepartmentDetails(); 

        //testing employee methods

        /* getNumberOfAllEmployees()
         * getEmployeeage()
         * getEmployeename()
         * getEmployeeId()
         * changeDepartment(String department1)
         * changeRole(String role1)
         * mappingEmployees()
         * increaseSalary()
         * displayEmployeeDetails()
         * assignPerformanceLevel(double PerformanceLevel)
         * salaryCalculator()
         * demote()
         * promote()
         */



         //testing HRManager Methods

         /* promote()
          * demote()
            salaryCalculator()
            assignPerformanceLevel(double PerformanceLevel1)
            displayEmployeeDetails()
            hireEmployee (String name1, int age1, String department1, String role1, double initialSalary1,int yearsOfExperience1)
            fireEmployee (String name1)
            promoteEmployee (Employee promotedEmployee)
            demoteEmployee (Employee demotedEmployee)
            transferEmployee(Employee transferedEmployee, Departments newDept)
            displayAllEmployees ()
            displayManagerDetails()
            getEffectiveSalary()
          */
        

          //Testing Manager Methods

          /* 
           * 
           * 
           * 
           * 
           * 
           * 
           * 
           * 
           * 
           */
    }
}






