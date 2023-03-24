package entities;

public class Video extends Lesson{

    private String url;
    private int seconds;

    //Constructors
    public Video(){
        super();
    }

    public Video(String title, String url, int seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    //Getters and Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //Metod
    @Override
    public int duration() {
        return seconds;
    }
    

}
