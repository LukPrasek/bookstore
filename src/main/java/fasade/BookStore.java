package fasade;

public interface BookStore {
    ResultDto buy(ISBNDto isbn, ClientDto clientDto);
}