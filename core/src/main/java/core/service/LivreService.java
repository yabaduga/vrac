package core.service;

import core.repository.FileLivreDAO;

public class LivreService {
	public void registerLivre(Livre livre) {
		FileLivreDAO dao=new FileLivreDAO();
		dao.save(livre);
	}

}
