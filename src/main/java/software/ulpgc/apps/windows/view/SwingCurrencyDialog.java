package software.ulpgc.apps.windows.view;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.view.CurrencyDialog;

import javax.swing.*;
import java.util.List;

public class SwingCurrencyDialog extends JPanel implements CurrencyDialog {
    private final List<Currency> currencies;
    private final JComboBox<Currency> selector;

    public SwingCurrencyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.add(selector = createSelector());
    }

    private JComboBox<Currency> createSelector(){
        JComboBox<Currency> comboBox = new JComboBox<>();
        for (Currency currency: currencies){
            comboBox.addItem(currency);
        }
        return comboBox;
    }

    @Override
    public Currency get() {
        currencies.get(selector.getSelectedIndex());
    }
}
