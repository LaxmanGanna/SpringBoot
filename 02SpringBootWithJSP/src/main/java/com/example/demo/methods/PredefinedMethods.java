package com.example.demo.methods;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employ;

public interface PredefinedMethods extends JpaRepository<Employ, Integer> {

}
