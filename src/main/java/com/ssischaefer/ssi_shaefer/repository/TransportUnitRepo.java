package com.ssischaefer.ssi_shaefer.repository;

import com.ssischaefer.ssi_shaefer.entity.TransportUnitEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransportUnitRepo extends CrudRepository<TransportUnitEntity, Long> {
    List<TransportUnitEntity> findByName(String name);
}
