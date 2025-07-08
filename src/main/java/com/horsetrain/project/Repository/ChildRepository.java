package com.horsetrain.project.Repository;

import com.horsetrain.project.Entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository  extends JpaRepository<Child, Long> {
}
