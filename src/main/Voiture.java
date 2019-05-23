package main;

public class Voiture {
 protected String marque;
 protected String couleur;
public Voiture(String marque, String couleur) {
	super();
	this.marque = marque;
	this.couleur = couleur;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
@Override
public String toString() {
	return "Voiture [marque=" + marque + ", couleur=" + couleur + ", getMarque()=" + getMarque() + ", getCouleur()="
			+ getCouleur() + "]";
}
 
}
