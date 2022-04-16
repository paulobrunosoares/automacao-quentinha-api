package quentinha.configuration;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.RequiredArgsConstructor;
import quentinha.model.AppUser;
import quentinha.model.AppUserRole;
import quentinha.service.UserService;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {

	final UserService userService;

//	  @Bean
//	  public ModelMapper modelMapper() {
//	    return new ModelMapper();
//	  }

	  @Override
	  public void run(String... params) throws Exception {
	    AppUser admin = new AppUser();
	    admin.setUsername("admin");
	    admin.setPassword("admin");
	    admin.setEmail("admin@email.com");
	    admin.setAppUserRoles(new ArrayList<AppUserRole>(Arrays.asList(AppUserRole.ROLE_ADMIN)));

	    userService.signup(admin);

	    AppUser client = new AppUser();
	    client.setUsername("client");
	    client.setPassword("client");
	    client.setEmail("client@email.com");
	    client.setAppUserRoles(new ArrayList<AppUserRole>(Arrays.asList(AppUserRole.ROLE_CLIENT)));

	    userService.signup(client);
	  }

}
