


class main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments("IT");
        itDept.mappingDepartments();

        Employee JohnMane = new Employee("John Mane", 28, "IT", "Specialist", 4000, 2);
        JohnMane.mappingEmployees();

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

        John.assignPerformanceLevel(0.7);

        
    }
}






