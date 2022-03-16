package org.sqli.pfe.dp.structural.decorator;

public class ColoredButton extends ButtonDecorator{

    public ColoredButton(Button button) {
        super(button);
    }

    @Override
    public String create() {
        return super.create() + ", color";
    }
}
