package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.DepartementRepository;

@Service("departementMetier")
public class DepartementMetierImpl implements DepartementMetier{
	
	@Autowired
	@Qualifier("departementRep")
	private DepartementRepository departementRep;
	
	
	
}
