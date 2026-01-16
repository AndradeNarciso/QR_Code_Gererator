package com.andrade.generator_qr_code.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record  Url( @NotBlank @NotEmpty String url) {

}
