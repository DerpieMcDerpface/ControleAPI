package fr.cci.controle.myapi.model;


import javax.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pokemonId;

    private String nom;
    private int numero;
    @ManyToOne
    private Type type;
    private String image;

    public Pokemon() {
        this.nom = "Nom par défaut";
        this.numero = 0;
        this.type = new Type();
        this.image = "#";
    }

    public Pokemon(String nom, int pokemonId, int numero, Type type, String image) {
        this.nom = nom;
        this.pokemonId = pokemonId;
        this.numero = numero;
        this.type = type;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
