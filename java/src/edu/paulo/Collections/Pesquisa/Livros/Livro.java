package edu.paulo.Collections.Pesquisa.Livros;

public class Livro {
        private String titulo;
        private String autor;
        private int anoPublicacao;
     
        public Livro(String titulo, String autor, int anoPublicacao) {
           this.titulo = titulo;
           this.autor = autor;
           this.anoPublicacao = anoPublicacao;
        }
     
        public String getTitulo() {
           return this.titulo;
        }
     
        public void setAutor(String autor) {
           this.autor = autor;
        }
     
        public String getAutor() {
           return this.autor;
        }
     
        public int getAnoPublicacao() {
           return this.anoPublicacao;
        }
     
        public String toString() {
           return "Livro{titulo='" + this.titulo + "', autor='" + this.autor + "', anoPublicacao=" + this.anoPublicacao + "}";
        }
     }

