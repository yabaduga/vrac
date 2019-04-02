package fr.axa.cyril.Jeu;

import fr.axa.cyril.Menu.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <b>Classe abstraite pour un jeu</b>
 *     Intègre l'implémentation des méthodes réutilisables par n'importe quel jeu
 *     Les méthodes présentant des spécificités en fonction des jeux sont déclarées abstraites, et implémentées dans les classes dédiées
 *
 * @author Cyril Lepretre
 * @version 1.0
 */
public abstract class Jeu {

    /**
     * Configuration du jeu
     */
    private final Configuration configuration;
    private int nombreEssaisRestants;
    private boolean jeuFini;
    private static Logger logger = LogManager.getLogger(Jeu.class);

    /**
     * Constructeur de jeu
     * @param configuration La configuration issue des paramètres renseignés dans le fichier config.properties
     */
    protected Jeu (Configuration configuration) {
        this.configuration = configuration;
        this.jeuFini = false;
        this.nombreEssaisRestants = configuration.getMaxEssais();
    }

    public boolean getJeuFini() {
        return jeuFini;
    }

    protected void setJeuFini(boolean fini) {
        this.jeuFini = fini;
    }

    public int getNombreEssaisRestants() {
        return nombreEssaisRestants;
    }

    protected void setNombreEssaisRestants(int nombreEssaisRestants) {
        this.nombreEssaisRestants = nombreEssaisRestants;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Génération d'une combinaison au hasard, d'une taille fournie en paramètre, à partir d'une liste renseignée dans le config.properties
     * @param tailleCombinaison La longueur de la combinaison à générer
     * @return La combinaison
     */
    public String genererCombinaison(int tailleCombinaison) {
        logger.info("Génération d'une combinaison de taille " + tailleCombinaison);
        StringBuilder combinaison = new StringBuilder(tailleCombinaison);
        for (int i=0; i<tailleCombinaison; i++) {
            combinaison.append(this.configuration.getListeValeursPossibles().charAt(this.genererChiffreRandom(tailleCombinaison)));
        }
        logger.debug("Conbinaison générée : " + combinaison.toString());
        return combinaison.toString();
    }

    /**
     * Génération d'un chiffre aléatoire
     * @param borneSup La borne supérieure limitant la valeur du chiffre généré
     * @return Le chiffre généré alétoirement
     */
    protected int genererChiffreRandom (int borneSup) {
        logger.info("Génération d'un chiffre random de borne supérieure " + borneSup);
        if (borneSup < 1) {
            System.out.println("Erreur de borne supérieure, qui doit être supérieure ou égale à 1");
            logger.error("Erreur de borne supérieure, qui doit être supérieure ou égale à 1");
            return 0;
        }
        else {
            return (int)(Math.random()*borneSup) + 1;
        }
    }

    /**
     * Méthode abstraite de vérification de combinaison
     * @param saisieUtilisateur La combinaison fournie par l'utilisateur
     * @param combinaisonAtrouver La combinaison à trouver
     * @return true ou false pour indiquer si la combinaison fournie est celle attendue
     */
    public abstract boolean verifierCombinaison(String saisieUtilisateur, String combinaisonAtrouver);

    /**
     * Méthode abstraite de proposition de combinaison
     * @param combinaisonEnCours La dernière combinaison fournie à l'utilisateur
     * @param saisieUtilisateur La réponse qu'a apporté l'utilisateur suite à la dernière combinaison proposée, qui est l'autre paramètre
     * @return Une nouvelle proposition
     */
    public abstract String proposerCombinaison(String combinaisonEnCours, String saisieUtilisateur);

    /**
     * Méthode abstraite renvoyant l'évaluation de la proposition fournie par l'utilisateur
     * @param saisieUtilisateur La proposition fournie par l'utilisateur
     * @param combinaisonAtrouver La combinaison secrète à trouver
     * @return Le message à afficher à l'utilisateur
     */
    public abstract String calculerReponseCombinaison(String saisieUtilisateur, String combinaisonAtrouver);

    /**
     * Méthode abastraite visant à identifier une éventuelle erreur fonctionnelle dans la réponse fournie par l'utilisateur
     * Ex : Dans Recherche +/-, si l'ordinateur fournit la proposition "00000" et que l'opposant répond un "-"
     * @param saisieUtilisateur Réponse de l'utilisateur à la proposition faite au préalable
     * @return true si OK, false sinon
     */
    public abstract boolean verifierErreurFonctionnelle(String saisieUtilisateur);

    /**
     * Méthode abstraite pour déterminer si le jeu est terminé
     * @param reponseEvalutionUtilisateur La proposition de l'utilisateur
     * @return true si la combinaison secrète a été trouvée, false sinon
     */
    public abstract boolean determinerSiFinJeu(String reponseEvalutionUtilisateur);

}
