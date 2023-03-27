package com.chdias.levatus.persistence;

import com.chdias.levatus.domain.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDocumentRepository <TId, TDocument extends Entity<TId>> extends MongoRepository<TDocument, TId> {
    public TDocument getById(TId id);
}
