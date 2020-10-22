package pro.bolshakov.gb.spring2.lesson06.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetails {
    private String product;
    private Double price;
    private Double amount;
    private Double sum;
}
