package in.sameerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{
    
}

