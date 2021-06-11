package com.codeforgeyt.jpainheritsingletable.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "PAINTING")
public class Painting extends ArtPiece {
    @Enumerated(value = EnumType.STRING)
    private PaintingTechnique paintingTechnique;
    private Double width;
    private Double height;

    public Painting() {
    }

    public Painting(String author, PaintingTechnique paintingTechnique,
                    Double width, Double height) {
        super(author);
        this.paintingTechnique = paintingTechnique;
        this.width = width;
        this.height = height;
    }
}
