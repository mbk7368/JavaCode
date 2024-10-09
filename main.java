

class Main {
    
    public static void main(String[] args) {

        Departments itDept = new Departments("IT");
        
        itDept.addEmployee("noor");
        itDept.addEmployee("Daniel");
        itDept.addEmployee("john");
        itDept.addEmployee("tony");

        itDept.removeEmployee("noor");
        itDept.removeEmployee("tony");

        itDept.getDepartmentDetails();

        
    }
}






