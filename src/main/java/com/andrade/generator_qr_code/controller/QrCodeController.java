package com.andrade.generator_qr_code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andrade.generator_qr_code.dto.Url;
import com.andrade.generator_qr_code.service.QrCodeService;

@Controller
@RequestMapping("api/v1/qrcode")
public class QrCodeController {

    @Autowired
    private QrCodeService service;

    @PostMapping("/")
    public ResponseEntity<byte[]> generatorQrCodeController(@Validated @RequestBody Url url) {
        return ResponseEntity.
                status(201).
                header("Content-Type", "image/png").
                body(service.generetorQrCodeService(url));
            }

}
