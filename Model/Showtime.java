package Model;

import java.util.ArrayList;

public class Showtime {
    int id;
    Film film;
    Theater theater;
    String startTime;
    ArrayList<ArrayList<Boolean>> seats; // Nếu là false có nghĩa là còn chỗ trống

    public Showtime( int id,Theater theater,Film film,String startTime) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = new ArrayList<ArrayList<Boolean>>();
    }
    
    public Showtime( int id,Theater theater,Film film,String startTime,int row,int col) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = new ArrayList<ArrayList<Boolean>>();
        for(int i=0;i<row;i++) {
            seats.add(new ArrayList<Boolean>());
            for(int j=0;j<col;j++) {
                seats.get(i).add(false);
            }
        }
    }
    public Showtime()
    {
        id=0;
        film=null;
        theater=null;
        startTime="";
        seats=null;
    }
    public void setFilm(Film film)
    {
        this.film = film;
    }
    public void setTheater(Theater theater)
    {
        this.theater = theater;
    }
    public int getID()
    {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }

    

}
