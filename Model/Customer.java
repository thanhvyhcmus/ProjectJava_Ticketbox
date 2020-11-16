package Model;

public class Customer  extends User{
    int point;
    String favouriteGenre;
    Customer()
    {
        super();
        point = 0;
        favouriteGenre = null;
    }
    Customer(String id,String fullname, String doB,String phone,String username, String password,String genre)
    {
        super(id, fullname, doB, phone, username, password);
        point = 0;
        this.favouriteGenre=genre;
    }
    public void addPoints(int points)
    {
        this.point += points;
    }
    public int getPoints()
    {
        return point;
    }
    public void set_favorite(String genre)
    {
        favouriteGenre =genre;
    }

}
