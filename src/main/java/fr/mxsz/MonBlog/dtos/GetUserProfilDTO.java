package fr.mxsz.MonBlog.dtos;

import fr.mxsz.MonBlog.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetUserProfilDTO {

	private String id; 
	private String nom;
	private String prenom;
}
