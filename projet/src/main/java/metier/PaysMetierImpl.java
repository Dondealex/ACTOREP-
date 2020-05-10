package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.PaysRepository;

@Service("paysMetier")
public class PaysMetierImpl implements PaysMetier{
	
	@Autowired
	@Qualifier("paysRep")
	private PaysRepository paysRep;

}
