package dao;

import domain.Employee;

public class EmployeeDAO {

//    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getMangerInstance();
//    connectionManager.connect();
//    connectionManager.getConnectionObject().prepareStatement("insert into Employee tb1");

    public void saveEmployee(Employee emp) {

        System.out.println("Employee saved.");
    }
    public void deleteEmployee(Employee emp) {

        System.out.println("Employee deleted");
    }
}
