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
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        else
        {
            throw new Exception("First Name value cannot be null/empty");
        }
    }

    public void setLastName(String lastName) throws Exception {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        else
        {
            throw new Exception("Last Name value cannot be null/empty");
        }
    }

    public void setPhoneNumber(String phoneNumber) throws Exception{
        if (phoneNumber != null && !phoneNumber.isEmpty())
        {
            if (!phoneNumber.matches("\\d{10}")) {
                {
                    phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
                }
            }
        }
        else
        {
            throw new Exception("Phone number cannot be null");
        }
        if (phoneNumber.length() == 10)
        {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new Exception("Phone number must contain exactly 10 numbers");
        }
    }
}
