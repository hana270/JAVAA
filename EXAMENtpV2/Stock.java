package tpexamenv2;

public class Stock {
	
OperationStock tabOp[];
private int nbOp=0;

public Stock(int capacite) {
	tabOp=new OperationStock[capacite];
}


public void ajouterOp (OperationStock o) {
	if(nbOp<tabOp.length) {
		tabOp[nbOp++]=o;
	}else {
		System.out.println("Impossible d'ajouter ");
	}

}
public void affichOpAchat() {
	for(int i=0;i<this.nbOp;i++) {
		System.out.println(this.tabOp[i].toString());
	}

	
}
	
double meilleurPrixVente(Article a) {
	double meilleur=0;
		for(int i=0;i<this.nbOp;i++) {
			if(this.tabOp[i].art.equals(a)) {
				for(int j=0;i<this.nbOp;j++) {
					if(((Vente) this.tabOp[j]).getPrixVente() <((Vente) this.tabOp[j+1]).getPrixVente()) {
						 meilleur=((Vente) this.tabOp[j]).getPrixVente();
					}
				}			
			 }
			}
		return meilleur;
		}
}











