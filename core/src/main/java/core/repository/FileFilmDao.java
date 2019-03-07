package core.repository;

import java.io.FileWriter;
import java.io.IOException;

import core.service.Film;

public class FileFilmDao {

	public void save(Film film) {
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\dvdstore\\films.txt", true);
			writer.write(film.getTitre()+";"+film.getGenre()+";"+film.getNbExemplaire()+"\n");
			writer.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
