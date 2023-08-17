package main.java.List.operacoesBasicas.List.OpBasicas.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPubli) {
        livroList.add(new Livro(titulo, autor, anoPubli));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorAno(int anoIni, int anoFin) {
        List<Livro> livrosPorIntAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPubli() >= anoIni && l.getAnoPubli() <= anoFin) {
                    livrosPorIntAno.add(l);
                }
            }
        }
        return livrosPorIntAno;
    }
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Harry Potter e a pedra filosofal ", "JK Rowling ", 1997 );
        catalogoLivros.adicionarLivro("Harry Potter e a camara secreta ", "JK Rowling ", 1998 );
        catalogoLivros.adicionarLivro("Harry Potter e o prisioneiro de azkaban ", "JK Rowling ", 1999 );
        catalogoLivros.adicionarLivro("Harry Potter e o calíce de fogo ", "JK Rowling ", 2000 );
        catalogoLivros.adicionarLivro("Harry Potter e a ordem da fenix ", "JK Rowling ",  2003);
        catalogoLivros.adicionarLivro("Harry Potter e o enigma do princípe ", "JK Rowling ",  2005);
        catalogoLivros.adicionarLivro("Harry Potter e as reliquías da morte ", "JK Rowling ",  2007);

        System.out.println(catalogoLivros.pesquisaPorAno(2000,2007));
    }

}