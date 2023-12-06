package factorymethod.html;

import factorymethod.Button;
import factorymethod.Dialog;

class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
