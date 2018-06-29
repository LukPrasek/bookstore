package fasade;

import lombok.Data;

import java.io.Serializable;

@Data
public class ISBNDto implements Serializable {
    private String isbn;

    public ISBNDto(String isbn) {
        this.isbn = isbn;
    }
}
