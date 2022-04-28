import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();
        album.setName("Album name");
        album.setArtist("Artist name");
        album.setId(1);
        album.setGenre("Music");

        System.out.println(album.getName());
        System.out.println(album.getArtist());
        System.out.println(album.getId());
        System.out.println(album.getGenre());

        Quotes quotes = new Quotes();
//        quotes.setAuthor_id("");
        quotes.setContent("This is content inside the quotes");
        quotes.setId(1);

//        System.out.println(quotes.getAuthor_id());
        System.out.println(quotes.getContent());
        System.out.println(quotes.getId());

        Authors authors = new Authors();

        authors.setAuthor_name("author name");
        authors.setId(3);

        System.out.println(authors.getAuthor_name());
        System.out.println(authors.getId());

        ArrayList<Quotes> quote = new ArrayList<Quotes>(
        );
        Authors neil = new Authors(1, "Neil");
        Authors Mac = new Authors(1, "Mac");

        Quotes quote1 = new Quotes(
                1, "Hello from codeup", neil);

        Quotes quote2 = new Quotes(
                2, "Hello From another codeup", Mac);

        quote.add(quote1);
        quote.add(quote2);

        for(Quotes quoting: quote){
            System.out.println(quoting.getAuthor().getAuthor_name()+ " " + quoting.getContent());
        }

    }
}
