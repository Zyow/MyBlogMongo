package fr.mxsz.MonBlog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.MonBlog.entities.Article;
import fr.mxsz.MonBlog.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByUsername(String username);
}
