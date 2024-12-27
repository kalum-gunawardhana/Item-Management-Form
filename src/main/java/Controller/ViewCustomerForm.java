package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import DBConnection.Connection;
import model.Item;

public class ViewCustomerForm {
    public TableColumn colID;
    public TableColumn colName;
    public TableColumn colQty;
    public TableColumn colDes;
    public TableColumn colPrice;
    public TableView tblItem;

    public void btnLoadOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    public void btnBackOnAction(ActionEvent actionEvent) {
    }

    private void loadTable(){
        ObservableList<Item> itemObservableList= FXCollections.observableArrayList();
        colID.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colDes.setCellValueFactory(new PropertyValueFactory<>("ItemDescription"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));

        Connection.getInstance().getItemList().forEach(obj->{
            itemObservableList.add(obj);

        });

        tblItem.setItems(itemObservableList);
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        Item selectedItem = (Item) tblItem.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {

            Connection.getInstance().getItemList().remove(selectedItem);
            tblItem.getItems().remove(selectedItem);
        }else{
            System.out.println("No selected item");
            loadTable();
        }
    }
}
