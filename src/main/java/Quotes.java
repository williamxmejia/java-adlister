import java.io.Serializable;

public class Quotes implements Serializable {
    private int id;
    private String content;
    private Authors author;

    public Quotes(int id, String content, Authors author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor_id(Authors author) {
        this.author = author;
    }

    public Quotes(){

    }


}
