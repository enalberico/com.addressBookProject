package model;

import java.util.ArrayList;

/**
 * Created by Elisa on 3/29/17.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(){}

    public String getFirstName() {
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
            if (firstName.length() >=2) {
                firstName = firstName.replaceAll("[^a-zA-Z '-]", "");
                String[] firstname = firstName.split("[\\s+'-]");
                ArrayList<String> name = new ArrayList<String>();
                for (String firstNameString : firstname)
                {
                    //if firstNameString.length() > 0 will handle StringIndexOutOfBoundsException in case user adds space before name
                    if (firstNameString.length() > 0) {
                        firstNameString = firstNameString.substring(0, 1).toUpperCase() + firstNameString.substring(1).toLowerCase();
                        name.add(firstNameString);
                    }
                }
                firstName = name.toString().replaceAll("[^a-zA-Z ']", "");
                this.firstName = firstName;
            } else {
                throw new Exception("First name length must be at least 2 characters long");
            }
        } else {
            throw new Exception("First name value cannot be null/empty");
        }
    }

    public void setLastName(String lastName) throws Exception {
        if (lastName != null && !lastName.isEmpty()) {
            if (lastName.length() >= 2) {
                lastName = lastName.replaceAll("[^a-zA-Z '-]", "");
                String[] lastname = lastName.split("[\\s+'-]");
                ArrayList<String> name = new ArrayList<String>();
                for (String lastNameString : lastname) {
                    //if lastNameString.length() > 0 will handle StringIndexOutOfBoundsException in case user adds space before name
                    if (lastNameString.length() > 0) {
                        lastNameString = lastNameString.substring(0, 1).toUpperCase() + lastNameString.substring(1).toLowerCase();
                        name.add(lastNameString);
                    }
                }
                lastName = name.toString().replaceAll("[^a-zA-Z ']", "");
                this.lastName = lastName;
            } else {
                throw new Exception("Last name length must be at least 2 characters long");
            }
        } else {
            throw new Exception("Last Name value cannot be null/empty");
        }
    }

    public void setPhoneNumber(String phoneNumber) throws Exception{
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            if (!phoneNumber.matches("\\d{10}")) {
                phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
            }
        } else {
            throw new Exception("Phone number cannot be null");
        }
        //TODO update length later to match different country phone number lengths
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new Exception("Phone number must contain exactly 10 numbers");
        }
    }
}
