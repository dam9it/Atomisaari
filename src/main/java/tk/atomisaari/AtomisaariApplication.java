package tk.atomisaari;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import tk.atomisaari.domain.StoryRepository;
import tk.atomisaari.domain.Story;

@SpringBootApplication
public class AtomisaariApplication {
	private static final Logger log = LoggerFactory.getLogger(AtomisaariApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AtomisaariApplication.class, args);
	}
	@Bean
	public CommandLineRunner atomisaari(StoryRepository repository) {
		return (args) -> {
			log.info("Lisätään Stooreja");
			repository.save(new Story("Super Admin", "Tervetuloa tarinoimaan"));
			repository.save(new Story("Mega Admin", "painu sinä runkkari vittuun täältä"));
			
			log.info("Haetaan stoorit");
			for (Story story : repository.findAll()) {
				log.info(story.toString());
			}

		};
}
}