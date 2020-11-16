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
    public boolean checkPassword(String pass)
    {
        if (pass.equals(password))
            return true;
        return false;
    }
    public boolean checkUserName(String username)
    {
        if(username.equals(this.username))
            return true;
        return false;
    }
    public boolean IsAdmin()
    {
        if(username.equals("admin"))
            return true;
        return false;
    }
    public void setUserName(String username)
    {
        this.username = username;
    }
    public void setDoB(String doB)
    {
        this.doB = doB;
    }   
    public void setFullName(String full_name)
    {
        this.fullname=full_name;
    }
    public String getDoB()
    {
        return this.doB;
    }
    public String getFullname()
    {
        return this.fullname;
    }
    public String getPhone(){
        return phone;
    }
    public String getId()
    {
        return id;
    }
}
