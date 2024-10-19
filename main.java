




class Main {
    
    public static void main(String[] args) {

        //Creating Departments
        Departments itDeparttment = new Departments("IT");
        itDeparttment.mappingDepartments();
        Departments MarketingDepartment = new Departments("Marketing");
        MarketingDepartment.mappingDepartments();

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
        
        RegularEmployee MattDaemon = new RegularEmployee ("Matt Daemon", 38, "IT", "Worker", 3000, 1);
        MattDaemon.mappingEmployees();
        
        RegularEmployee WillFing = new RegularEmployee ("Will Fing", 32, "Marketing", "ManagerAssisstant", 6000, 5);
        WillFing.mappingEmployees();

        ManagerEmployee MarryCurry  = new ManagerEmployee("Marry Curry", 33, "Merketing", "DepartmentManager", 7000, 5);
        MarryCurry.mappingEmployees();



        //testing all methods

        itDeparttment.addEmployeeToDepartment(WillFing.getEmployeename());
        itDeparttment.removeEmployee(MattDaemon.getEmployeename());
        itDeparttment.getDepartmentDetails();


        
        /*  public void getDepartmentDetails()
         * public void deleteDepartment()
         *  public void mappingDepartments()
         * removeEmployee(String member)
         * public void addEmployeeToDepartment
         * 
         * 
         * 
         * 
         * 
         * 
         */


        
    }
}






