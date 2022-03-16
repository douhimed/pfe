package org.sqli.pfe.dp.structural.decorator;

public abstract class ButtonDecorator implements Button{

    private Button button;

    public ButtonDecorator(Button button) {
        this.button = button;
    }

    @Override
    public String create() {
        return button.create();
    }
}
