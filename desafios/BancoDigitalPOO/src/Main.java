import com.banco.Cliente;
import com.banco.Conta;
import com.banco.ContaCorrente;
import com.banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}