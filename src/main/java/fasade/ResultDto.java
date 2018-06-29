package fasade;

import java.io.Serializable;
import java.util.*;

//data transfer object
public class ResultDto implements Serializable {

    public enum Status {
        SUCCESS,
        ERROR,
        BOOK_NOT_FOUND;
    }

    private Status status;
    private String message;
    private List<BookDto> bookDtos = new ArrayList<>();

    public ResultDto(Status status, String message, List<BookDto> bookDtos) {
        this.status = status;
        this.message = message;
        this.bookDtos = bookDtos;
    }

    private ResultDto ofBookNotFound(String message){
        return new ResultDto(Status.BOOK_NOT_FOUND, message, Collections.EMPTY_LIST);
    }

    public static ResultDto ofSuccess(BookDto bookDto) {
        return new ResultDto(Status.BOOK_NOT_FOUND, "", Arrays.asList(bookDto));
    }

    public static ResultDto ofPaymentError(String message) {
        return new ResultDto(Status.ERROR, message, Collections.EMPTY_LIST);
    }

}
