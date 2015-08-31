

public final class Palindromo {

    private String palavra;

    public Palindromo(final String palavra) {
       this.palavra = palavra;
    }


    public void verificar() {
    	if (this.palavra != null){
    		if (this.palavra.length() == 1){
    			System.out.println("\n … palindromo");
    		}else{
    			if (this.palavra.equals(new StringBuffer(this.palavra).reverse().toString())) {
    				System.out.print("\n… palindromo");
    			} else {
    				System.out.print("\nN„o È palindromo");
    			}
    		}
    	}else{
    		System.out.println("\nPalavra nao informada.");
    	}
    }
}

