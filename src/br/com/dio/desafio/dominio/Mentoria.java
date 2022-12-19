package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class Mentoria extends Conteudo {
    private String titulo;
    private String descricao;
    private LocalDate data;//classe  que podemos trabalhar com datas


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }


    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

}