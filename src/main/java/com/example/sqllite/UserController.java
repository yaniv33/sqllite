package com.example.sqllite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getHello")
    public String getHello() {
        return "Hello";
    }

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

    @RequestMapping("/doSave")
    public User getUser() {
        User user = new User();
        user.setUserName("gho");
        user.setUserSex(UserSexEnum.WOMAN);
        user.setId(3L);
        user.setPassWord("ydfsdf");

        User usere = userRepository.save(user);

        return usere;
    }

}
