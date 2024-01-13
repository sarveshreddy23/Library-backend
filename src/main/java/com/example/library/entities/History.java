package com.example.library.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "checkout_date")
    LocalDate checkoutDate;

    @Column(name = "return_date")
    LocalDate returnDate;

    @Column(name = "title")
    String title;

    @Column(name = "author")
    String author;

    @Column(name = "description")
    String description;

    @Column(name = "img")
    String img;



}
