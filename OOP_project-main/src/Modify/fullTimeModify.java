package Modify;

import Database.DBConnection;
import Model.Teacher;
import Model.fullTimeTeacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fullTimeModify {
    public static ObservableList<fullTimeTeacher> findAll() { // lay du lieu tu database ve cho bang cua minh
        ObservableList<fullTimeTeacher> userList = FXCollections.observableArrayList(); // tạo một list để lưu trữ dữ liệu được truyền từ database

        Connection connection = (Connection) DBConnection.getConnection();
        Statement statement = null;
        try {

            //query
            String sql = "select * from full_time_teacher";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                fullTimeTeacher em = new fullTimeTeacher(resultSet.getInt("teacher_id"),resultSet.getString("teacher_name"),resultSet.getInt("teacher_year_at_school"),resultSet.getString("teacher_specialty"),resultSet.getString("teacher_phone"),resultSet.getDouble("teacher_salary"),resultSet.getDouble("teacher_coefficient"));
                userList.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return userList;
    }
    public static int findAllTeacher(Teacher teacherProp){
        Connection connection = (Connection) DBConnection.getConnection();
        Statement statement = null;
        int id = 1;
        try {

            String sql = "select teacher_id from teacher where teacher_name ="+"'"+teacherProp.getName()+"' and teacher_phone= "+"'"+teacherProp.getPhoneNumber()+"' and teacher_specialty= "+"'"+teacherProp.getSpecialty()+"'";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                id = resultSet.getInt("teacher_id");

            }



        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return id;
    }


    public static void insert(fullTimeTeacher teacher) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach employee
            //query
            String sql = "insert into full_time_teacher( teacher_name, teacher_year_at_school,teacher_specialty,teacher_phone,teacher_salary,teacher_coefficient) values(?, ? ,? ,? ,? ,?)";
            statement = connection.prepareCall(sql);


            statement.setString(1, teacher.getName());
            statement.setInt(2,teacher.getTeachAtSchoolYear());
            statement.setString(3, teacher.getSpecialty());
            statement.setString(4,teacher.getPhoneNumber());
            statement.setDouble(5,teacher.getLuong()); // ko phai salary ma la function geLuong()
            statement.setDouble(6,teacher.getCoefficient());

            statement.execute();
        }

        catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(fullTimeTeacher teacher) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {

            String sql = "update full_time_teacher set teacher_name=? , teacher_year_at_school=?  , teacher_specialty=? ,teacher_phone=?, teacher_salary=?, teacher_coefficient=? where teacher_id =?";
            statement = connection.prepareCall(sql);


            statement.setString(1, teacher.getName());
            statement.setInt(2,teacher.getTeachAtSchoolYear());
            statement.setString(3, teacher.getSpecialty());
            statement.setString(4,teacher.getPhoneNumber());
            statement.setDouble(5,teacher.getLuong()); // ko phai salary ma la function geLuong()
            statement.setDouble(6,teacher.getCoefficient());
            statement.setInt(7,teacher.getId());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void delete(int id) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {

            String sql = "delete from  full_time_teacher where teacher_id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }



    public static void insertTeacher(fullTimeTeacher teacher) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach employee
            //query
            String sql = "insert into teacher( teacher_name, teacher_year_at_school,teacher_specialty,teacher_phone,teacher_salary) values( ? ,? ,? ,? ,?)";
            statement = connection.prepareCall(sql);


            statement.setString(1, teacher.getName());
            statement.setInt(2,teacher.getTeachAtSchoolYear());
            statement.setString(3, teacher.getSpecialty());
            statement.setString(4,teacher.getPhoneNumber());
            statement.setDouble(5,teacher.getLuong()); // ko phai salary ma la function geLuong()


            statement.execute();
        }

        catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void updateTeacher(fullTimeTeacher teacher) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {

            String sql = "update teacher set teacher_name=? , teacher_year_at_school=?  , teacher_specialty=? ,teacher_phone=?, teacher_salary=? where teacher_id =?";
            statement = connection.prepareCall(sql);


            statement.setString(1, teacher.getName());
            statement.setInt(2,teacher.getTeachAtSchoolYear());
            statement.setString(3, teacher.getSpecialty());
            statement.setString(4,teacher.getPhoneNumber());
            statement.setDouble(5,teacher.getLuong()); // ko phai salary ma la function geLuong()
            statement.setInt(6,teacher.getId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void deleteTeacher(int id) {
        Connection connection = (Connection) DBConnection.getConnection();
        PreparedStatement statement = null;

        try {

            String sql = "delete from  teacher where teacher_id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(fullTimeModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
}
