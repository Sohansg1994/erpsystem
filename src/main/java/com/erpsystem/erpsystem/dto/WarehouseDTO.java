package com.erpsystem.erpsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WarehouseDTO {
    private int branchCode;
    private String warehouseName;
    private int contactDetailsId;
    private double capacity;
}
