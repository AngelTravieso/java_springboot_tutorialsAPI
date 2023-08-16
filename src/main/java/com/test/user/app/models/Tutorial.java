package com.test.user.app.models;


import jakarta.persistence.*;

@Entity // Indica que la clase es una clase persistente de java
@Table(name = "tutorials") // Provee la tabla que mapeara la entidad
public class Tutorial {

    @Id // Anotación para la llave primaria (PK)
    @GeneratedValue(strategy = GenerationType.AUTO) // Para definir la estrategia de generación para la PK, Auto indica que el campo es autoincrementable
    private Long tutorialId;

    @Column(name = "title") // Usado para definir la columna en la BD que mapea el campo anotado
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(
            String title,
            String description,
            boolean published
    ) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Long getId() {
        return this.tutorialId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return this.published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + tutorialId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
