package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private String material;
    private String size;

    public Main() {
    }

    public Main(String name, String material, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
