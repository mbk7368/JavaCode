import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Roles {


    ///vars........................
    int id;
    static int rolesCounter = 0;
    String name;
    double salaryMultiplier;
    List<String> responsibilities = new ArrayList<>();
    List<String> roleBasedEmployeelist = new ArrayList<>();

    static List<String> rolelist = new ArrayList<>();
    static public Map<String, Roles> RolesMap = new HashMap<>();


    ///constructor.................
    public Roles(String name1) {
        rolesCounter += 1;
        this.id = rolesCounter;
        this.name = name1;
        this.responsibilities = new ArrayList<>();
        this.roleBasedEmployeelist = new ArrayList<>();



    }






    ///methods....................

    public void getRoleDetails(){
        
    }

    public void AssignRole(){

    }

    public void changeRole(){

    }

    public void addResposibility(String res){

    }

    public void getRoleDetails() {
        
    }

    public void addEmployee(String V1){
        this.roleBasedEmployeelist.add(V1);
    }

    public void mappingRoles(Roles obj){
        RolesMap.put(obj.name, obj);
    }




    
}
