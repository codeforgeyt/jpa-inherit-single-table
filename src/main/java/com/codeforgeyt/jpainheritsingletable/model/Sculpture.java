package com.codeforgeyt.jpainheritsingletable.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "SCULPTURE")
public class Sculpture extends ArtPiece {
    @Enumerated(value = EnumType.STRING)
    private Material material;
    private Double weight;

    public Sculpture() {
    }

    public Sculpture(String author, Material material, Double weight) {
        super(author);
        this.material = material;
        this.weight = weight;
    }
}
