package Model;

public class Film {
    String id;
    String title;
    String description;
    int duration;
    String genre;
    String direction;
    String cast;
    String releasedDate;
    String language;
    String linkimg;
    public Film(String id, String title, String description, int duration,String genre, String direction, String cast, String releasedDate, String language,String linkimg) {
        this.id =id;
        this.title =title;
        this.description =description;
        this.duration =duration;
        this.genre=genre;
        this.direction=direction;
        this.cast=cast;
        this.releasedDate=releasedDate;
        this.language=language;
        this.linkimg=linkimg;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void setCast(String cast) {
        this.cast = cast;
    }
    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setLinkimg(String linkimg)
    {
        this.linkimg = linkimg;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getDuration() {
        return duration;
    }
    public String getID() {
        return id;
    }
    public String getGenre() {
        return genre;
    }
    public String getDirection() {
        return direction;
    }
    public String getCast() {
        return cast;
    }
    public String getLanguage() {
        return language;
    }
    public String getLinkimg() {
        return linkimg;
    }
}
