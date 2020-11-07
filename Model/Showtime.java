package Model;

public class Showtime {
    int id;
    Film film;
    boolean[][] seats; // Nếu là false có nghĩa là còn chỗ trống

    public Showtime(int id, Film film,int row,int col) {
        this.id = id;
        this.film=film;
        seats = new boolean[row][col];
        for(int i=0;i<seats.length;i++) {
            for(int j=0;j<col;j++) {
                seats[i][j]=false;
            }
        }
    }

    

}
