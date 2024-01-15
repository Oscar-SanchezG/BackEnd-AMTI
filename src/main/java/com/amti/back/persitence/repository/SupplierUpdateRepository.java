package com.amti.back.persitence.repository;

import com.amti.back.persitence.entity.SupplierProductEntity;
import com.amti.back.persitence.entity.SupplierUpdateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface SupplierUpdateRepository extends JpaRepository<SupplierUpdateEntity, Integer> {
    @Procedure(value = "update_supplier_by_key")
    public List<SupplierUpdateEntity> update_supplier_by_key(@Param("idproductfk") String intidp,
                                                           @Param("idsupplierfk") String intids,
                                                           @Param("costs") String dlcost,
                                                           @Param("keySuppliers") String strkeys,
                                                             @Param("idsupplierfkN") String intidsn
                                                            );
}
