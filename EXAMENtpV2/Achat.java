package tpexamenv2;

public class Achat extends OperationStock{
	
private int prixAchat;
private int qteAchete;

public Achat(Article art,int p,int q) throws QteArticleException {
	super(art);
	this.prixAchat=p;
	this.qteAchete=q;
	
	mouvementerStock(art, qteAchete);
}


@Override
public String toString() {
	return super.toString()+" PrixAchat=" + prixAchat + ", qteAchete=" + qteAchete ;
}



@Override
public boolean estMouvementabe() {
	if(this.qteAchete < super.art.getStockMax()) {
		return true;
	}
	return false;
}

@Override
public void mouvementerStock(Article a, int qte) throws QteArticleException {
	int qt=0;
	if(estMouvementabe()) {
		qt=super.art.getQteStock()+qte;
	}else {
	
		throw new QteArticleException(1);
	}
}





}
