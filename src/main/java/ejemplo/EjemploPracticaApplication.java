package ejemplo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploPracticaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjemploPracticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		System.out.println("Probando comandos");
		System.out.println("Comprobando los cambios");
		System.out.println("Si funciono :D");
	}

}
