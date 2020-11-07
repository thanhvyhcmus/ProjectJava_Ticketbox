package Model;

public class Showtime {
    Film film;
    String startTime;
    boolean[][] seats; // Nếu là false có nghĩa là còn chỗ trống

    public Showtime( Film film,String startTime,int row,int col) {
        this.film=film;
        this.startTime=startTime;
        seats = new boolean[row][col];
        for(int i=0;i<seats.length;i++) {
            for(int j=0;j<col;j++) {
                seats[i][j]=false;
            }
        }
    }
    public boolean buy_ticket(int row, int col) {
        if(row>seats.length ||col>seats[0].length ||row<0 ||col<0)
            return false;
        else
        {
            if(seats[row][col]==false)
                {
                    seats[row][col]=true;
                    return true;
                }
            else   
                return false;
        }
    }
    public boolean cancel_ticket(int row, int col) {
        if(row>seats.length ||col>seats[0].length ||row<0 ||col<0)
            return false;
        else
        {
            if(seats[row][col]==true)
                {
                    seats[row][col]=false;
                    return true;
                }
            else   
                return false;
        }
    }
    public String get_startTime(){
        return startTime;
    }
    public String get_title(){
        return film.get_title();
    }
    public boolean check_available_seat(int row, int col) {
        if(row>seats.length ||col>seats[0].length ||row<0 ||col<0)
            return false;
        return seats[row][col];
    }

    

}
