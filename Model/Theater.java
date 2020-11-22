package Model;

import java.util.ArrayList;

public class Theater {
    int id;
    String name;
    ArrayList<Showtime> schedule;
    String address;
    public Theater(int id,String name,String address){
        this.name=name;
        this.id=id;
        this.address=address;
        this.schedule=new ArrayList<Showtime>();
    }
    public Theater(int id,String name,String address,ArrayList<Showtime> schedule) {
        this.name=name;
        this.id=id;
        this.address=address;
        this.schedule=schedule;
    }
    public void add_Showtime(Showtime showtime)
    {
        this.schedule.add(showtime);
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public int getID()
    {
        return id;
    }
}
