package com.example.demo.service;

import static org.junit.Assert.*;

import java.net.SocketException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.user.User;
import com.example.demo.service.user.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	public UserServiceTest() {
	}

	@Autowired
	UserService userService;


	
}
