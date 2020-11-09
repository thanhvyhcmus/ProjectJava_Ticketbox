package Model;

 public abstract class User {
    protected String id;
    protected String fullname;
    protected String doB;
    protected String phone;
    protected String username;
    protected String password;
   
    
    User() {
        id="";
        fullname="";
        doB="";
        phone="";
        username="";
        password="";
    }
    User(String id,String fullname, String doB,String phone,String username, String password) {
        this.id = id;
        this.fullname = fullname;
        this.doB = doB;
        this.phone = phone;
        this.username=username;
        this.password=password;
    }
    public boolean check_password(String pass)
    {
        if (pass.equals(password))
            return true;
        return false;
    }
    public boolean check_username(String username)
    {
        if(username.equals(this.username))
            return true;
        return false;
    }
    public boolean is_admin()
    {
        if(username.equals("admin"))
            return true;
        return false;
    }
    public void set_doB(String doB)
    {
        this.doB = doB;
    }   
    public void set_full_name(String full_name)
    {
        this.fullname=full_name;
    }
    public String get_doB()
    {
        return this.doB;
    }
    public String get_fullname()
    {
        return this.fullname;
    }
    public String get_phone(){
        return phone;
    }
    public String get_id()
    {
        return id;
    }
}
