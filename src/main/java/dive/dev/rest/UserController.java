package dive.dev.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dive.dev.models.UserDetail;
import dive.dev.services.UserServices;


@RestController
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	@GetMapping("/")
	String init(){
		return "Welcome";
	}
	
	@GetMapping("/users")
	List<UserDetail> getUsers() {
		return userServices.getUserDetails();
	}
	
	@PostMapping(path = "/users")
	List<UserDetail> addUser(@RequestBody UserDetail userDetail){
		return userServices.addUserDetails(userDetail);
	}

}
