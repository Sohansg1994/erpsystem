package com.erpsystem.erpsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public  abstract class BaseDTO {

    @JsonIgnore
    public  boolean isRequiredAvailable(){
      return true;
    }
}
