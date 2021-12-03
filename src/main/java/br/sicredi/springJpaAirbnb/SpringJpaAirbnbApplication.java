package br.sicredi.springJpaAirbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaAirbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAirbnbApplication.class, args);

	}

//	@Bean
//	public CommandLineRunner demo(ImovelRepository repository) {
//
//		return (args) -> {
//			// save a few customers
//			repository.save(new Imovel("Jack", 200, TiposImovel.CASA));
//			repository.save(new Imovel("Chloe", 678, TiposImovel.CASA));
//			repository.save(new Imovel("Kim", 345, TiposImovel.APARTAMENTO));
//		};
//	}
}
