package fr.formation.financings;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinancingsApplication {

    public static void main(String[] args) {
	SpringApplication.run(FinancingsApplication.class, args);
    }

    @Bean
    protected ModelMapper mapper() {
	ModelMapper mapper = new ModelMapper();
	mapper.getConfiguration().setFieldMatchingEnabled(true)
		.setFieldAccessLevel(AccessLevel.PRIVATE);
	return mapper;
    }
}
