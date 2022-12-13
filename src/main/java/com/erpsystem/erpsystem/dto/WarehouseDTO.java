package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.Address;
import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WarehouseDTO extends BaseDTO{
    private int branchCode;
    private String warehouseName;
    private double capacity;
    private ContactDetails contactDetails;

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((branchCode>0)&& (warehouseName !=null && !warehouseName.isEmpty())&&
                (capacity>0) && (contactDetails !=null));

        return isAllItemsAvailable;

    }


}
