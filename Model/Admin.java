package Model;

public class Admin extends User {
    public Admin(int id,String fullname, String doB,String phone,String username, String password){
        super(id, fullname, doB, phone, username, password);
        isadmin=1;
    }

    @Override
    public Object[] getObject(){
        return new Object[]{getID(),getFullname(),getDoB(),getUsername(),getPhone(),"","",1};
    }
    public String getGenre(){
        return "";
    }
}

