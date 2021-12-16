package fr.mxsz.MonBlog.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.MonBlog.repositories.ArticleRepository;
import fr.mxsz.MonBlog.services.ArticleService;

@Configuration
public class ArticleConfiguration {

	@Bean
	public ArticleService articleService(ArticleRepository repository) { // on ajoute ArticleRepository repository parce que c'est une interface
		return new ArticleService(repository);
	}

}
