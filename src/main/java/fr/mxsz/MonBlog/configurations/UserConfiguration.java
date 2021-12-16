package fr.mxsz.MonBlog.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.MonBlog.repositories.UserRepository;
import fr.mxsz.MonBlog.services.UserService;

@Configuration
public class UserConfiguration {

	@Bean
	public UserService userService(
			UserRepository repository,
			ModelMapper mapper
			) {
		return new UserService(repository, mapper);
	}
}
