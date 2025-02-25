package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Getter
@Setter
public class Details implements Serializable {
    @Pattern(regexp = "^[A-ZÁÉÍÓÚÑ_]+$")
    private String offerType;
    @Valid
    private LimitAmount limitAmount;
    @Valid
    private Product product;
}