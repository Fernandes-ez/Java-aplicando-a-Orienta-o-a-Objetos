package Banco;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    protected double saldo;
    private String nome, sobrenome;
    private int id;
    double valor, sacar;
    public void criarConta(){
        Random aleatorio = new Random();
        id = aleatorio.nextInt(100000);
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, para começarmos insira seu nome: ");
        nome=scan.nextLine();
        System.out.println("Insira seu sobrenome: ");
        sobrenome = scan.nextLine();
    }
    public void depositar(){

        Scanner val = new Scanner(System.in);
        System.out.println("Insira o valor a ser depositado:");
        valor = val.nextDouble();
        System.out.println("Depósito realizado!");
        saldo += valor;
    }
    public void sacar(){
        Scanner val = new Scanner(System.in);
        System.out.println("Insira o valor a ser sacado:");
        sacar = val.nextDouble();
        if (sacar>saldo){
            System.out.println("Valor indisponível.");
        }else{
            System.out.println("Saque realizado!");
            saldo -= sacar;
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

//    Getter e Setters

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getId() {
        return id;
    }
}
