package com.example.code.controllers;

import com.example.code.HelloApplication;
import com.example.code.database.ListNhanKhau;
import com.example.code.models.NhanKhau;
import com.jfoenix.controls.JFXButton;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NhanKhauController implements Initializable {
    @FXML
    private AnchorPane nhankhauscreen;

    @FXML
    private TableView<NhanKhau> tblList;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colGender;

    @FXML
    private TableColumn<?, ?> colCMND;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private TableColumn<?, ?> colDiaChi;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton editBtn;

    @FXML
    private JFXButton deleteBtn;

    @FXML
    void delRecord(ActionEvent event) {

    }

    @FXML
    void handleMouseAction(MouseEvent event) {

    }

    @FXML
    void openAddScreen(ActionEvent event) {
        Stage addScreen = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource("addScreens/AddNhanKhauScreen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = 664;
        int height = 469;
        Stage current = (Stage) nhankhauscreen.getScene().getWindow();
        Scene scene = new Scene(root, width, height);
        addScreen.setScene(scene);
        addScreen.show();
    }

    @FXML
    void openEditScreen(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<NhanKhau> nhanKhauList = new ListNhanKhau().list("*", " INNER JOIN diachi d ON d.diachi_id = n.diachi_id WHERE 1=1");
        setTable(nhanKhauList);
    }

    public void setLayout() {
        NhanKhauController content = new NhanKhauController();
    }

    private void setTable(ObservableList<NhanKhau> list) {
        colId.setCellValueFactory(new PropertyValueFactory<>("nhankhau_id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("ten"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));
        colCMND.setCellValueFactory(new PropertyValueFactory<>("CMND"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("SDT"));
        colDiaChi.setCellValueFactory(new PropertyValueFactory<>("diachi"));
        tblList.setItems(list);
    }
}
