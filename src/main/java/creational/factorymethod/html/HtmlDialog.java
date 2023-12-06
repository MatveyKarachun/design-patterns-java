package creational.factorymethod.html;

import creational.factorymethod.Button;
import creational.factorymethod.Dialog;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
