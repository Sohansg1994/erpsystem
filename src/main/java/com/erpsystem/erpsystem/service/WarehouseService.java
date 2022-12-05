package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.BranchDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.dto.WarehouseDTO;
import com.erpsystem.erpsystem.entity.Branch;
import com.erpsystem.erpsystem.entity.Warehouse;
import com.erpsystem.erpsystem.repo.BranchRepository;
import com.erpsystem.erpsystem.repo.WarehouseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WarehouseService {
    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    BranchRepository branchRepository;

    public ResponseDTO addWarehouse(WarehouseDTO warehouseDTO){
        ResponseDTO responseDTO;
        Warehouse warehouse=new Warehouse(warehouseDTO);
        warehouse.setBranch(branchRepository.getReferenceById(warehouseDTO.getBranchCode()));
        warehouseRepository.save(warehouse);
        return responseDTO=new ResponseDTO("Warehouse added Successfully",null);

    }







}
