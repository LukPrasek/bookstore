package fasade;

public interface BookStore {
    BookDto buy(ISBNDto isbnDto, ClientDto clientDto);
}
