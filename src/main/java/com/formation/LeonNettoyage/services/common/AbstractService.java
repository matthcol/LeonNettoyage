package com.formation.LeonNettoyage.services.common;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import exceptions.ClientNotFoundException;

@Transactional
public abstract class AbstractService<T> implements IServiceActions<T> {

	@Autowired
	public abstract JpaRepository<T, Long> getRepo();
	
	@Override
	public List<T> findAll() {
		return getRepo().findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public T findOne(Long id) {
		Optional<T>opt = getRepo().findById(id);
		if (opt.isEmpty()) {
			throw new ClientNotFoundException("Pas de résultat");
		}
		return opt.get();
	}

	@Override
	public boolean deleteById(Long id) {
		return false;
	}

	@Override
	public boolean delete(T t) {
		return false;
	}
	
	@PostMapping
	@Override
	public T save(@RequestBody T t) {
		return getRepo().save(t);
	}
	
}