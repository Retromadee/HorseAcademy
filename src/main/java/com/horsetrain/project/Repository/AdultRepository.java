package com.horsetrain.project.Repository;

import com.horsetrain.project.Entity.Adult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdultRepository extends JpaRepository<Adult,Long> {
}
