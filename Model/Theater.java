package Model;

import java.util.ArrayList;

public class Theater {
    private int id;
    private String name;
    private ArrayList<Showtime> schedule;
    private String address;
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
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return name+" "+address;
    }
}
