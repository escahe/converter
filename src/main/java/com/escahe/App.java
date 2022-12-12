package com.escahe;

import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.util.Locale;

import com.escahe.CurrencyConvertion.Currency;
import com.escahe.TempConvertion.Temp;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        View view = new View();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.setTitle("Dino-Conversor de Monedas");

        view.rbDigitalStorage.setEnabled(false);
        view.rbLength.setEnabled(false);

        view.setCurrencyModel(CurrencyConvertion.currencyArray());

        view.btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
            private void btnConvertActionPerformed(ActionEvent evt) {
                if (view.txtfAmount.getText().isEmpty()) {
                    view.txtfAmount.setText("0");
                }
                NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
                nFormat.setMaximumFractionDigits(2);

                if (view.rbCurrency.isSelected()) {
                    view.txtfResult.setText(nFormat.format(CurrencyConvertion.convertCurrency(
                        Currency.valueOf((String) view.jcbFrom.getSelectedItem()),
                        Math.abs(Double.parseDouble(view.txtfAmount.getText())),
                        Currency.valueOf((String) view.jcbTo.getSelectedItem())))
                        );
    
                } else if (view.rbTemp.isSelected()) {
                    view.txtfResult.setText(nFormat.format(TempConvertion.convertTemp(
                        Temp.valueOf((String) view.jcbFrom.getSelectedItem()),
                        Double.parseDouble(view.txtfAmount.getText()),
                        Temp.valueOf((String) view.jcbTo.getSelectedItem())))
                        );
    
                }

            }
        });
        
        view.rbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCurrencyActionPerformed(evt);
            }
            private void rbCurrencyActionPerformed(ActionEvent evt) {
                view.setCurrencyModel(CurrencyConvertion.currencyArray());
                view.txtfAmount.setText("0");
            }
        });

        view.rbTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTempActionPerformed(evt);
            }
            private void rbTempActionPerformed(ActionEvent evt) {
                view.setCurrencyModel(TempConvertion.tempArray());
                view.txtfAmount.setText("0");
            }
        });                          
    
    }


    

    
}
