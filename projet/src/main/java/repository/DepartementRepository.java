package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Departement;

@Repository("departementRep")
@Transactional
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
