package request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String fistName;
    private String lastName;
    private String password;
    private String address;
    private String email;
    private String role;
}
