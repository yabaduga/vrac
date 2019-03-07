package core.service;

import core.repository.FileFilmDao;

public class FilmService {

		public void registerFilm(Film film) {
			FileFilmDao dao=new FileFilmDao();
			dao.save(film);
}
}
