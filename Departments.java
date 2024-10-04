import java.util.ArrayList;
import java.util.List;

class Departments{

//////////Vars
    int ID;
    String Name;
    List<String> members = new ArrayList<>();

///////Constructor
    public Departments(int V1, String V2) {
        this.ID = V1;
        this.Name = V2;
    }

//////////Methods
    public void addEmployee( String member) {

        this.members.add(member);
    
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