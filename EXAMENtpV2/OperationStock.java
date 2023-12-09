package tpexamenv2;

abstract class OperationStock implements MouvementStock{
	private static int count = 0;
private int  idOp;
Article art;
	
	public OperationStock(Article art) {
		count++;
		idOp=count;
		this.art = art;
	}

@Override
public String toString() {
	return this.getClass().getSimpleName()+": Art=" + art ;
}

@Override
public	abstract boolean estMouvementabe();


@Override
public abstract void mouvementerStock(Article a, int qte) throws QteArticleException ;
	
	
	
	
	
	
	
	
	
}
