package factorymethod.html;

import factorymethod.Button;
import factorymethod.Dialog;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
