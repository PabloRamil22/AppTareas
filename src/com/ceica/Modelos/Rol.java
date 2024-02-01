package com.ceica.Modelos;

public class Rol extends ModeloBase  {
    private int id;
    private String description;

    public Rol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return "rol";
    }
}
