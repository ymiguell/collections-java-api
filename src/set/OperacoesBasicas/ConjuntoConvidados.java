package set.OperacoesBasicas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCandidatoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 01);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 02);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 02);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 04);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set de Convidado(s)");
        conjuntoConvidados.removerCandidatoPorCodigoConvite(04);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set de Convidado(s)");
        conjuntoConvidados.exibirConvidados();

    }

}
