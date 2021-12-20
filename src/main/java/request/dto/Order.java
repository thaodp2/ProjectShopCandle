package request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private int customerId;
    private BigDecimal amount;
    private Date orderDate;
    private String orderMail;
    private String orderStatus;
    private BigDecimal orderMoney;

}
