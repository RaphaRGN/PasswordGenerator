package com.org.raphaelprojects.passwordgenerator;
import java.util.Random;
import java.util.Scanner;




public class GeneratorApplication {

    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIAIS = "@!#$*";
    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String caracteresDisponiveis = NUMEROS + CARACTERES_ESPECIAIS + ALFABETO;


        System.out.println("Bem vindo ao gerador de senha !\n" +
                "Com quantos caracteres você gostaria sua senha ?");

        int tamanhoSenha = scanner.nextInt();
        StringBuilder senha = new StringBuilder();

        if (tamanhoSenha <=3){

            System.out.println("Sua senha deve ser maior, para garantir sua segurança");

        }

        for (int i = 0 ; i < tamanhoSenha; i++){

           int index = random.nextInt(caracteresDisponiveis.length());
            senha.append(caracteresDisponiveis.charAt(index));

        }
    System.out.println("Sua senha é: " + senha);

    }
}

