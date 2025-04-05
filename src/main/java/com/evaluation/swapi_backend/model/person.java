package com.evaluation.swapi_backend.model;

// Este es el modelo de datos que representa a una persona en la API de SWAPI.
// Contiene atributos como nombre, altura, masa, color de cabello y color de piel.
// Este modelo es utilizado para mapear la respuesta de la API a un objeto Java.
// Además, incluye métodos getter y setter para acceder y modificar los atributos.
public class person {
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
