package fasade;

import java.io.Serializable;
import java.util.*;

//data transfer object
public class ResultDto implements Serializable {

    public enum Status {
        SUCCESS,
        PAYMENT_ERROR,
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

    public static ResultDto ofSuccess(BookDto bookDto) {
        return new ResultDto(Status.SUCCESS, "", Arrays.asList(bookDto));
    }

    public static ResultDto ofPaymentError(String message) {
        return new ResultDto(Status.PAYMENT_ERROR, message, Collections.emptyList());
    }

    private ResultDto ofBookNotFound(String message) {
        return new ResultDto(Status.BOOK_NOT_FOUND,message,Collections.emptyList());
    }

}
