package fasade;

import java.io.Serializable;

public class BookDto implements Serializable {
    //zmienne string bo to bedzie na strone, czyli json
    private String isbn;
    private String title;
    private String authors;
    private String price;

    public BookDto(String isbn, String title, String authors, String price) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.price = price;
    }




}
