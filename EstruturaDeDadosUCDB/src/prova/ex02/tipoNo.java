package prova.ex02;

public class tipoNo{
	public int info;
	public tipoNo prox;
	public tipoNo ant;
	
	public tipoNo(){

	}
	
	public void setInfo(int info){
		this.info=info;
	}
	public void setProx(tipoNo prox){
		this.prox=prox;
	}
	public void setAnt(tipoNo ant) {
		this.ant = ant;
	}
	
	public int getInfo(){
		return info;
	}
	public tipoNo getProx(){
		return prox;
	}
	public tipoNo getAnt() {
		return ant;
	}

}