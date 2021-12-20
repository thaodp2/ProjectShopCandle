package request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
    private int payId;
    private int orderId;
    private int accountPayId;
    private int totalMoney;
    private int payAtm;
    private Date payDate;
    private String signature;

}
