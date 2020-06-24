package com.digitalacademy.loan.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StatusModel implements Serializable {

    // code : "..."
    @JsonProperty("code")
    private String code;

    // message : "..."
    @JsonProperty("message")
    private String message;

    public StatusModel(){}

    public StatusModel(String code , String message){
        this.code = code;
        this.message = message;
    }

}
