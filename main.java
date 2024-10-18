


class main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments("IT");
        itDept.mappingDepartments();


        Employee John = new Employee("John", 28, "IT", "Specialist", 40000, 2);
        John.mappingEmployees();

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






