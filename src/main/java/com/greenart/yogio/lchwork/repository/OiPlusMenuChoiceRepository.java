package com.greenart.yogio.lchwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenart.yogio.lchwork.entity.OiPlusMenuChoiceEntity;

@Repository
public interface OiPlusMenuChoiceRepository extends JpaRepository<OiPlusMenuChoiceEntity, Long>{
    
}
