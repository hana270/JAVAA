package tpexamenv2;

public class Article {
private int code;
private String nom;
private int qteStock;
private int stockMax;

public Article(int code,String nom,int qteStock,int stockMax) {
	this.code=code;
	this.nom=nom;
	this.qteStock=qteStock;
	this.stockMax=stockMax;
}

public int getQteStock() {
	return qteStock;
}

public void setQteStock(int qteStock) {
	this.qteStock = qteStock;
}


public int getStockMax() {
	return this.stockMax;
}

@Override
public String toString() {
	return this.getClass().getSimpleName()+" :Code=" + code + ", Nom=" + nom + ", Qte dans le stock =" + qteStock + ", Qte Max =" + stockMax ;
}

public boolean equals(Article a) {
	if( (this.nom.equals(a.nom)) && (this.code == a.code) ) {
		return true;
	}
	return false;
}











}
