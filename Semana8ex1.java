/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana8ex1;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class Semana8ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arvore arvore = new Arvore();
        Node lista = null;
        while(true){
            int decisao = 0;
            System.out.println("\tDigite 1 para inserir um elemento na arvore\n\t 2- Execucao PosOrdem\n\t 3- Execucao InOrdem\n\t 4- Execucao PreOrdem\n\t 5- Remover o menor\n\t 6- Remover o maior\n\t 7- Remover um numero de sua escolha");
            decisao = scan.nextInt();
            switch(decisao){
                case 1:
                    System.out.println("Digite o elemento que deseja inserir na arvore");
                    int elemento = scan.nextInt();
                    lista = arvore.inserir(lista, elemento, lista);
                    break;
                case 2:
                    arvore.posOrdem(lista);
                    break;
                case 3:
                    arvore.inOrdem(lista);
                    break;
                case 4:
                    arvore.preOrdem(lista);
                    break;
                case 5:
                    arvore.removerMenor(lista, lista);
                    break;
                case 6:
                    arvore.removerMaior(lista, lista);
                    break;
                case 7:
                    System.out.println("Digite qual numero deseja remover\n");
                    int numeroRemover = scan.nextInt();
                    arvore.removerElemento(lista,numeroRemover);
                    System.out.println("Numero removido!");
                    arvore.inOrdem(lista);

            }
        }
    }  
}