import model.Customer;

import java.sql.*;

/**
 * Created by Elisa on 3/27/17.
 */
public class contactEntry {



//    public contactEntry(String firstName, String lastName, String phoneNumber)
//    {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setPhoneNumber(phoneNumber);
//    }

    public static void main(String[] args) throws SQLException {
//        contactEntry contact = new contactEntry("Bob", "Jones", "1015551234");

        contactEntry contact = new contactEntry();
        Customer customer = new Customer();
        try {

            customer.setFirstName(null);
            customer.setLastName("Jobs");
            customer.setPhoneNumber("9102225555");
            contact.addContactButton(customer);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addContactButton(Customer customer) throws SQLException
    {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/ADDRESSBOOK";
            Connection connection = DriverManager.getConnection(DB_URL, "root", "password");

            String query = "insert into CONTACT (FIRST_NAME, LAST_NAME, PHONE_NUMBER) values (?, ?, ?)";

            Statement createStatement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getFirsttName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getPhoneNumber());

            preparedStatement.executeUpdate();
            connection.close();

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}
