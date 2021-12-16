package fr.mxsz.MonBlog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.MonBlog.entities.Article;

public interface ArticleRepository extends MongoRepository<Article, String>{

	//Effecturer une recherche par Slug
	Article findBySlug(String slug);
	
	Article findByIdOrderByTitle();
	
}
