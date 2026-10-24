package br.com.ctw.bookstore.dto.book;

import br.com.ctw.bookstore.entity.PublisherEntity;

import java.util.UUID;

public record BookResponse(
        UUID id,
        String title,
        PublisherEntity publisher
) { }