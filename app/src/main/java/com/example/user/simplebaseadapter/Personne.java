package com.example.user.simplebaseadapter;

/**
 * Created by USER on 16/02/2017.
 */

public class Personne{
    private String nom;
    private String prenom;
    private int age;
    private int image ;
    // constructeur
    public Personne(String nom, String prenom, int age,int image) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.image=image;
    }
    // get & set


    public int getImage() {

        return image;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
   // End get & set



}
