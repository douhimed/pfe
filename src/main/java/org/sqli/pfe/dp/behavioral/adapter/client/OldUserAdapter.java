package org.sqli.pfe.dp.behavioral.adapter.client;

import org.sqli.pfe.dp.behavioral.adapter.oldApp.OldUser;

public class OldUserAdapter implements User {

    private final OldUser oldUser;

    public OldUserAdapter(OldUser oldUser) {
        this.oldUser = oldUser;
    }


    @Override
    public String getFirstName() {
        return oldUser.getGivenName();
    }

    @Override
    public String getLastName() {
        return oldUser.getSurName();
    }
}
