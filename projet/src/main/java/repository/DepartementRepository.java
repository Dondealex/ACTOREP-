package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

}