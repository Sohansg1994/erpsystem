package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WarehouseDTO {
    private int branchCode;
    private String warehouseName;
    private double capacity;
    private Address address;
}
