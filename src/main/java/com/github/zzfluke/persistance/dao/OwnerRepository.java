package com.github.zzfluke.persistance.dao;

import com.github.zzfluke.persistance.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
