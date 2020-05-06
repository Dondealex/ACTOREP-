package repository;

import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import entities.*;

public interface ProfilRepository extends JpaRepository<Profil, Long> {
	
	@Query("select p.services from Profil p where p.id = :x") 
	public List<Service> findServicesByProfil(@Param("x")Long id);
	
	@Query("select p.reseaux from Profil p where p.id = :x") 
	public List<ReseauSocial> findReseauxByProfil(@Param("x")Long id);
	
	@Query("select p from Profil p where p.statut.id = :x")
	public List<Profil> findProfilActif(@Param("x")Long id);

}
