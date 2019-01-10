
public class ComissaoEmpregadoTeste {

	public static void main(String[] args) {
		
		ComissaoEmpregado empregado = new ComissaoEmpregado("Jo�o", "Guilherme", "22542189641", 10000, .06);
		
		System.out.println("Dados do empregado obtidos atrav�s dos m�todos get().");
		
		System.out.printf("%n%s %s%n", "O nome �", empregado.getNome());
		
		System.out.printf("%n%s %s%n", "O sobrenome �", empregado.getSobrenome());
		
		System.out.printf("%n%s %s%n", "O CPF �", empregado.getNumeroSeguroSocial());

		System.out.printf("%s %.2f%n", "O total de vendas �", empregado.getVendasBrutas());
		
		System.out.printf("%s %.2f%n", "A taxa de comiss�o �", empregado.getTaxaDeComissao());
		
		empregado.setVendasBrutas(5000);
		empregado.setTaxaDeComissao(.1);
		
		System.out.printf("%n%s:%n%n%s%n", "Informa��es atualizadas obtidas atrav�s do toString()", empregado);
		
	}

}
