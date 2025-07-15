package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.PolicyHolderDAO;
import com.rays.dto.PolicyHolderDTO;


@Service
@Transactional
public class PolicyHolderService {
	
	@Autowired
	public PolicyHolderDAO dao;

	
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(PolicyHolderDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(PolicyHolderDTO dto) {
		dao.update(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		try {
			PolicyHolderDTO dto = findById(id);
			dao.delete(dto);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional(readOnly = true)
	public PolicyHolderDTO findById(long pk) {
		PolicyHolderDTO dto = dao.findByPk(pk);
		return dto;
	}
}
