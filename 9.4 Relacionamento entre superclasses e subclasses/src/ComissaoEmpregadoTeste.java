
public class ComissaoEmpregadoTeste {

	public static void main(String[] args) {
		
		ComissaoEmpregado empregado = new ComissaoEmpregado("João", "Guilherme", "22542189641", 10000, .06);
		
		System.out.println("Dados do empregado obtidos através dos métodos get().");
		
		System.out.printf("%n%s %s%n", "O nome é", empregado.getNome());
		
		System.out.printf("%n%s %s%n", "O sobrenome é", empregado.getSobrenome());
		
		System.out.printf("%n%s %s%n", "O CPF é", empregado.getNumeroSeguroSocial());

		System.out.printf("%s %.2f%n", "O total de vendas é", empregado.getVendasBrutas());
		
		System.out.printf("%s %.2f%n", "A taxa de comissão é", empregado.getTaxaDeComissao());
		
		empregado.setVendasBrutas(5000);
		empregado.setTaxaDeComissao(.1);
		
		System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas obtidas através do toString()", empregado);
		
	}

}
