


class main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments("IT");
        itDept.mappingDepartments(itDept);


        Employee John = new Employee("John", 28, "IT", "Specialist", 40000, 2);
        John.mappingEmployees(John);

        Roles specialist = new Roles();
        specialist.mappingRoles(specialist);

        
        itDept.addEmployee("noor");
        itDept.addEmployee("Daniel");
        itDept.addEmployee("john");
        itDept.addEmployee("tony");

        itDept.removeEmployee("noor");
        itDept.removeEmployee("tony");

        itDept.getDepartmentDetails();

        John.assignPerformanceLevel(John, 0.7);

        
    }
}






