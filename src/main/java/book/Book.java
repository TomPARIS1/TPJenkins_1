package book;

import java.util.Date;
public class Book {
    private String titre;
    private String auteur;
    private Date publication;

    public Book(String titre, String auteur, Date publication) {
        this.titre = titre;
        this.auteur = auteur;
        this.publication = publication;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", publication=" + publication +
                '}';
    }
}
