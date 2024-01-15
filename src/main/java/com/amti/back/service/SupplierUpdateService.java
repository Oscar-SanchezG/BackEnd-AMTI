package com.amti.back.service;
import com.amti.back.persitence.entity.SupplierProductEntity;
import com.amti.back.persitence.entity.SupplierUpdateEntity;
import com.amti.back.persitence.repository.SupplierUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SupplierUpdateService {
    private final SupplierUpdateRepository supplierUpdateRepository;
    @Autowired
    public SupplierUpdateService(SupplierUpdateRepository supplierUpdateRepository) {
        this.supplierUpdateRepository = supplierUpdateRepository;
    }

    @Transactional
    public List<SupplierUpdateEntity> update_supplier_by_key(SupplierUpdateEntity supplierUpdateEntity) {

        return this.supplierUpdateRepository.update_supplier_by_key(supplierUpdateEntity.getIntidp(),
                supplierUpdateEntity.getIntids(),
                supplierUpdateEntity.getDlcost(),
                supplierUpdateEntity.getStrkeys(),
                supplierUpdateEntity.getIntidsn()
        );
    }
}
