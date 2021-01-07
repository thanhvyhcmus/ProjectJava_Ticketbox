package Model;

import java.util.ArrayList;
// import Model.Seat;
public class Showtime {
    int id;
    Film film;
    Theater theater;
    String startTime;
    ArrayList<Seat> seats; // Nếu là false có nghĩa là còn chỗ trống
    String date;
    public Showtime( int id,Theater theater,Film film,String startTime) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = null;
    }
    public Showtime( int id,Theater theater,Film film,String startTime,String date) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = null;
        this.date=date;
    }
    public Showtime( int id,Theater theater,Film film,String startTime,int row,int col) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = new ArrayList<Seat>();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                seats.add(new Seat(id,i,j,0,0));
            }
        }
    }
    public Showtime( int id,Theater theater,Film film,String startTime,int row,int col,int price) {
        this.id=id;
        this.film=film;
        this.startTime=startTime;
        this.theater=theater;
        seats = new ArrayList<Seat>();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                seats.add(new Seat(id,i,j,0,price));
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
    public String getStartTime()
    {
        return startTime;
    }
    public String getDate()
    {
        return date;
    }
    public Film getFilm(){ return film;}
    public Theater getTheater() {return theater;}
    public void setID(int id)
    {
        this.id = id;
    }
    public void setSeats(ArrayList<Seat> seats )
    {
        this.seats = seats;
    }    
    public String toString(){
        return Integer.toString(id)+" "+theater.getName()+" "+film.getTitle()+" "+startTime;
    }

}
