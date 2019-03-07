/**Lance une partie du jeu de MasterMind@param[in] n -
 *  taille des Combinaison@param[in] m - 
 *  nombre de couleurs@param[in] maxcoups - 
 *  nombre de coups maximum de l�humain*/


public static void Mastermind(int n, int m, int maxcoups)
{
	// solution � trouver
	int[] mystere =new int[CMAX];
	genererCmb(mystere,n,m);
	// nombre de coups effectu�s
	int ncoups = 0;
	// proposition == solution ?
	booleantrouve =false;
	// Lance la partie
	while(!trouve && (ncoups < maxcoups))
	{
		// proposition de l�humain
		int[] humain =new int[CMAX];
		saisirCmb(humain,n,m);
		// Un coup de plus
		++ncoups;
		// Nombre de biens et mal plac�s
		int[] nbp =new int[1], nmp =new int[1];
		// Teste la proposition p/r � celle cach�e
		etudierCode(mystere,humain,n,nbp,nmp);
		trouve = (nbp[0] == n);
		// R�sultat du code
		for(intj = 1; j <= nbp; ++j)
		{
			System.out.print("#");
			}
		for(intj = 1; j <= nmp; ++j)
		{
			System.out.print("o");
			}
		System.out.println(s + " (reste " + (maxcoups - ncoups) + " coups)");
	}
	// Affiche le score de la partie
	if(trouve)
	{
	System.out.println("GAGNE en " + ncoups + " coups");
		}
	else
	{
		System.out.print("PERDU... voici la combinaison: ");
	afficherCmb(mystere,n);
		}

}

