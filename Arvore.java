/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8ex1;

/**
 *
 * @author Notebook
 */
public class Arvore {
    private Node lista;
    public  Arvore(){
        lista = null;
    }
public void inOrdem(Node raiz){
    if(raiz!=null){
      inOrdem(raiz.getEsquerda());
      System.out.println(raiz.getInformacao());
      inOrdem(raiz.getDireita());
    }
}
public void preOrdem(Node raiz){
    if(raiz!=null){
      System.out.println(raiz.getInformacao());
      preOrdem(raiz.getEsquerda());
      preOrdem(raiz.getDireita());
    }
}
public void posOrdem(Node raiz){
    if(raiz!=null){
        posOrdem(raiz.getEsquerda());
        posOrdem(raiz.getDireita());
        System.out.println(raiz.getInformacao());
    }
}

public Node inserir(Node atual,int numero,Node anterior) {
    if (atual == null) {
        Node no = new Node();
        no.setInformacao(numero);
        no.setAnterior(anterior);
        return no;
    }
    if(numero >=atual.getInformacao()){
        System.out.println("top");
        atual.setDireita(inserir(atual.getDireita(),numero,atual));
    }else{
        atual.setEsquerda(inserir(atual.getEsquerda(),numero,atual));
    }
    return atual;
}
public Node BuscarInOrdem(Node raiz){
    if(raiz!=null){
      BuscarInOrdem(raiz.getEsquerda());
      BuscarInOrdem(raiz.getDireita());
      return raiz;
    }
    return raiz;
}
public void removerMaior(Node raiz,Node maior){
    Node maiorNode = BuscarInOrdem(raiz);
    if(raiz==null){
        Node anterior = maior.getAnterior();
        anterior.setDireita(maior.getDireita());
        posOrdem(raiz);
    }
    else{
        if(raiz.getInformacao()>maior.getInformacao()){
            maiorNode = raiz; 
        }
        removerMaior(raiz.getDireita(),maiorNode);
    }
    
}
public void removerMenor(Node raiz,Node menor){
    Node menorNode = BuscarInOrdem(raiz);
    if(raiz==null){
        Node anterior = menor.getAnterior();
        anterior.setEsquerda(menor.getEsquerda());
        posOrdem(raiz);
    }
    else{
        if(raiz.getInformacao()>menor.getInformacao()){
            menorNode = raiz; 
        }
        removerMenor(raiz.getEsquerda(),menorNode);
    }  
}
public Node removerElemento(Node raiz, int elemento) {
    if (raiz == null) {
        return raiz;
    }
    if (elemento < raiz.getInformacao()) {
        raiz.setEsquerda(removerElemento(raiz.getEsquerda(), elemento));
    } else if (elemento > raiz.getInformacao()) {
        raiz.setDireita(removerElemento(raiz.getDireita(), elemento));
    } else {
        if (raiz.getEsquerda() == null) {
            return raiz.getDireita();
        } else if (raiz.getDireita() == null) {
            return raiz.getEsquerda();
        }
        Node menorSubArvoreDireita = BuscarInOrdem(raiz.getDireita());
        raiz.setInformacao(menorSubArvoreDireita.getInformacao());
        raiz.setDireita(removerElemento(raiz.getDireita(), menorSubArvoreDireita.getInformacao()));
    }
    return raiz;
}

}

