import java.util.Scanner;

public class DesvioSimples {
    public static void main(String[] args) {
        /*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
         *Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
         *Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar"
         * caso ele tenha 12 anos ou mais. */

        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por favor, digite a sua idade!");
        idade = leitor.nextInt();
        System.out.println("Deixe-me verificar sua idade...");
        /*Aqui devemos criar uma solu��o para verificar a idade do usu�rio*/
        //Estrutura decisão (simples)
        if(idade >= 12 ) { //condicao => idade >= 12  |V|F
            System.out.println("Você pode jogar!");
            System.out.println("Esperamos que você goste do jogo");
        }else{
            System.out.println("Infelizmente você não poderá jogar!!");
        }
        leitor.close();

    }
}
