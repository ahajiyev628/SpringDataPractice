package org.example.spring.dao.repository;

import org.example.spring.dao.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository // optional annotation because CrudRepository (or JpaRepository) uses @NoRepositoryBean
public interface CardRepository extends JpaRepository<CardEntity, Long>, JpaSpecificationExecutor<CardEntity> {
}
