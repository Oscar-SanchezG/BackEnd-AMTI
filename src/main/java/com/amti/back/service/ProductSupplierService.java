package com.amti.back.service;
import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.persitence.repository.ProductSupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductSupplierService {
    private final ProductSupplierRepository productSupplierRepository;

    @Autowired
    public ProductSupplierService(ProductSupplierRepository productSupplierRepository) {
        this.productSupplierRepository = productSupplierRepository;
    }
    @Transactional
    public List<ProductSupplierEntity> get_products_supplier(String id) {
        return this.productSupplierRepository.get_products_supplier(id);
    }


}
