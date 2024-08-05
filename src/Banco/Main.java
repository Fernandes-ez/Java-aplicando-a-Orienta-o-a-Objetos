package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria fany = new ContaBancaria();
        String apresentacao = "************************\nBem vindo ao Fernandes Bank!\n************************\nVocê gostaria de: ",
                menuInicio = "1 - Criar Conta\n2 - Acessar conta\n3 - Sair",
                menuConta = "1 - Consultar saldo\n2 - Depositar\n3 - Sacar\n4 - Sair";
        Scanner scan = new Scanner(System.in);
        int opInicio, opConta = 0;
        System.out.println(apresentacao);
        do {
            System.out.println(menuConta);
            opConta = scan.nextInt();
            switch (opConta){
                case(1):
                    System.out.println();
            }
        }while (opConta !=4);

    }
}
