package Banco;

public class ContaCorrente extends ContaBancaria {
    private double tarifa;
    public void cobrarTarifaMensal(){
        saldo=-tarifa;
        System.out.println("Tarifa mensal de "+tarifa+" cobrada!");
    }
}
