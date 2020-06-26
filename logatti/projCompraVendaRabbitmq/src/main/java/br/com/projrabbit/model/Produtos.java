package br.com.projrabbit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Produtos implements Serializable {
    @Id
    private String _id;
    private String nome;

    public Produtos(){}

    public Produtos(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
