package fr.mxsz.MonBlog.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.MonBlog.entities.User;
import fr.mxsz.MonBlog.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	UserService service;

	public UserController(UserService service) {
		this.service = service;
	}
	
	/**
	 * Méthode qui permet de rechercher tout les utilisateurs
	 * @return List<User>
	 */
	@GetMapping
	public List<User> findAll() {
		return service.findAll();
	}
	
	/**
	 * Méthode qui permet d'ajouter un utilisateur
	 * @param user
	 * @return User
	 */
	@PostMapping
	public User save(@RequestBody User user) {
		return this.service.save(user);
	}
	
	/**
	 * Méthode qui permet de mettre à jour un utilisateur
	 * @param user
	 * @return User
	 */
	@PutMapping
	public User update(@RequestBody User user) {
		return this.service.save(user);
	}
	
	/**
	 * Méthode qui permet de supprimer un utilisateur
	 * @param user
	 */
	@DeleteMapping
	public void delete (@RequestBody User user) {
		this.service.delete(user);
	}
}
