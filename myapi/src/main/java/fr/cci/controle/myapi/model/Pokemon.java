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
    private PokeType pokeType;
    private String image;

    public Pokemon() {
        this.nom = "Nom par défaut";
        this.numero = 0;
        this.pokeType = new PokeType();
        this.image = "#";
    }

    public Pokemon(String nom, int pokemonId, int numero, PokeType pokeType, String image) {
        this.nom = nom;
        this.pokemonId = pokemonId;
        this.numero = numero;
        this.pokeType = pokeType;
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

    public PokeType getPokeType() {
        return pokeType;
    }

    public void setPokeType(PokeType pokeType) {
        this.pokeType = pokeType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
