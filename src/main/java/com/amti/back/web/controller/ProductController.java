package com.amti.back.web.controller;

import com.amti.back.persitence.entity.ProductEntity;
import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProductSupplier(){
        return ResponseEntity.ok(this.productService.getAllProducts());
    }
    @GetMapping("/key/{key}")
    public ResponseEntity<List<ProductEntity>> get_products_by_key(@PathVariable String key){
        return ResponseEntity.ok(this.productService.get_products_by_key(key));
    }

    @GetMapping("/type/{id}")
    public ResponseEntity<List<ProductEntity>> get_products_by_type(@PathVariable String id){
        return ResponseEntity.ok(this.productService.get_products_by_type(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProductEntity>> get_products_by_id(@PathVariable String id){
        return ResponseEntity.ok(this.productService.get_products_by_id(id));
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<List<ProductEntity>> delete_products_by_id(@PathVariable String id){
        return ResponseEntity.ok(this.productService.delete_products_by_id(id));
    }
    @PutMapping ("/update")
    public ResponseEntity<List<ProductEntity>> update_products_by_id(@RequestBody ProductEntity productEntity){
        return ResponseEntity.ok(this.productService.update_products_by_id(productEntity));
    }

    @PostMapping ("/add")
    public ResponseEntity<String> add_products(@RequestBody ProductEntity productEntity){
        return ResponseEntity.ok(this.productService.add_products(productEntity));
    }
}
