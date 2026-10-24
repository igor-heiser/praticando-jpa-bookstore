package br.com.ctw.bookstore.mapper;

import br.com.ctw.bookstore.dto.publisher.PublisherCreateRequest;
import br.com.ctw.bookstore.dto.publisher.PublisherResponse;
import br.com.ctw.bookstore.entity.PublisherEntity;
import org.springframework.stereotype.Component;

@Component
public class PublisherMapper {

    public PublisherEntity toEntity(PublisherCreateRequest request) {
        return PublisherEntity.builder()
                .name(request.name()).build();
    }

    public PublisherResponse toResponse(PublisherEntity publisherEntity) {
        return new PublisherResponse(
                publisherEntity.getId(),
                publisherEntity.getName()
        );
    }

}