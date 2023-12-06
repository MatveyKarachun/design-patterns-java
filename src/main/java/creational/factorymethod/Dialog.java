package creational.factorymethod;

public abstract class Dialog {
    public void renderWindow() {
        createButton().render();
    }

    public abstract Button createButton();
}
