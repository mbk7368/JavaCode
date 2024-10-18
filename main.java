


class Main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments("IT");
        itDept.mappingDepartments();

        Employee JohnMane = new Employee("John Mane", 28, "IT", "Specialist", 4000, 2);
        JohnMane.mappingEmployees();

        ManagerEmployee MarryCurry  = new ManagerEmployee("Marry Curry", 33, "IT", "DepartmentManager", 7000, 5);
        MarryCurry.mappingEmployees();

        RegularEmployee MattDaemon = new RegularEmployee ("Matt Daemon", 38, "IT", "Worker", 3000, 1);
        MattDaemon.mappingEmployees();

        HRManager SarahWalker = new HRManager ( "Sarah Walker", 5000.0);
        SarahWalker.MappingHRManager();

        Roles Specialist = new Roles("Specialist");
        Specialist.mappingRoles();





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






