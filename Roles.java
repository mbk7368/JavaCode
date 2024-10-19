import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Roles {

    ///vars........................
    int id;
    String name;
    List<String> responsibilities = new ArrayList<>();
    List<String> roleBasedEmployeelist = new ArrayList<>();

    static int rolesCounter = 0;
    static List<String> rolelist = new ArrayList<>();
    static public Map<String, Roles> RolesMap = new HashMap<>();

    ///constructor.................
    public Roles(String name1) {
        rolesCounter += 1;
        this.id = rolesCounter;
        this.name = name1;
        this.responsibilities = new ArrayList<>();
        this.roleBasedEmployeelist = new ArrayList<>();
        rolelist.add(name1);
    }

    ///methods....................

    public void addResposibility(String res){
        this.responsibilities.add(res);
    }

    public void addEmployeeToRole(String V1){
        this.roleBasedEmployeelist.add(V1);
    }

    public void mappingRoles(){
        RolesMap.put(this.name, this);
    }

    public void getRoleDetails(){
        System.out.println("Role ID:"+ this.id);
        System.out.println("Role Name:"+ this.name);
        System.out.println("Role Responsibilities:");
        System.out.println(this.responsibilities);
        System.out.println("Role Employees:");
        System.out.println(this.roleBasedEmployeelist);
        
    }



    
}
