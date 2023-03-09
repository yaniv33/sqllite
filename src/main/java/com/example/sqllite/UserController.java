package com.example.sqllite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private MuserRepository userRepository;

    @GetMapping("/getHello")
    public String getHello() {
        return "Hello";
    }

	@GetMapping("/getUsers")
	public List<Muser> getUsers() {
		return userRepository.findAll();
	}

    @RequestMapping("/doSave")
    public Muser getUser() {
        Muser user = new Muser();
        user.setUserName("gho");
        user.setUserSex(UserSexEnum.WOMAN);
        user.setId(3L);
        user.setPassWord("ydfsdf");

        Muser usere = userRepository.save(user);

        return usere;
    }

}
