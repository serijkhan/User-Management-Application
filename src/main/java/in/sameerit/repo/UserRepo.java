package in.sameerit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
	Optional<User> findByEmailAndPwd(String email,String pwd);
}
