package Model;

public class Customer  extends Login_Infor{
    int id;
    String full_name;
    String doB;
    int points;
    Customer()
    {
        id = 0;
        full_name = null;
        doB = null;
        points = 0;
    }
    Customer(int id, String full_name, String doB)
    {
        this.id = id;
        this.full_name = full_name;
        this.doB = doB;
        points = 0;
    }
    public void addPoints(int points)
    {
        this.points += points;
    }
    public int get_points()
    {
        return points;
    }
    public void set_full_name(String full_name)
    {
        this.full_name = full_name;
    }
    public void set_doB(String doB){
        this.doB = doB;
    }
}
