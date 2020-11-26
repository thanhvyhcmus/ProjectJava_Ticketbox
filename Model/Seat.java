package Model;

/**
 * Seat
 */
public class Seat {
    int idShowtime;
    int idRow;
    int idColumn;
    int status;
    int ticketPrice;
    public Seat(int showtime,int row,int column,int status,int price){
        idShowtime=showtime;
        idRow=row;
        idColumn=column;
        this.status=status;
        ticketPrice=price;
    }
    public int getIDShowtime() 
    {
        return idShowtime;
    }
    public int getIDRow(){
        return idRow;
    }
    public int getStatus(){
        return status;
    }
    public int getIDColumn(){
        return idColumn;
    }
    public int getTicketPrice(){
        return ticketPrice;
    }
    public void setTicketPrice(int price)
    {
        this.ticketPrice =price;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }

    
}