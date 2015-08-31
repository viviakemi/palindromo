


public class PalindromoTest {

	public static void main(String[] args) {

		if (args != null && args.length > 0){
			Palindromo palindromo = new Palindromo(args[0]);
			palindromo.verificar();
		}else{
			System.out.println("\n Palavra não informada.");
		}

	}
}
