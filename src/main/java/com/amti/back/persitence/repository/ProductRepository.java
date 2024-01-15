package com.amti.back.persitence.repository;

import com.amti.back.persitence.entity.ProductEntity;
import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.persitence.entity.UseriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Procedure(value = "get_all_products")
    public List<ProductEntity> getAllProducts();

    @Procedure(value = "get_products_by_key")
    public List<ProductEntity> get_products_by_key(@Param("key_product") String key);

    @Procedure(value = "get_products_by_type")
    public List<ProductEntity> get_products_by_type(@Param("id_type_fk") String id);

    @Procedure(value = "get_products_by_id")
    public List<ProductEntity> get_products_by_id(@Param("id_product") String id);
    @Procedure(value = "delete_products_by_id")
    public List<ProductEntity> delete_products_by_id(@Param("id_product") String id);

    @Procedure(value = "update_products_by_id")
    public List<ProductEntity> update_products_by_id(@Param("id_product") Integer intid,
                                                     @Param("id_type_fk") String inttype,
                                                     @Param("key_product") String strkey,
                                                     @Param("price") Double intprice,
                                                     @Param("name") String strname,
                                                     @Param("available") Boolean stravailable,
                                                     @Param("description") String strdescription);

    @Procedure(value = "add_products")
    public String add_products(@Param("id_product") Integer intid,
                                                     @Param("id_type_fk") String inttype,
                                                     @Param("key_product") String strkey,
                                                     @Param("price") Double intprice,
                                                     @Param("name") String strname,
                                                     @Param("available") Boolean stravailable,
                                                     @Param("description") String strdescription);
}
