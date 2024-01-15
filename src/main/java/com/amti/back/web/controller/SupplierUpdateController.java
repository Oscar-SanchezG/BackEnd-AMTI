package com.amti.back.web.controller;

import com.amti.back.persitence.entity.SupplierProductEntity;
import com.amti.back.persitence.entity.SupplierUpdateEntity;
import com.amti.back.service.SupplierUpdateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplierUpdate")
@CrossOrigin
public class SupplierUpdateController {
    private final SupplierUpdateService supplierUpdateService;

    public SupplierUpdateController(SupplierUpdateService supplierUpdateService) {
        this.supplierUpdateService = supplierUpdateService;
    }

    @PutMapping()
    public ResponseEntity<List<SupplierUpdateEntity>> update_supplier_by_key(@RequestBody SupplierUpdateEntity supplierUpdateEntity){

        return ResponseEntity.ok(this.supplierUpdateService.update_supplier_by_key(supplierUpdateEntity));
    }
}
