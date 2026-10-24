package br.com.ctw.bookstore.repository;

import br.com.ctw.bookstore.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, UUID> {
}