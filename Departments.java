import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Departments{

//////////Vars
    int ID;
    String Name;
    List<String> members = new ArrayList<>();
    static public List<String> DepartmentList = new ArrayList<>();
    static public Map<String, Departments> DepartmentMap = new HashMap<>();

///////Constructor
    public Departments(String V1) {
        int counter = (1 + (int)DepartmentList.size());
        this.ID = counter;
        this.Name = V1;
        DepartmentList.add(V1);

    }

//////////Methods
    public void addEmployee( String member) {
        this.members.add(member);
    }

    public void mappingDepartments(Departments obj) {
        DepartmentMap.put(obj.Name,obj);

    }

    public void removeEmployee(String member) {

        this.members.remove(member);
    
    }

    public void getDepartmentDetails() {
        System.out.println("Department ID:" + ID);
        System.out.println("Department Name:" + Name);
        System.out.println("Department Memebers:" + members);

    }
    
}