  package com.yuki.monster.Controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yuki.monster.entity.User;
import com.yuki.monster.repository.UserRepository;

public class UserControllor {

	@Autowired
	UserRepository userRepository;
	
	
	
	@GetMapping("/userlogin")
	public String login(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "userlogin";

	}
	
	@PostMapping("/students")
	public String loginUsers(@ModelAttribute("user") User user)
	{
		System.out.println(user.getUserId());
		String userId=user.getUserId();
		User userdata=userRepository.findByUserId(userId);
		
		if (user.getPassword().equals(userdata.getPassword()))
		{
			return "students";
			
		}
		return "students";
		
			
	}
	
	
}
