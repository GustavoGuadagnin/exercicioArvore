/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8ex1;

/**
 *
 * @author Notebook
 */
public class Node {
    private Integer informacao;
    private Node direita;
    private Node esquerda;
    private Node anterior;
    public Node(){
        informacao = null;
        direita = null;
        esquerda = null;
        anterior = null;
    }
    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    public Integer getInformacao() {
        return informacao;
    }
    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }
    public Node getDireita() {
        return direita;
    }
    public void setDireita(Node direita) {
        this.direita = direita;
    }  
    public Node getEsquerda() {
    return esquerda;
    }
    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }   
}
