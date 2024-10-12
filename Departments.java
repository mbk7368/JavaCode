import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Departments{

//////////Vars
    final int ID;
    final String name;
    List<String> members = new ArrayList<>();
    static public List<String> DepartmentList = new ArrayList<>();
    static public Map<String, Departments> DepartmentMap = new HashMap<>();

///////Constructor
    public Departments(String V1) {
        int counter = (1 + (int)DepartmentList.size());
        this.ID = counter;
        this.name = V1;
        DepartmentList.add(V1);

    }

//////////Methods
    public void addEmployeeToDepartment( String member) {
        this.members.add(member);
    }

    public void deleteDepartment() {
        
    }


    public void mappingDepartments() {
        DepartmentMap.put(this.name,this);

    }

    public void removeEmployee(String member) {

        this.members.remove(member);
    
    }

    public void getDepartmentDetails() {
        System.out.println("Department ID:" + ID);
        System.out.println("Department Name:" + name);
        System.out.println("Department Memebers:" + members);

    }
    
}