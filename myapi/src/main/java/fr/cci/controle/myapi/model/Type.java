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
    private String caracteristique;

    public Type() {
        this.nom = "Nom par défaut";
        this.caracteristique = "Caractéristique par défaut";
    }

    public Type(int typeId, String nom, String caractéristique) {
        this.typeId = typeId;
        this.nom = nom;
        this.caracteristique = caractéristique;
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

    public String getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(String caractéristique) {
        this.caracteristique = caractéristique;
    }
}
