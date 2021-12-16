package fr.mxsz.MonBlog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.MonBlog.entities.User;

//@Component -> Des SINGLETONS
//@Controller -> Un Singleton
@RestController
@RequestMapping("/exemples")
public class ExemplesController {
	
	//Exemples
	@GetMapping
	public String demo(){
		return "Hello world!";
	}	
	
	@GetMapping ("/bye")
	public String bye(){
		return "Bye world!";
	}	
	
	@GetMapping("hello/{prenom}")
	public String hello(@PathVariable String prenom){
		return "Hello " + prenom + "!";
	}
	
	@GetMapping("name")
	public String name(
			@RequestParam String firstname,
			@RequestParam (required = false) String lastname
			){
		
		return firstname + " " + lastname;
	}
	
	
	//PostMan
	//BODY > JSON > RAW
		//	{
		//	    "firstname" : "Szczypa",
		//	    "lastname" : "Maxime"
		//	}
	@PostMapping
	public String JePost(@RequestBody User utilisateur) {
		return "Hello " + utilisateur.getFirstname() + " " + utilisateur.getLastname() + " !";
	}
}
