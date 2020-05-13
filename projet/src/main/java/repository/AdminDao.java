package repository;

import java.util.Date;
import java.util.List;

import entities.Administrateur;

public interface AdminDao {
	public Administrateur insertAdmin(String idtf, String mdp, String nom, String prenom, String numEmp,
			Date dateIn);
	public void AssAdminProfil(Long idP, Long idA);
	public Administrateur selectAdminById(Long idAdmin);
	public List<Administrateur> selectAllAdmin();
	public Administrateur updateAdmin(Administrateur ad);
	public Integer deleteAdminById(Long idAdmin);
	public Administrateur verifyAdmin(String idtf, String mdp);
	public Boolean findAdmin(String idtf, String mdp);
}