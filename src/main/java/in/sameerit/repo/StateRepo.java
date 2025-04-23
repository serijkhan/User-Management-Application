package in.sameerit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.Country;
import in.sameerit.entity.State;

public interface StateRepo extends JpaRepository<State, Integer>{
	
	 List<State> findByCountryId(Integer cid);

}
