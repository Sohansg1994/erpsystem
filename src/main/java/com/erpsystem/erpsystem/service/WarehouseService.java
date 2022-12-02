package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.BranchDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.dto.WarehouseDTO;
import com.erpsystem.erpsystem.entity.Branch;
import com.erpsystem.erpsystem.entity.Warehouse;
import com.erpsystem.erpsystem.repo.BranchRepository;
import com.erpsystem.erpsystem.repo.WarehouseRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WarehouseService {
    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ModelMapper modelMapper;

    public ResponseDTO saveWarehouse(WarehouseDTO warehouseDTO){
        ResponseDTO responseDTO;
        Warehouse warehouse=new Warehouse();
        warehouse.setBranch(branchRepository.getReferenceById(warehouseDTO.getBranchCode()));
        warehouse.setWarehouseName(warehouseDTO.getWarehouseName());
        warehouse.setCapacity(warehouseDTO.getCapacity());
        warehouse.setAddress(warehouseDTO.getAddress());
        warehouseRepository.save(warehouse);
        responseDTO =new ResponseDTO("Warehouse Successfully added",null);
        return responseDTO;

    }



}
