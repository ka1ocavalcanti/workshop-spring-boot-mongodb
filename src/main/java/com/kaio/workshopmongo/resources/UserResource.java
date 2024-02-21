package com.kaio.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaio.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User kaio = new User("1", "Kaio Costa", "kaio@gmail.com");
		User iza = new User("2", "Izabelle Carvalho", "iza@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(kaio,iza));
		return ResponseEntity.ok().body(list);
	}
}
