package com.example.demo.dao;

import com.example.demo.model.Employee;

import javax.servlet.RequestDispatcher;
import java.sql.*;

public class EmployeeDAO {

    String serverName = "localhost";
    String dataBasePort = "3306";
    String myDataBase = "employees";
    String url = "jdbc:mysql://" + serverName + ":" + dataBasePort + "/" + myDataBase ;
    String username = "root";
    String password = "";

    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String INSERT_USER_SQL = "INSERT INTO employee " +
                " (first_name, last_name, username, password, address, contact) VALUES " +
                " (?,?,?,?,?,?)";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try(Connection connection = DriverManager
                .getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)){

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUsername());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());
            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public Employee login(String username, String password) throws ClassNotFoundException {
        String SELECT_USER_SQL = "SELECT * FROM employee WHERE username = ? " +
                " AND password = ?";

        Class.forName("com.mysql.jdbc.Driver");

        try(Connection connection = DriverManager
                .getConnection(this.url, this.username, this.password);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_SQL)){

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()){
                Employee employee = new Employee();
                employee.setFirstName(result.getString("first_name"));
                employee.setLastName(result.getString("last_name"));
                employee.setUsername(result.getString("username"));
                employee.setPassword(result.getString("password"));
                employee.setAddress(result.getString("address"));
                employee.setContact(result.getString("contact"));
                return employee;
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
