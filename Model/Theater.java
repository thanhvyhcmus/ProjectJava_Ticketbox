package Model;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<Showtime> schedule;
    Theater(String name) {
        this.name=name;
        schedule=new ArrayList<Showtime>();
    }
    public void add_Showtime(Showtime showtime)
    {
        this.schedule.add(showtime);
    }
    public Showtime search_Showtime(String name) {
        for (Showtime showtime : schedule) {
            if(showtime.check_title(name))
                return showtime;
        }
        return null;
    }
    public void delete_Showtime(String name) {
        Showtime temp =search_Showtime(name);
        if (temp != null) {
            schedule.remove(temp);
        }
    }
}
