public class TestMetodi {

	void ciao(){
		System.out.println("Ciao Mondo");
	}

	void somma(Integer n1,Integer n2){
		System.out.println("La somma e':"+(n1+n2));
	}
	
	void schedaUtente(String nome,String cognome,Integer eta) {
		System.out.println("Nome:"+nome);
		System.out.println("Cognome:"+cognome);
		System.out.println("Eta:"+eta);
	}
	
	Integer sommaRitornata(Integer n1, Integer n2){
		return n1+n2;
	}

	String sommaStringata(Integer n1, Integer n2) {
		
		return "La somma e'"+(n1+n2);
	}
	
	static Integer dammiLunghezzaStr(String nome) {
		
		return nome.length();
		
	}
//	Verificare che lo username abbia una lunghezza
//	compresa tra i 3 e i 12 caratteri
	static boolean verificaUsername(String username) {
		
		if(username.length()>=3 && username.length()<=12) {
			return true;	
		}
		else {
			return false;
		}
	}
	
}
