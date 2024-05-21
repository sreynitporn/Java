package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String uuid;
    private String userName;
    private String email;
    private String password;
    private Boolean isDelete;
}
