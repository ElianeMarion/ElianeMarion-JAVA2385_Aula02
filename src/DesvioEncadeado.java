import java.util.Scanner;

public class DesvioEncadeado {

    public static void main(String[] args) {
        /*Uma ONG resolveu prestar um serviço bem diferente: ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomoção
        para poderem votar.
         * Para evitar problemas no momento do embarque, porém, vocêfoi convidado a criar um programa que valide a idade dos passageiros:
         caso tenham menos de 16 anos, não podem votar (e nem embarcar).
         Caso tenham entre 16 anos e 18 incompletos (17), podem optar por votar ou não. Caso tenham mais de 18 anos, devem votar obrigatoriamente.
         * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar.*/

        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por favor, digite a idade do passageiro.");
        idade = leitor.nextInt();

        if(idade < 16)
        {
            System.out.println("Não pode votar e nem embarcar");
        }else if(idade >= 18) {
            System.out.println("Voto e embarque obrigatório");
        }else{
            System.out.println("Voto e embarque opcional");
        }

        /*
        if(idade < 16)
        {
            System.out.println("Não pode votar e nem embarcar");
        }else if(idade >= 16 && idade < 18) {
            System.out.println("Voto e embarque opcional");
        }else{
            System.out.println("Voto e embarque obrigatório");
        }*/
        /*Aqui devemos criar uma solu��o para realizar as verifica��es.*/



        leitor.close();

    }
}
