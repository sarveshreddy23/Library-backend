package com.example.library.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "title")
    String title;

    @Column(name = "question")
    String question;

    @Column(name = "admin_email")
    String adminEmail;

    @Column(name = "response")
    String response;

    @Column(name = "closed")
    boolean closed;
}
