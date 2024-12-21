package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.DBConnection.Connection;
import org.example.model.Item;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCustomerControllerForm {
    public TextField txtItemName;
    public TextField txtItemQuantity;
    public TextField txtItemPrice;
    public TextField txtItemDescription;
    public Label txtItemId;

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String itemId= txtItemId.getText();
        String itemName= txtItemName.getText();
        int itemQuantity= Integer.parseInt(txtItemQuantity.getText());
        Double itemPrice= Double.valueOf(txtItemPrice.getText());
        String ItemDescription= txtItemDescription.getText();

        Item item=new Item(itemId,itemName,itemQuantity,itemPrice,ItemDescription);
        Connection.getInstance().getItemList().add(item);
    }
}