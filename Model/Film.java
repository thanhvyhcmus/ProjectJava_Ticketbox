package Model;

public class Film {
    int id;
    String title;
    String description;
    int duration;
    String genre;
    String director;
    String cast;
    String releasedDate;
    String language;
    String linkimg;
    public Film(int id, String title, String description, int duration,String genre, String director, String cast, String releasedDate, String language,String linkimg) {
        this.id =id;
        this.title =title;
        this.description =description;
        this.duration =duration;
        this.genre=genre;
        this.director=director;
        this.cast=cast;
        this.releasedDate=releasedDate;
        this.language=language;
        this.linkimg=linkimg;
    }
    public void setID(int id) {
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
    public void setDirector(String director) {
        this.director = director;
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
    public int getID() {
        return id;
    }
    public String getGenre() {
        return genre;
    }
    public String getDirector() {
        return director;
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
    public String getReleasedDate() {
        return releasedDate;
    }
    
}
