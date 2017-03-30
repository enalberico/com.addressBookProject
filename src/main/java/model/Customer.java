package model;

/**
 * Created by Elisa on 3/29/17.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(){}

    public String getFirsttName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void setFirstName(String firstName) throws Exception {
        if (!firstName.isEmpty() && firstName != null) {
            this.firstName = firstName;
        }
        else
        {
            throw new Exception("First Name value cannot be null/empty");
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
