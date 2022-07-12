package com.ssischaefer.ssi_shaefer.repository;

import com.ssischaefer.ssi_shaefer.entity.PrinterEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrinterRepo extends CrudRepository<PrinterEntity,Long> {
    List<PrinterEntity> findByName(String name);
}
