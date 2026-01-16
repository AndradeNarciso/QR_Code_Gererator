package com.andrade.generator_qr_code.util;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class QrCodeUtil {

    public Boolean isValidUrl(String urlString){
        try {
            URL url = new URL(urlString);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setRequestMethod("HEAD"); 
            huc.setConnectTimeout(5000); 
            huc.setReadTimeout(5000);
            int responseCode = huc.getResponseCode();
            return (responseCode >= 200 && responseCode < 400);
        } catch (Exception e) {
            return false;
        }
    }
}
