package org.sqli.pfe.dp.creational.singleton;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

public class DataBaseSingleton {

    private static DataBaseSingleton instance;

    private DataBaseSingleton() {
    }

    public static DataBaseSingleton getInstance() {
        if (Objects.isNull(instance))
            instance = new DataBaseSingleton();
        return instance;
    }
}
