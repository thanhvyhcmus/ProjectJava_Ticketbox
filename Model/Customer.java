package Model;

public class Customer  extends User{
    int points;
    String favouriteGenre;
    Customer()
    {
        super();
        points = 0;
        favouriteGenre = null;
    }
    Customer(String id,String fullname, String doB,String phone,String username, String password,String genre)
    {
        super(id, fullname, doB, phone, username, password);
        points = 0;
        this.favouriteGenre=genre;
    }
    public void addPoints(int points)
    {
        this.points += points;
    }
    public int get_points()
    {
        return points;
    }
    public void set_favorite(String genre)
    {
        favouriteGenre =genre;
    }

}
