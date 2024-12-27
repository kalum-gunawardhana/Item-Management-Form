package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import DBConnection.Connection;
import model.Item;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCustomerControllerForm implements Initializable {
    public TextField txtItemName;
    public TextField txtItemQuantity;
    public TextField txtItemPrice;
    public TextField txtItemDescription;
    public Label txtItemId;
    private static int itemIdCount=1;

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String itemId= String.valueOf(itemIdCount++);
        String itemName= txtItemName.getText();
        int itemQuantity= Integer.parseInt(txtItemQuantity.getText());
        Double itemPrice= Double.valueOf(txtItemPrice.getText());
        String ItemDescription= txtItemDescription.getText();
        txtItemId.setText(itemId);

        Item item=new Item(itemId,itemName,itemQuantity,itemPrice,ItemDescription);
        Connection.getInstance().getItemList().add(item);

        txtItemName.clear();
        txtItemQuantity.clear();
        txtItemPrice.clear();
        txtItemDescription.clear();
        updateNextItemId();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateNextItemId();
    }

    private void updateNextItemId() {
        itemIdCount = Connection.getInstance().getItemList().size() + 1;
        txtItemId.setText("ITM" + String.format("%04d", itemIdCount));
    }
}