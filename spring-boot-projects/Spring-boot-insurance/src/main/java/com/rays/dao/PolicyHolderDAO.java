package com.rays.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.rays.dto.PolicyHolderDTO;

@Repository
public class PolicyHolderDAO {
	
	@PersistenceContext
	public EntityManager entityManager;
	
	public long add(PolicyHolderDTO dto) {
		entityManager.persist(dto);
		return dto.getId();
	}

	public void update(PolicyHolderDTO dto) {
		entityManager.merge(dto);
	}

	public void delete(PolicyHolderDTO dto) {
		entityManager.remove(dto);
	}

	public PolicyHolderDTO findByPk(long pk) {
		PolicyHolderDTO dto = entityManager.find(PolicyHolderDTO.class, pk);
		return dto;
	}

}
