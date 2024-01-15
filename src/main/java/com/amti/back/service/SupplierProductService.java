package com.amti.back.service;

import com.amti.back.persitence.entity.ProductEntity;
import com.amti.back.persitence.entity.SupplierProductEntity;
import com.amti.back.persitence.repository.SupplierProductRepository;
import com.amti.back.service.dto.SupplierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SupplierProductService {
    private final SupplierProductRepository supplierProductRepository;
    @Autowired
    public SupplierProductService(SupplierProductRepository supplierProductRepository) {
        this.supplierProductRepository = supplierProductRepository;
    }

    @Transactional
    public List<SupplierProductEntity> delete_supplier_product(SupplierDto supplierDto) {
        return this.supplierProductRepository.delete_supplier_product(supplierDto.getIntidp(),supplierDto.getIntids());
    }

    @Transactional
    public List<SupplierProductEntity> put_supplier_by_key(SupplierProductEntity supplierProductEntity) {
        System.out.println("hola:" + supplierProductEntity.toString());
        return this.supplierProductRepository.put_supplier_by_key(supplierProductEntity.getIntidp(),
                supplierProductEntity.getIntids(),
                supplierProductEntity.getDlcost(),
                supplierProductEntity.getStrkeys()
                );
    }
}
