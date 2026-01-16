package com.andrade.generator_qr_code.service;

import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

import com.andrade.generator_qr_code.dto.Url;
import com.andrade.generator_qr_code.exception.InvalidUrlException;
import com.andrade.generator_qr_code.util.QrCodeUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QrCodeService {

    private static final int height = 300;
    private static final int width = 300;

    private QrCodeUtil validator;
    private QRCodeWriter generatorQr;

    public byte[] generetorQrCodeService(Url url) {

        String body = url.url();
        
        if (!validator.isValidUrl(body)) {
            throw new InvalidUrlException("Invalid url");
        }

        try {
            BitMatrix bitMatrix = generatorQr.encode(body, BarcodeFormat.QR_CODE, width, height);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream);

            return outputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Erro getting QRCODE", e);

        }
    }
}
