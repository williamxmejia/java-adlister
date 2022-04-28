import java.io.Serializable;

public class Authors implements Serializable {
    private int id;
    private String author_name;

    public Authors(int id, String author_name) {
        this.id = id;
        this.author_name = author_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Authors(){

    }
}
