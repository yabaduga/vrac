package core;

import core.controller.DefaultFilmController;
import core.service.Film;
import core.service.FilmService;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultFilmController controller = new DefaultFilmController();
		controller.registerFilmFromConsoleInput();
		
		
		
		}

}
