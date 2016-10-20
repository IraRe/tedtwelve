package com.prodyna.ted;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.prodyna.ted.entity.User;
import com.prodyna.ted.service.UserService;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private UserService userService;

    @CrossOrigin()
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public HttpEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello TED #12", HttpStatus.OK);
    }

    @CrossOrigin()
    @RequestMapping(method = RequestMethod.GET, value = "/username")
    public HttpEntity<List<String>> getAllUserNames() {
        List<String> allUserNames = userService.getAllUserNames();
        return new ResponseEntity<List<String>>(allUserNames, HttpStatus.OK);
    }

    @CrossOrigin()
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public HttpEntity<User> saveSurvey(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
