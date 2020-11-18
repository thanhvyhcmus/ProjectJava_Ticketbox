package Model;

public class Admin extends User {
    public Admin(String id,String fullname, String doB,String phone,String username, String password){
        super(id, fullname, doB, phone, username, password);
        isadmin=0;
    }    
}

