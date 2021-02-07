package movies.com.example.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
public class MovieResource {
	
	
	
	@Autowired
	WebClient webClient;
	
	public Flux<Movie> findAll(){
		return webClient.get()
				.uri("/movie/550?api_key=f9b6396fe9f22b00b475563ebc155062")
				.retrieve()
				.bodyToFlux(Movie.class);
		
	}

}
