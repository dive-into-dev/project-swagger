package dive.dev.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dive.dev.models.UserDetail;


@Component
public class UserServices {
	
	public UserServices() {
		System.out.println("UserServices created");
	}
	
	private List<UserDetail> userDetail = new ArrayList<>();
	
	public void init() {
		userDetail.add(new UserDetail(1L, "FirstName1", "LastName1"));
		userDetail.add(new UserDetail(2L, "FirstName2", "LastName2"));
	}
	
	public List<UserDetail> getUserDetails(){
		return userDetail;
	}
	
	public List<UserDetail> addUserDetails(UserDetail userDetail){
		this.userDetail.add(userDetail);
		return this.userDetail;
	}

}
