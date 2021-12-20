package request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountPay {
    private int id;
    private int customerId;
    private int cardNo;
    private String name;
}
