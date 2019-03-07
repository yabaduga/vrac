package core.repository;


import java.io.FileWriter;
import java.io.IOException;

import core.service.Livre;

public class FileLivreDAO {

	public void save(Livre livre) {
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\dvdstore\\livres.txt", true);
			writer.write(livre.getTitre()+";"+livre.getAuteur()+";"+livre.getNbExemplaire()+"\n");
			writer.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}