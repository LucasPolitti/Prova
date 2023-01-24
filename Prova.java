import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int nota = 0;

        String[] perguntas=new String[5];

        perguntas[0]="Qual o nome do único satélite da Terra?";
        perguntas[1]="Qual o nome da estrela mais próxima da Terra?";
        perguntas[2]="Quantas copas do mundo o Brasil ganhou?";
        perguntas[3]="Qual é o nome da melhor amiga do Harry Potter?";
        perguntas[4]="Qual é a cor geralmente predominante em uma floresta?";

        String[] alternativas=new String[5];

        alternativas[0]="a) Júpiter - b) Saturno - c) Lua";
        alternativas[1]="a) Marte - b) Mercúrio - c) Sol";
        alternativas[2]="a) 5 - b) 6 - c) 4";
        alternativas[3]="a) Hermione - b) Joana - c) Maria";
        alternativas[4]="a) Verde - b) Vermelho - c) Amarelo";

        String[] respostas= new String[5];

        respostas[0]="c";
        respostas[1]="c";
        respostas[2]="a";
        respostas[3]="a";
        respostas[4]="a";

        String[] gabarito= new String[5];
        

        for(int i=0; i<perguntas.length; i++){

            System.out.println();
            System.out.println(perguntas[i]);
            System.out.println();
            System.out.println(alternativas[i]);
            System.out.println();

            System.out.println("Digite a sua resposta: ");

            gabarito[i]=scan.nextLine();

            if(gabarito[i].equals(respostas[i])){
                    nota+=2;
                }



            

            System.out.println("------------------------------------");


        }
        
        System.out.println();
        System.out.println("Sua nota é: " + nota);
        System.out.println();
        System.out.println("-------------------------------------");

        if(nota==10){
            System.out.println();
            System.out.println("Parabéns!!! Você gabaritou a prova!!! ");
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();
        }

        

       

        }

    }

