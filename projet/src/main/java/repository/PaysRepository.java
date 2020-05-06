package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Pays;

public interface PaysRepository extends JpaRepository<Pays, Long> {

}
