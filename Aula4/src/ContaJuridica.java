
public class ContaJuridica extends Conta{
	
	private int cnpj;


	ContaJuridica(){
		
	}

	ContaJuridica(int cnpj){
		this.cnpj = cnpj;
	}
	
	public int getcnpj() {
		return cnpj;
	}

	public void setcnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
