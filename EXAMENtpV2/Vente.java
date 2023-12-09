package tpexamenv2;

public class Vente extends OperationStock{
	
private double prixVente;
private int qteVendu;
	
public Vente(Article art,double p,int q) throws QteArticleException {
		super(art);
		this.prixVente=p;
		this.qteVendu=q;
		mouvementerStock(art,q);
	}


@Override
public String toString() {
	return super.toString()+" prixVente = " + prixVente + ", Quantite Vendu =" + qteVendu ;
}


public double getPrixVente() {
	return prixVente;
}


@Override
public boolean estMouvementabe() {
	if(this.qteVendu < super.art.getQteStock()) {
		return true;
	}
	return false;
}

@Override
public void mouvementerStock(Article a, int qte) throws QteArticleException {
	int o=0;
	if(this.estMouvementabe()) {
		o=a.getQteStock()-qte;
	}else {
		throw new QteArticleException(2);
	}
	
	
}










}
