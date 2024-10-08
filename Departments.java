import java.util.ArrayList;
import java.util.List;

class Departments{

//////////Vars
    int ID;
    String Name;
    int counter;
    List<String> members = new ArrayList<>();
    List<String> DepartmentList = new ArrayList<>();

///////Constructor
    public Departments(String V1) {
        counter = (1 + (int)DepartmentList.size());
        this.ID = this.counter;
        this.Name = V1;
        DepartmentList.add(V1);
        this.counter += 1;
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