



class main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments(101, "IT");
        
        itDept.addEmployee("noor");
        itDept.addEmployee("Daniel");
        itDept.addEmployee("john");
        itDept.addEmployee("tony");

        itDept.removeEmployee("noor");
        itDept.removeEmployee("tony");

        itDept.getDepartmentDetails();

        
    }
}






