package com.amti.back.persitence.repository;
import com.amti.back.persitence.entity.ProductEntity;
import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.persitence.entity.ProductSupplierPK;
import com.amti.back.persitence.entity.SupplierProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories

public interface ProductSupplierRepository extends JpaRepository<ProductSupplierEntity, ProductSupplierPK> {
    @Procedure(value = "get_products_supplier")
    public List<ProductSupplierEntity> get_products_supplier(@Param("id_product_fk") String id);
}
