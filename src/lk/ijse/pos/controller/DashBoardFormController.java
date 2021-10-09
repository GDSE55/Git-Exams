/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE55-Exam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */


package lk.ijse.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public void openCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUI("CustomerForm");
    }

    public void openItemOnAction(ActionEvent actionEvent) throws IOException {
        setUI("ItemForm");
    }

    public void openPlaceOrderOnAction(ActionEvent actionEvent) {
    }

    void setUI(String location) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
