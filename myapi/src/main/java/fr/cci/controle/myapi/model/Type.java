package fr.cci.controle.myapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int typeId;

    private String nom;
    private String caractéristique;

    public Type() {
        this.nom = "Nom par défaut";
        this.caractéristique = "Caractéristique par défaut";
    }

    public Type(int typeId, String nom, String caractéristique) {
        this.typeId = typeId;
        this.nom = nom;
        this.caractéristique = caractéristique;
    }


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCaractéristique() {
        return caractéristique;
    }

    public void setCaractéristique(String caractéristique) {
        this.caractéristique = caractéristique;
    }
}
