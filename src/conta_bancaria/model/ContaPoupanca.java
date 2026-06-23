package conta_bancaria.model;

public class ContaPoupanca extends Conta{

	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	public void calcularNovoSaldo(float taxaPercentual) {
        float rendimento = this.getSaldo() * (taxaPercentual / 100);
        this.setSaldo(this.getSaldo() + rendimento);
    }
	
	@Override
    public void visualizar() {
        super.visualizar();
        System.out.printf("Dia do aniversário da conta: %d%n", this.aniversario);
    }
}
