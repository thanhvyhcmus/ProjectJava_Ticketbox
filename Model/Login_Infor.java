package Model;

 public abstract class Login_Infor {
    protected String username;
    protected String password;
   
    
    

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
}
