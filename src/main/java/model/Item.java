package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class Item {
    String itemId;;
    String itemName;
    int itemQuantity;
    Double itemPrice;
    String ItemDescription;
}
