package org.sqli.pfe.dp.behavioral.adapter.oldApp;

public class OldUser {

    private String surName;
    private String givenName;

    public OldUser(String surName, String givenName) {
        this.surName = surName;
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public String getGivenName() {
        return givenName;
    }

}
