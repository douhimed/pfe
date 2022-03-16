package org.sqli.pfe.dp.structural.decorator;

public class BorderButton extends ButtonDecorator{


    public BorderButton(Button button) {
        super(button);
    }

    @Override
    public String create() {
        return super.create() + ", border";
    }
}
