package org.sqli.pfe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sqli.pfe.dp.behavioral.adapter.client.NewUser;
import org.sqli.pfe.dp.behavioral.adapter.client.OldUserAdapter;
import org.sqli.pfe.dp.behavioral.adapter.client.User;
import org.sqli.pfe.dp.behavioral.adapter.oldApp.OldUser;
import org.sqli.pfe.dp.behavioral.strategy.BubbleSort;
import org.sqli.pfe.dp.behavioral.strategy.InsertionSort;
import org.sqli.pfe.dp.behavioral.strategy.QuickSort;
import org.sqli.pfe.dp.behavioral.strategy.SortContext;
import org.sqli.pfe.dp.creational.builder.Product;
import org.sqli.pfe.dp.creational.singleton.DataBaseSingleton;
import org.sqli.pfe.dp.structural.decorator.BasicButton;
import org.sqli.pfe.dp.structural.decorator.BorderButton;
import org.sqli.pfe.dp.structural.decorator.Button;
import org.sqli.pfe.dp.structural.decorator.ColoredButton;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternsTests {

    @Test
    void decorator_SHouldAddNewCapabilities() {

        Button basicButton = new BasicButton();
        Assertions.assertEquals("Basic", basicButton.create());

        Button coloredButton = new ColoredButton(basicButton);
        Assertions.assertEquals("Basic, color", coloredButton.create());

        BorderButton borderButton = new BorderButton(basicButton);
        Assertions.assertEquals("Basic, border", borderButton.create());

        borderButton = new BorderButton(coloredButton);
        Assertions.assertEquals("Basic, color, border", borderButton.create());

    }

    @Test
    void singlent_SouldReturnTheSameHashAddress() {

        DataBaseSingleton dataBaseSingleton1 = DataBaseSingleton.getInstance();
        DataBaseSingleton dataBaseSingleton2 = DataBaseSingleton.getInstance();
        Assertions.assertEquals(dataBaseSingleton1, dataBaseSingleton2);
    }

    @Test
    void builder_SouldBuildObjectWithSameParams() {


        Product product = new Product.ProductBuilder()
                .builder("TEST")
                .price(120)
                .quantity(20)
                .build();

        Assertions.assertEquals("TEST", product.getLabel());
        Assertions.assertEquals(120, product.getPrice());
        Assertions.assertEquals(20, product.getQuantity());

    }

    @Test
    void strategy_SouldReturnTheNameOfSortingStartegy() {

        int[] values = {};

        SortContext context = new SortContext(new InsertionSort());
        Assertions.assertEquals("insertion", context.sort(values));

        context.setStrategy(new QuickSort());
        Assertions.assertEquals("quick", context.sort(values));

        context.setStrategy(new BubbleSort());
        Assertions.assertEquals("bubble", context.sort(values));

    }

    @Test
    void adaptateur_ShouldAdaptOldUserClassValuesToNewUserClass() {

        List<User> users = new ArrayList<>();
        users.add(new NewUser("test", "sqli"));

        OldUser oldUser = new OldUser("old", "user");
        User adaptedUser = new OldUserAdapter(oldUser);
        users.add(adaptedUser);

        Assertions.assertEquals(2, users.size());
        Assertions.assertEquals("user", adaptedUser.getFirstName());
        Assertions.assertEquals("old", adaptedUser.getLastName());

    }

}
