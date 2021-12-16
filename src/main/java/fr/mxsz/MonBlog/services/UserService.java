package fr.mxsz.MonBlog.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import fr.mxsz.MonBlog.dtos.GetUserProfilDTO;
import fr.mxsz.MonBlog.entities.User;
import fr.mxsz.MonBlog.repositories.UserRepository;

public class UserService {

	private UserRepository repository;
	private ModelMapper mapper;
	
	public UserService(
			UserRepository repository,
			ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
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

	public GetUserProfilDTO getProfil(String id) {
		Optional<User> user = this.repository.findById(id);
		
		//Mapping > https://mvnrepository.com/artifact/org.modelmapper/modelmapper
		ModelMapper mapper = new ModelMapper();
		GetUserProfilDTO getUserProfilDTO = mapper.map(user.get(),GetUserProfilDTO.class);
		
		return getUserProfilDTO;
		
	}
}