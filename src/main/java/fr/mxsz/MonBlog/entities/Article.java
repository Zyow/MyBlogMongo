package fr.mxsz.MonBlog.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document //Version Mongo (NO SQL)
//@Entity <- Version SQL
//@Table(name = "Nom de la table")
public class Article {

	/* En MYSQL ça donne ceci
	 * @Id
	 * @GeneratedValue(strategy = GeneratedType.IDENTITY) -> AutoIncrement
	 */
	
	@Id
	private String id; //Mango c'est une chaine de characteres
	private String title;
	private String slug;
	private String content;
}
