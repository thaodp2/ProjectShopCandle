package request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private int cartId;
    private int productId;
    private int customerId;
    private BigDecimal amount;
}
