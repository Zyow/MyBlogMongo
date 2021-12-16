package fr.mxsz.MonBlog.services;

import java.util.List;

import fr.mxsz.MonBlog.entities.Article;
import fr.mxsz.MonBlog.repositories.ArticleRepository;


/**
 * Le service permet d'appliquer ma couche métier
 * Actuellement ma couche métier ne fais pas grand chose
 * Elle va juste communiquer avec une BDD
 * @author Szczy
 *
 */
//@Service Pas besoin si on passe par Configuration
public class ArticleService {


	//Je simule une base de données
	//"Bouchon" Simulation des services de la BDD
	//Car pas de BDD
	//private List<Article> articles = new ArrayList<Article>();
	
	//Dans le constructeur je met de faux articles
	//public ArticleService() {
	//	super();
	//	this.articles.add(new Article("toto en vacances", "toto-en-vacances", "Blablablba"));
	//	this.articles.add(new Article("toto a l'école", "toto-a-l-ecole", "Blablablba"));
	//}
	
	ArticleRepository repository;
	
	public ArticleService(ArticleRepository repository) {
		this.repository = repository;
	}

	
	/**
	 * On récupére une liste d'articles
	 * @return List<Article>
	 */
	public List<Article> findAll(){
		
		return this.repository.findAll();
		//TODO Cette méthode doit permettre de communiquer avec le repository
		//
		//return this.articles;
	}
	
	public Article findBySlug(String slug) {
		return this.repository.findBySlug(slug);
	}
	
	/**
	 * On peu sauvegarder un article
	 * Ajouter à la liste "articles", un nouvel article
	 * @param Article
	 * @return Article
	 */
	public Article save(Article article) {
		return this.repository.save(article);
//		this.articles.add(article);
//		return article;
	}
	
	/**
	 * Méthode qui pêrmet de supprimer un article
	 * @param article
	 * @return
	 */
	
	public void delete(Article article) {
		this.repository.delete(article);
	}
}
