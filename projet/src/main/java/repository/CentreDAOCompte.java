package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Compte;
import entities.Profil;

@Repository
@Transactional
public class CentreDAOCompte implements JpaRepository<Compte, Long> {	
	
	@Autowired
	private EntityManager em;

	public Page<Compte> findAll(Pageable pageable) {
		return null;
	}

	
	public <S extends Compte> S save(S entity) {
		return null;
	}

	
	public Optional<Compte> findById(Long id) {
		return null;
	}

	
	public boolean existsById(Long id) {
		return false;
	}

	
	public long count() {
		return 0;
	}

	
	public void deleteById(Long id) {
		
	}

	
	public void delete(Compte entity) {
		
	}

	
	public void deleteAll(Iterable<? extends Compte> entities) {
		
	}

	
	public void deleteAll() {
		
	}

	
	public <S extends Compte> Optional<S> findOne(Example<S> example) {
		return null;
	}

	
	public <S extends Compte> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	
	public <S extends Compte> long count(Example<S> example) {
		return 0;
	}

	
	public <S extends Compte> boolean exists(Example<S> example) {
		return false;
	}


	public List<Compte> findAll() {
		return null;
	}

	
	public List<Compte> findAll(Sort sort) {
		return null;
	}

	
	public List<Compte> findAllById(Iterable<Long> ids) {
		return null;
	}

	
	public <S extends Compte> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	
	public void flush() {
		
	}

	
	public <S extends Compte> S saveAndFlush(S entity) {
		return null;
	}

	
	public void deleteInBatch(Iterable<Compte> entities) {
		
	}

	
	public void deleteAllInBatch() {
		
		
	}

	
	public Compte getOne(Long id) {
		
		return null;
	}


	public <S extends Compte> List<S> findAll(Example<S> example) {
		return null;
	}


	public <S extends Compte> List<S> findAll(Example<S> example, Sort sort) {
		
		return null;
	}

}
