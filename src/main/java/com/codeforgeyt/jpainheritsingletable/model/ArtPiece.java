package com.codeforgeyt.jpainheritsingletable.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "ART_PIECE_TYPE",
        discriminatorType = DiscriminatorType.STRING)
public abstract class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;

    public ArtPiece() {
    }

    public ArtPiece(String author) {
        this.author = author;
    }
}
