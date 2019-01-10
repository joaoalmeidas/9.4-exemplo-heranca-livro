
public class BaseMaisComissaoEmpregado {
	
	private final String nome;
	private final String sobrenome;
	private final String numeroSeguroSocial;
	private double vendasBrutas;
	private double taxaDeComissao;
	private double salarioBase;
	
	

	
	public BaseMaisComissaoEmpregado(String nome, String sobrenome, String numeroSeguroSocial, double vendasBrutas,
			double taxaDeComissao, double salarioBase) {
		
		if(vendasBrutas < 0.0) {
			
			throw new IllegalArgumentException("Vendas brutas devem ser maiores que >= 0.0");
			
		}
		
		if(taxaDeComissao <= 0.0 || taxaDeComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de Comissão precisa estar entre 0.0 e 1.0");
			
		}
		
		if(salarioBase < 0.0) {
			
			throw new IllegalArgumentException("Salário base precisa ser maior ou igual a 0.0");
			
		}
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.vendasBrutas = vendasBrutas;
		this.taxaDeComissao = taxaDeComissao;
		this.salarioBase = salarioBase;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		
		if(vendasBrutas < 0.0) {
			
			throw new IllegalArgumentException("Vendas brutas devem ser maiores que >= 0.0");
			
		}
		
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		
		if(taxaDeComissao <= 0.0 || taxaDeComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de Comissão precisa estar entre 0.0 e 1.0");
			
		}
		
		this.taxaDeComissao = taxaDeComissao;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		
		if(salarioBase < 0.0) {
			
			throw new IllegalArgumentException("Salario Base precisa ser maior ou igual 0");
			
		}
		
		this.salarioBase = salarioBase;
	}
	
	public double ganhos() {
		
		return salarioBase + taxaDeComissao * vendasBrutas;
		
	}
	
	public String toString() {
		
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "Salário mais Comissão do Empregado", nome, sobrenome,
				"Número do Seguro Social", numeroSeguroSocial, "Vendas Totais", vendasBrutas, "Taxa de Comissão", taxaDeComissao, 
				"Salário Base", salarioBase);
		
	}
	
	
	

}
