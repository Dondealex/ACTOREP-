package repository;

import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.*;

@Repository("profilRep")
@Transactional
public interface IProfilRepository extends JpaRepository<Profil, Long> {
	
	@Query("select p.services from Profil p where p.id = :x") 
	public List<Service> findServicesByProfil(@Param("x")Long id);
	
	@Query("select p.reseaux from Profil p where p.id = :x") 
	public List<ReseauSocial> findReseauxByProfil(@Param("x")Long id);
	
	@Query("select p from Profil p where p.statut.id = :x")
	public List<Profil> findProfilByIdStatus(@Param("x")String id);
	


}