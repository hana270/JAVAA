package tpexamenv2;

public class main {

	public static void main(String[] args) {
		Article ar1=new Article(1, "TV", 30, 100);
		Article ar2=new Article(2, "LaveVaisselle", 5, 20);
	try {
		Achat a1 = new Achat(ar1,700,20);
	} catch (QteArticleException e) {			
		e.printStackTrace();
		}
	
	try {
		Achat a2 = new Achat(ar2,700,20);
	} catch (QteArticleException e) {		
		e.printStackTrace();
	}
	
	try {
		Vente v1 =new Vente(ar1,1800,10);
	} catch (QteArticleException e) {
		e.printStackTrace();
	}
	try {
		Vente v2 =new Vente(ar2,1800,10);
	} catch (QteArticleException e) {
		e.printStackTrace();
	}
	try {
		Vente v3 =new Vente(ar2,1900,5);
	} catch (QteArticleException e) {
		e.printStackTrace();
	}
	
	Stock S=new Stock(100);
	S.ajouterOp(v1);
	S.ajouterOp(v2);
	S.ajouterOp(v3);
	
	S.affichOpAchat();
	S.meilleurPrixVente(ar2);
	
	
}
}
