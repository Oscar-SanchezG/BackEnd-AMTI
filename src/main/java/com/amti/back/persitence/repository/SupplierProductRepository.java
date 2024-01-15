package com.amti.back.persitence.repository;
import com.amti.back.persitence.entity.SupplierProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface SupplierProductRepository extends JpaRepository<SupplierProductEntity, Integer> {
    @Procedure(value = "delete_supplier_product")
    public List<SupplierProductEntity> delete_supplier_product(@Param("id_product") Integer intidp,@Param("id_supplier") Integer intids);

    @Procedure(value = "put_supplier_by_key")
    public List<SupplierProductEntity> put_supplier_by_key(@Param("idproductfk") Integer intidp,
                                                           @Param("idsupplierfk") Integer intids,
                                                           @Param("costs") BigDecimal dlcost,
                                                           @Param("keySuppliers") String strkeys
                                                           );
}
