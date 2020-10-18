package com.company;
/**
 * Here is the User class with two fields: firstName and lastName.
 *
 * Implement two null-safety setters and one calculated getter in the following ways:
 *
 * both setters should accept and set a value if it is not null, otherwise, empty string "";
 * the getter should return the full name of the user by concatenating firstName and lastName using a single space between them. If one of the parts was not set, the getter should return another part without additional spaces. If both parts are empty, the getter should return the word "Unknown".
 * There are two examples below:
 *
 * User tim = new User();
 * tim.setFirstName("Tim");
 * tim.setLastName("Towler");
 * System.out.println(tim.getFullName()); // Tim Towler
 *
 * User katie = new User();
 * katie.setFirstName("Katie");
 * katie.setLastName(null);
 * System.out.println(katie.getFullName()); // Katie (without additional spaces)
 * */
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && !lastName.isEmpty()) {
            return lastName;
        } else if (!firstName.isEmpty() && lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else {
            return firstName + " " + lastName;
        }
//Otra solucion
       /* public String getFullName() {
            String fullName = this.(firstName + " " + lastName).trim();
            return fullName.isEmpty() ? "Unknown" : fullName;
        }*/
    }

    public static void main(String[] args) {

    }
}

public class GettingFullName {

}
