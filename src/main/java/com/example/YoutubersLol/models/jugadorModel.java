package com.example.YoutubersLol.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="Tablayoutubers")
public class jugadorModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)

    private int id;
    private String nombre;
    private String Posicion;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPosicion() {
        return Posicion;
    }
    public void setPosicion(String posicion) {
        Posicion = posicion;
    }
    public int getNoJugador() {
        return id;
  
}
}