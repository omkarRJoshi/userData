package com.dassault.entryRest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestProgram {
	ArrayList<String> names;
	
	public SimpleRestProgram() {
		names = new ArrayList<>();
		names.add("akki timande");
		names.add("adesh");
		names.add("mustejab");
	}
	
	@GetMapping("/")
	public String startPage() {
		return "Welcome to dummy project";
	}
	
	
	@GetMapping("/getNames")
	public ArrayList<String> getMessage() {
		
		return names;
	}
	
	@PostMapping("/addName")
	public boolean addNames(@RequestBody String name) {
		return names.add(name);
	}
	
}
