package org.sqli.pfe.dp.behavioral.adapter.client;

public class NewUser implements User {

    private String firstName;
    private String lastName;

    public NewUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

}
