package com.amti.back.web.controller;
import com.amti.back.persitence.entity.SupplierProductEntity;
import com.amti.back.service.SupplierProductService;
import com.amti.back.service.dto.SupplierDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
@CrossOrigin
public class SupplierController {
    private final SupplierProductService supplierProductService;

    public SupplierController(SupplierProductService supplierProductService) {
        this.supplierProductService = supplierProductService;
    }

    @PostMapping("/delete")
    public ResponseEntity<List<SupplierProductEntity>> delete_supplier_product(@RequestBody SupplierDto dto){

        return ResponseEntity.ok(this.supplierProductService.delete_supplier_product(dto));
    }

    @PostMapping("/add")
    public ResponseEntity<List<SupplierProductEntity>> put_supplier_by_key(@RequestBody SupplierProductEntity supplierProductEntity){

        return ResponseEntity.ok(this.supplierProductService.put_supplier_by_key(supplierProductEntity));
    }
}
