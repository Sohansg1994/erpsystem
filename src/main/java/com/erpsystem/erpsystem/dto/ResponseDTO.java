package com.erpsystem.erpsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO extends BaseDTO{
    private String massage ;
    private Object content;

    @Override
    public boolean isRequiredAvailable() {
        return true;
    }
}




