package com.example.backendproject.restControllers;

import java.security.Principal;
import java.util.List;

import com.example.backendproject.entities.Role;
import com.example.backendproject.entities.User;
import com.example.backendproject.service.UserService;
import com.example.backendproject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@Transactional
public class UserRESTController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(path="all",method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}

	@PostMapping("addrole")
	public Role Addrole(@RequestBody Role role){
		return userService.addRole(role);
	}
	@PostMapping("addroleauser/{username}/{rolename}")
	public void addroletouer(@PathVariable("username") String username,@PathVariable("rolename") String rolename){
		userService.addRoleToUser(username,rolename);
	}
	@PostMapping("/add")
	public User register(@RequestBody User user) {
		 return userService.register(user);
	}



	@PostMapping("/forgetpassword/{email}")
	public User forgetPass(@PathVariable("email") String email){
		return userService.ForgetPassword(email);
	}

	@PostMapping("/resetpassword/{email}/{newpass}/{cofirm}")
	public void RestPassword(@PathVariable("email") String email,@PathVariable("newpass") String newpass,@PathVariable("cofirm") String cofirm) {
		userService.RestPassword(email,newpass,cofirm);
	}
	@PostMapping("/activecompte/{username}")
	public String activecompte(@PathVariable("username") String username) {
		userService.activecompte(username);
		return "activated";
	}


	

}
