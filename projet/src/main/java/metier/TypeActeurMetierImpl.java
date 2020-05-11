package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.TypeActeurDao;

@Service("typeActeurMetier")
public class TypeActeurMetierImpl implements TypeActeurMetier{
	
	@Autowired
	@Qualifier("typeActeurDao")
	private TypeActeurDao typeActeurDao;
	
	

	
	
}
