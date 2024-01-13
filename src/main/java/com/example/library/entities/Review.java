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
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "rating")
    int rating;

    @Column(name = "book_id")
    long bookId;

    @Column(name = "review_description")
    String reviewDescription;
}
