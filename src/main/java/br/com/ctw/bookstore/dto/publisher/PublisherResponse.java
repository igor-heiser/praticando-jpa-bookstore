package br.com.ctw.bookstore.dto.publisher;

import java.util.UUID;

public record PublisherResponse(
        UUID id,
        String name
) { }