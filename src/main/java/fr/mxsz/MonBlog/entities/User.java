package fr.mxsz.MonBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//LOMBOK pemet de génerer automatiquement les Get, Set, ToString,...
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	private String id; 
	private String nom;
	private String prenom;
	private String email;
	private String username;
}
