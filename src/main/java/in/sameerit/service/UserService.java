package in.sameerit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.sameerit.dto.LoginDTO;
import in.sameerit.dto.ResetPwd;
import in.sameerit.dto.UserDTO;
import in.sameerit.entity.User;

@Service
public interface UserService {
	
	User doRegister(UserDTO dto);
	
	boolean updatePwd(ResetPwd resetPwd);
	
	Optional<User> getUserById(Integer uid);
	
	Optional<User> getUserByEmail(String email);
	
	void deleteUser(User user);
	
	String doLogin(LoginDTO login);
	

}
