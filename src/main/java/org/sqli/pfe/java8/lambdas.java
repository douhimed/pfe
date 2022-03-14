package org.sqli.pfe.java8;

import java.util.Objects;

interface Test {
    void consume();
}

interface Validator {
    boolean isValide(Object o); // valid if not null
}

class Log {

    /*
    void log(Test t) {
        t.consume();
    }

    void log(Validator v, Object o) {
        System.out.println(v.isValide(o));
    }
     */
}

public class lambdas {

    public static void main(String[] args) {
        /*
        final Log log = new Log();
        log.log(() -> System.out.println("Demo lambda"));
        log.log(o -> Objects.nonNull(o), new Object());
        log.log(Objects::nonNull, null);
         */
    }
}
