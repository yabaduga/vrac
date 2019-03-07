package core.controller;

import java.util.Scanner;

import core.service.Film;
import core.service.FilmService;

public class DefaultFilmController {

		public void registerFilmFromConsoleInput() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Quel est le titre ?");
			String titre =sc.nextLine();
			System.out.println("Quel est le genre ?");
			String genre =sc.nextLine();
			System.out.println("Nombre d'exemplaires ?");
			int nb =sc.nextInt();
			
			Film film=new Film();
			film.setTitre(titre);
			film.setGenre(genre);
			film.setNbExemplaire(nb);

			FilmService service=new FilmService();
			service.registerFilm(film);
		}
} 
