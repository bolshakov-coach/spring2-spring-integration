package pro.bolshakov.gb.spring2.lesson06.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    private String product;
    private Double price;
    private Double amount;
    private Double sum;
}
