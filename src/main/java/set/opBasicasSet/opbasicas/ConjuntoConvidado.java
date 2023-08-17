package main.java.set.opBasicasSet.opbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidadoNoSet(String nome, int codigoConv){
        convidadoSet.add(new Convidado(nome, codigoConv));
    }
    public void removerCandidatoSet(int codigoConv){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConv() == codigoConv){
               convidadoParaRemover = c;
               break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        conjuntoConvidado.adicionarConvidadoNoSet("Larissa ", 000);
        conjuntoConvidado.adicionarConvidadoNoSet("Daniel ", 001);
        conjuntoConvidado.adicionarConvidadoNoSet("Daniel ", 001);

        System.out.println(" Existem " + conjuntoConvidado.contarConvidados());
    }
}
