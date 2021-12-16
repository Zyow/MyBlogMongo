package fr.mxsz.MonBlog.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.MonBlog.entities.Article;
import fr.mxsz.MonBlog.services.ArticleService;


@RestController
@RequestMapping("articles")
public class ArticlesController {
	
	//Je fais de L'IoD
	//@Autowired Pas besoin avec Configuration et Constructeur
	//J'initialise une variable d'instance qui contiendra mon service pour le moment elle est null
	ArticleService service;
	
	
	/**
	 * Dans le constructeur : J'injecte la dépendance ArticleService
	 * Qui va me permettre, grâce à Sring de récupérer une instance
	 * @param service
	 */
	public ArticlesController(ArticleService service) {
		super();
		this.service = service;
	}

	/**
	 * Méthode qui permet de retourner une liste d'articles
	 * @return
	 */
	@GetMapping
	public List<Article> findAll() {
		return service.findAll();
	}
	
	/**
	 * Méthode qui permet de retourner un article par rapport à son slug
	 * @param slug String
	 * @return String
	 */
	@GetMapping ("{slug}")
	public Article findBySlug(@PathVariable String slug) {
		return this.service.findBySlug(slug);
	}

	/**
	 * Méthode qui permet de sauvegarder un article
	 * @param article Article
	 * @return String
	 */
	@PostMapping
	public Article save(@RequestBody Article article) {
		return this.service.save(article);
	}
	
	/**
	 * Méthode qui permet de mettre à jour un article
	 * @param article Article
	 * @return String
	 */
	@PutMapping
	public Article update(@RequestBody Article article) {
		//return "Update de l'article " + article.getSlug();
		return this.service.save(article);
	}
	
	/**
	 * Méthode qui permet de supprimer un article
	 * @param article Article
	 */
	@DeleteMapping
	public void delete(@RequestBody Article article) {
		this.service.delete(article);
		//System.out.println("Supprime l'article " + article.getSlug());
	}
	
	//Postman
		//	{
		//	    "title" : "Hello World",
		//	    "slug" : "hello-world",
		//	    "content" : "Bonjour le monde!"
		//	}
}
