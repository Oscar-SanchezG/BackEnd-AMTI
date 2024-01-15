package com.amti.back.web.controller;

import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.service.ProductSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productSupplier")
@CrossOrigin
public class ProductSupplierController {
    private final ProductSupplierService productSupplierService;
    @Autowired
    public ProductSupplierController(ProductSupplierService productSupplierService) {
        this.productSupplierService = productSupplierService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProductSupplierEntity>> get_products_supplier(@PathVariable String id){
        return ResponseEntity.ok(this.productSupplierService.get_products_supplier(id));
    }



}
