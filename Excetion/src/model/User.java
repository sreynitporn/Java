package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {
    private Integer id;
    private String name;
    private String gender;
    private String email;
    private String password;
}
