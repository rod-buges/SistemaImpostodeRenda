package ImpostodeRendaEx5;

public class ImpostoDeRenda {
    private Pessoa pessoa;
    private double imposto;
    private int faixa;

    ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.faixa = FaixaImpostoDeRenda.getFaixa(pessoa.getSalario());
        this.imposto = calcular();
    }

    double calcular() {
        switch (this.faixa) {
            case 1:
                return 0;
            case 2:
                return this.pessoa.getSalario() * 0.075;
            case 3:
                return this.pessoa.getSalario() * 0.15;
            case 4:
                return this.pessoa.getSalario() * 0.225;
            case 5:
                return this.pessoa.getSalario() * 0.275;
            default:
                return 0;
        }
    }

    void imprimir() {
        System.out.printf("%s seu salário é R$ %.2f, sua faixa de imposto é %d e o valor do imposto de renda a ser pago é: R$ %.2f\n", this.pessoa.getNome(), this.pessoa.getSalario(), this.faixa, this.imposto);
    }
}
