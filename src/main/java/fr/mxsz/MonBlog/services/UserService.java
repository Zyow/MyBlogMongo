package fr.mxsz.MonBlog.services;

import java.util.List;
import java.util.Optional;

import fr.mxsz.MonBlog.entities.User;
import fr.mxsz.MonBlog.repositories.UserRepository;

public class UserService {

	UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User>findAll(){
		return this.repository.findAll();
	}
	
	public Optional<User> findById(String id) {
		return this.repository.findById(id);
	}
	
	public User findByUsername(String username) {
		return this.repository.findByUsername(username);
	}
	
	public User save(User user) {
		return this.repository.save(user);
	}
	
	public void delete(User user) {
		this.repository.delete(user);
	}
}
