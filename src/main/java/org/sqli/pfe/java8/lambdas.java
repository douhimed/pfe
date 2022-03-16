package org.sqli.pfe.java8;

import java.util.Objects;

interface Consumer {
    void consume();
}

interface Validator {
    boolean isValide(Object o);
}

class Log {

    public void consum(Consumer t) {
        t.consume();
    }

    public boolean isValid(Validator v, Object o) {
        return v.isValide(o);
    }

}

public class lambdas {

    public static void main(String[] args) {

        Log log = new Log();
        log.consum(() -> System.out.println("Consumer"));
        System.out.println(log.isValid(Objects::nonNull, new Object()));

    }
}
