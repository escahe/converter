package com.escahe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Stream;
import org.json.JSONObject;

public final class CurrencyConvertion {
    public static Double convertCurrency(Currency currencyFrom,Double amount ,Currency currencyTo) {
        try {
            String from = currencyFrom.toString();
            String to = currencyTo.toString();
    
            String url_str = "https://api.exchangerate.host/convert?from="+from+"&to="+to+"&amount="+amount;
    
            URL url = new URL(url_str);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    
            Stream<String> lines = new BufferedReader(new InputStreamReader(connection.getInputStream())).lines();
    
            String response = lines.toList().get(0);
            JSONObject jsonObject = new JSONObject(response);

            try {
                return jsonObject.getDouble("result");
            } catch (org.json.JSONException e) {
                return 0.0;
            }
            
            
        } catch (IOException e) {
            return 0.0;
        } 
    }
    public enum Currency{
        USD,EUR,COP,BTC,ARS,MXN,CLP,PEN,CRC,BRL,DOP,SVC,BOB
    }
    public static final String[] currencyArray() {
        String currencies = "";
        for (Currency currency : Currency.values()) {
            currencies+=currency.toString()+" ";
        }
        return currencies.split(" ");
    }
}
