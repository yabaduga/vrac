package core;

import core.controller.DefaultLivreController;

public class App2 {

public static void main (String[] args) {
		DefaultLivreController controller = new DefaultLivreController();
		controller.registerLivreFromConsoleInput();
}
	
}