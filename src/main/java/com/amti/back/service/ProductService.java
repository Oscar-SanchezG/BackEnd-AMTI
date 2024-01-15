package com.amti.back.service;

import com.amti.back.persitence.entity.ProductEntity;


import com.amti.back.persitence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Transactional
    public List<ProductEntity> getAllProducts() {
        return this.productRepository.getAllProducts();
    }

    @Transactional
    public List<ProductEntity> get_products_by_key(String key) {
        return this.productRepository.get_products_by_key(key);
    }

    @Transactional
    public List<ProductEntity> get_products_by_type(String id) {
        return this.productRepository.get_products_by_type(id);
    }

    @Transactional
    public List<ProductEntity> get_products_by_id(String id) {
        return this.productRepository.get_products_by_id(id);
    }

    @Transactional
    public List<ProductEntity> delete_products_by_id(String id) {
        return this.productRepository.delete_products_by_id(id);
    }

    @Transactional
    public List<ProductEntity> update_products_by_id(ProductEntity productEntity) {
        return this.productRepository.update_products_by_id(productEntity.getIntid(),
                                                            productEntity.getInttype(),
                                                            productEntity.getStrkey(),
                                                            productEntity.getIntprice(),
                                                            productEntity.getStrname(),
                                                            productEntity.isStravailable(),
                                                            productEntity.getStrdescription());
    }
    @Transactional
    public String add_products(ProductEntity productEntity) {
        return this.productRepository.add_products(productEntity.getIntid(),
                productEntity.getInttype(),
                productEntity.getStrkey(),
                productEntity.getIntprice(),
                productEntity.getStrname(),
                productEntity.isStravailable(),
                productEntity.getStrdescription());
    }
}
