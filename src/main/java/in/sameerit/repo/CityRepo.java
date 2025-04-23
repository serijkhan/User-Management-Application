package in.sameerit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.City;

public interface CityRepo extends JpaRepository<City, Integer>{

	public List<City> findByStateId(Integer stateId);
	
}
