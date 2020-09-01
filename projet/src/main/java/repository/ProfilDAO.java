package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entities.Compte;
import entities.Profil;

public interface ProfilDAO extends JpaRepository<Profil, Long>{

//	@Query("select c.* from compte c, profil p where p.id = ?1" )
//	List<Compte> findAllCompteByidProfil(Long idProfil);
}
