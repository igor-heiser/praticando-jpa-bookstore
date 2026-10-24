package br.com.ctw.bookstore.dto.book;

import br.com.ctw.bookstore.entity.PublisherEntity;

public record BookCreateRequest(
        String title,
        PublisherEntity publisher
) { }