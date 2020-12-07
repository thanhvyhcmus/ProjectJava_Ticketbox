package Model;

public class Customer  extends User{
    private int point;
    private String favouriteGenre;

    Customer()
    {
        super();
        point = 0;
        favouriteGenre = null;
    }
    public Customer(int id,String fullname, String doB,String username, String password,String phone,int point,String genre)
    {
        super(id, fullname, doB, phone, username, password);
        isadmin =0;
        this.point = point;
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
    public String getFavouriteGenre(){
        return  favouriteGenre;
    }
    public void setFavouriteGenre(String genre)
    {
        favouriteGenre =genre;
    }
    public String toString()
    {
        return id+" "+ fullname+" "+doB+" "+username+" "+password+" "+phone+" "+Integer.toString(point)+" "+favouriteGenre+" "+Byte.toString(isadmin);
    }

    @Override
    public Object[] getObject(){
        return new Object[]{getID(),getFullname(),getDoB(),getUsername(),getPhone(),getPoints(),getFavouriteGenre(),0};
    }
    public String getGenre(){
        return getFavouriteGenre();
    }
}
