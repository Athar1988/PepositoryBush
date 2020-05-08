package fr.test.git.bush;

public class VerifPersonne {
private String nom;
private int age;
private String emploi;

public VerifPersonne(String nom, String emploi, int age) {
	this.age=age;
	this.emploi=emploi;
	this.nom=nom;
}
@Override
public String toString() {
	return "VerifPersonne [nom=" + nom + ", age=" + age + ", emploi=" + emploi + "]";
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmploi() {
	return emploi;
}
public void setEmploi(String emploi) {
	this.emploi = emploi;
}
}
