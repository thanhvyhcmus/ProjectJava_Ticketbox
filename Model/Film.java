package Model;

public class Film {
    int id;
    String title;
    String description;
    int duration;
    public Film(int id, String title, String description, int duration) {
        this.id =id;
        this.title =title;
        this.description =description;
        this.duration =duration;
    }
    public void set_title(String title) {
        this.title = title;
    }
    public void set_description(String description) {
        this.description = description;
    }
    public void set_duration(int duration) {
        this.duration = duration;
    }
    public String get_title() {
        return title;
    }
    public String get_description() {
        return description;
    }
    public int get_duration() {
        return duration;
    }
}
