package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeCustomerControllerForm {
    public void btnAddOnView(ActionEvent actionEvent) throws IOException {
        System.out.println("add");
        Stage stage=new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/add_customer_form.fxml"))));
        stage.show();
    }

    public void btnViewOnAction(ActionEvent actionEvent) throws IOException {
        System.out.println("view");
        Stage stage=new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/view_customer_form.fxml"))));
        stage.show();
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        System.out.println("delete");
    }
}
