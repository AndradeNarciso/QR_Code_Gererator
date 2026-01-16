package com.andrade.generator_qr_code.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.zxing.qrcode.QRCodeWriter;

@Configuration
public class QrcodeConfiguration {

    @Bean
    public QRCodeWriter qrCodeMaker() {
        return new QRCodeWriter();
    }
}
