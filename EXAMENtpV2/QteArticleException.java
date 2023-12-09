package tpexamenv2;

public class QteArticleException extends Exception {
	
    public QteArticleException(int choix) {
		if(choix==1) {
    		System.out.println("L’espace de stockage est insuffisant");
    	}else if(choix==2) {
    		System.out.println(" la quantité en stock de l’article est insuffisante. !!");
    	}
    }
}
