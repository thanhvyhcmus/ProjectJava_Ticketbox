package Model;

public class Showtime {
    Film film;
    boolean[][] seats; // Nếu là false có nghĩa là còn chỗ trống

    public Showtime( Film film,int row,int col) {
        this.film=film;
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


    

}
