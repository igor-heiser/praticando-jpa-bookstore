package br.com.ctw.bookstore.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_publisher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID id;

    @Column(
            nullable = false,
            unique = true,
            length = 100
    )
    private String name;

    @OneToMany(
            mappedBy = "publisher",
            fetch = FetchType.LAZY
    )
    private Set<BookEntity> books = new HashSet<>();
}