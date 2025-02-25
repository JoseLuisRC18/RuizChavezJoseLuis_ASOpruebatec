package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter

public class LimitAmount implements Serializable {
    @NotNull
    private Integer amount;
    @NotNull
    @NotBlank
    private String currency;
}
