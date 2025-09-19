package org.example;

import java.util.Date;

public class Alumn {

    private String name;
    private String[] surnames;
    private String adress;
    private Date birthDate;
    private int siblingsNumber;

    public Alumn(String name, String[] surname, String adress, Date birthDate, int siblingsNumber) {
        this.name = name;
        this.surnames = surname;
        this.adress = adress;
        this.birthDate = birthDate;
        this.siblingsNumber = siblingsNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames[0] + " " + surnames[1];
    }

    public String getAdress() {
        return adress;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getSiblingsNumber() {
        return siblingsNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnames(String[] surnames) {
        this.surnames = surnames;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setBirthdayDate(Date birthDate){
        this.birthDate = birthDate;
    }

    public void setSiblingsNumber(int siblingsNumber){
        this.siblingsNumber = siblingsNumber;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nApellidos: " + getSurnames() + "\nDireccion: " + adress + "\nFecha de nacimiento: " + birthDate + "\nNumero de hermanos: " + siblingsNumber;
    }
}
