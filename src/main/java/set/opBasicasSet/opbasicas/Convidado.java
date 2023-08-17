package main.java.set.opBasicasSet.opbasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConv;

    public Convidado(String nome, int codigoConv) {
        this.nome = nome;
        this.codigoConv = codigoConv;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConv() {
        return codigoConv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConv() == convidado.getCodigoConv();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConv());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConv=" + codigoConv +
                '}';
    }
}
