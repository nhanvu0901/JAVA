package sample.Control;

import Database.DBConnection;

import Model.Teacher;

import Modify.fullTimeModify;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.*;

import java.util.ResourceBundle;

import Model.partTimeTeacher;
import Modify.partTimeModify;
import javafx.stage.Stage;
import sample.style.Style;


public class ControllerPartTime implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;
    Integer index = -1;

    ObservableList<partTimeTeacher> listM;

    partTimeModify model = new partTimeModify();




    @FXML
    private TextField  nameText,teachAtSchoolYearText,specialtyText,phoneText,hourText,salaryText;

    @FXML
    private Label inform,nameLabel,teachAtSchoolYearLabel,specialtyLabel,phoneLabel,hourLabel;
    @FXML
    private TableView<partTimeTeacher> table1;

    @FXML
    private TableColumn<partTimeTeacher, String> col_name;
    @FXML
    private TableColumn<partTimeTeacher, Integer> col_teachAtSchoolYear;
    @FXML
    private TableColumn<partTimeTeacher, Integer> col_id;
    @FXML
    private TableColumn<partTimeTeacher, String> col_specialty;
    @FXML
    private TableColumn<partTimeTeacher, String> col_phone;
    @FXML
    private TableColumn<partTimeTeacher, Double> col_salary;
    @FXML
    private TableColumn<partTimeTeacher, Double> col_hour;

    int idProp ;

    Teacher teacherProp ;



    @FXML
    void getSelected(MouseEvent event){
        index = table1.getSelectionModel().getSelectedIndex();
        if (index <= -1){
            return;
        }

        nameText.setText(col_name.getCellData(index));
        teachAtSchoolYearText.setText(col_teachAtSchoolYear.getCellData(index).toString());
        specialtyText.setText(col_specialty.getCellData(index));
        phoneText.setText(col_phone.getCellData(index));
        hourText.setText(col_hour.getCellData(index).toString());
        salaryText.setText(col_salary.getCellData(index).toString());
        idProp = Integer.parseInt(col_id.getCellData(index).toString());

        String name = col_name.getCellData(index);
        int year = Integer.parseInt(col_teachAtSchoolYear.getCellData(index).toString());
        String specialty = col_specialty.getCellData(index);
        String phone = col_phone.getCellData(index);

        teacherProp = new Teacher(idProp,name,year,specialty,phone);
        int id = partTimeModify.findAllTeacher(teacherProp);
        System.out.println(id);
    }
    public void UpdateTable(){

        col_name.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,String>("name"));
        col_teachAtSchoolYear.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,Integer>("teachAtSchoolYear"));
        col_id.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,Integer>("id"));
        col_specialty.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,String>("specialty"));
        col_phone.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,String>("phoneNumber"));
        col_salary.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,Double>("salary"));
        col_hour.setCellValueFactory(new PropertyValueFactory<partTimeTeacher,Double>("teachingHour"));
        listM = model.findAll();
        table1.setItems(listM);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        UpdateTable();


    }

    public void addUser(javafx.event.ActionEvent actionEvent) throws IOException{
        String name = nameText.getText();
        String schoolYearTxt = teachAtSchoolYearText.getText();
        String specialty = specialtyText.getText();
        String phone = phoneText.getText();
        String hourTxt = hourText.getText();

        if(name == "" && schoolYearTxt =="" && specialty=="" && phone==""&& hourTxt==""){
            Style.setDanger(nameText,nameLabel,inform);
            Style.setDanger(teachAtSchoolYearText,teachAtSchoolYearLabel,inform);
            Style.setDanger(specialtyText,specialtyLabel,inform);
            Style.setDanger(phoneText,phoneLabel,inform);
            Style.setDanger(hourText,hourLabel,inform);

            inform.setText("Không được để trống dòng");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }


        else if(name == ""){
            Style.setDanger(nameText,nameLabel,inform);
            inform.setText("Không được để trống dòng tên");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(schoolYearTxt == ""){
            Style.setDanger(teachAtSchoolYearText,teachAtSchoolYearLabel,inform);
            inform.setText("Không được để trống dòng năm nhập trường");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(specialty == ""){
            Style.setDanger(specialtyText,specialtyLabel,inform);
            inform.setText("Không được để trống dòng chuyên môn");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(phone == ""){
            Style.setDanger(phoneText,phoneLabel,inform);
            inform.setText("Không được để trống dòng số điện thoại");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(hourTxt == ""){
            Style.setDanger(hourText,hourLabel,inform);
            inform.setText("Không được để trống dòng tỉ lệ nghạch");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }



        else {
            try {
                Double hour = Double.parseDouble(hourText.getText());
                int teachAtSchoolYear = Integer.parseInt(teachAtSchoolYearText.getText());

                Connection con = DBConnection.getConnection();


                partTimeTeacher teacher = new partTimeTeacher(name, teachAtSchoolYear, specialty, phone, hour);
                partTimeModify modify = new partTimeModify();

                PreparedStatement ps =
                        con.prepareStatement
                                ("SELECT  teacher_phone FROM part_time_teacher  WHERE teacher_phone = ?");
                ps.setString(1, phone);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Style.setInform(inform);
                    inform.setText("Số điện thoại đã được nhập vui lòng nhập thông tin khác !");
                    clearText();
                } else {
                    modify.insert(teacher);
                    partTimeModify.insertTeacher(teacher);
                    Style.success(inform, "Insert database thanh cong!");
                    double luong = teacher.getLuong();
                    salaryText.setText(Double.toString(luong));
                    UpdateTable();
                }

            } catch (Exception e) {

                System.out.println(e);
            }
        }
    }
    public void editUser(ActionEvent actionEvent) throws IOException {
        String name = nameText.getText();
        String schoolYearTxt = teachAtSchoolYearText.getText();
        String specialty = specialtyText.getText();
        String phone = phoneText.getText();
        String hourTxt = hourText.getText();

        if(name == "" && schoolYearTxt =="" && specialty=="" && phone==""&& hourTxt==""){
            Style.setDanger(nameText,nameLabel,inform);
            Style.setDanger(teachAtSchoolYearText,teachAtSchoolYearLabel,inform);
            Style.setDanger(specialtyText,specialtyLabel,inform);
            Style.setDanger(phoneText,phoneLabel,inform);
            Style.setDanger(hourText,hourLabel,inform);

            inform.setText("Không được để trống dòng");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }


        else if(name == ""){
            Style.setDanger(nameText,nameLabel,inform);
            inform.setText("Không được để trống dòng tên");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(schoolYearTxt == ""){
            Style.setDanger(teachAtSchoolYearText,teachAtSchoolYearLabel,inform);
            inform.setText("Không được để trống dòng năm nhập trường");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(specialty == ""){
            Style.setDanger(specialtyText,specialtyLabel,inform);
            inform.setText("Không được để trống dòng chuyên môn");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(phone == ""){
            Style.setDanger(phoneText,phoneLabel,inform);
            inform.setText("Không được để trống dòng số điện thoại");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else if(hourTxt == ""){
            Style.setDanger(hourText,hourLabel,inform);
            inform.setText("Không được để trống dòng tỉ lệ nghạch");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        else{
            try {
                Connection con = DBConnection.getConnection();
                Double hour = Double.parseDouble(hourText.getText());
                int teachAtSchoolYear = Integer.parseInt(teachAtSchoolYearText.getText());


                int id = fullTimeModify.findAllTeacher(teacherProp);


                partTimeTeacher teacher = new partTimeTeacher(idProp,name, teachAtSchoolYear, specialty, phone, hour);
                partTimeTeacher teacher1 = new partTimeTeacher(id,name, teachAtSchoolYear, specialty, phone, hour);


                partTimeModify .update(teacher);
                partTimeModify.updateTeacher(teacher1);
                Style.success(inform,"Update database thanh cong");
                UpdateTable();
                clearText();

            } catch(Exception e){
                System.out.println(e);
            }
        }

    }
    public void deleteUser(ActionEvent actionEvent) throws IOException {
        String name = nameText.getText();
        String schoolYearTxt = teachAtSchoolYearText.getText();
        String specialty = specialtyText.getText();
        String phone = phoneText.getText();
        String hourTxt = hourText.getText();

        if(name == "" && schoolYearTxt =="" && specialty=="" && phone==""&& hourTxt==""){
            Style.setDanger(nameText,nameLabel,inform);
            Style.setDanger(teachAtSchoolYearText,teachAtSchoolYearLabel,inform);
            Style.setDanger(specialtyText,specialtyLabel,inform);
            Style.setDanger(phoneText,phoneLabel,inform);
            Style.setDanger(hourText,hourLabel,inform);

            inform.setText("Chọn hàng ở bảng để xóa giáo viên ");
            inform.setVisible(true);
            inform.setStyle("-fx-text-fill:red");
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm data");
        alert.setContentText("Bạn có muốn xóa dữ liệu của người này ? (dữ liệu sẽ bị xóa mãi mãi)");
        ButtonType okButton = new ButtonType("Yes", ButtonBar.ButtonData.YES);

        ButtonType cancelButton = new ButtonType("Quay lại", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(okButton, cancelButton);
        alert.showAndWait().ifPresent(type -> {
            if (type == okButton) {
                int id = partTimeModify.findAllTeacher(teacherProp);
                partTimeModify.delete(idProp);
                partTimeModify.deleteTeacher(id);
                UpdateTable();
                clearText();
                Style.success(inform,"Xóa dữ liệu giáo viên thành công");
            } else{
                alert.close();
            }
        });
    }
    public void clearText(){
        nameText.setText("");
        teachAtSchoolYearText.setText("");
        specialtyText.setText("");
        phoneText.setText("");
        hourText.setText("");
        salaryText.setText("");
    }


}
