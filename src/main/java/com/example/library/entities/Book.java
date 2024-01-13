package com.example.library.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "title")
    String title;

    @Column(name = "author")
    String author;

    @Column(name = "description")
    String description;

    @Column(name = "copies")
    int copies;

    @Column(name = "copies_available")
    int copies_available;

    @Column(name = "category")
    String category;

    @Column(name = "img")
    String img;
}
