package fasade;

import lombok.Data;

@Data
public class ClientDto {
    private long cardId;
    private String login;

    public ClientDto(long cardId, String login) {
        this.cardId = cardId;
        this.login = login;
    }


}
