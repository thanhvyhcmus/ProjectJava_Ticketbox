package Model;

 public class User {
    protected int id;
    protected String fullname;
    protected String doB;
    protected String phone;
    protected String username;
    protected String password;
    protected byte isadmin;
   
    
    User() {
        id=0;
        fullname="";
        doB="";
        phone="";
        username="";
        password="";
    }
    User(int id,String fullname, String doB,String phone,String username, String password) {
        this.id = id;
        this.fullname = fullname;
        this.doB = doB;
        this.phone = phone;
        this.username=username;
        this.password=password;
    }
    public User(int id,String fullname, String doB,String phone,String username, String password,byte isadmin) {
        this.id = id;
        this.fullname = fullname;
        this.doB = doB;
        this.phone = phone;
        this.username=username;
        this.password=password;
        this.isadmin = isadmin;
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
        if(isadmin==1)
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
    public int getID()
    {
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public byte getIsadmin(){
        return isadmin;
    }
    public String toString(){
        return Integer.toString(id)+" "+fullname+" "+username+" "+password+" "+phone+" "+isadmin;
    }
}
