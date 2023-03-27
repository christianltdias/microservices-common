package com.chdias.levatus.persistence;

import com.chdias.levatus.domain.Entity;

public abstract class DocumentRepository<TId, TDocument extends Entity<TId>> implements IDocumentRepository<TId, TDocument> {
    @Override
    public TDocument getById(TId tId) {
        return findById(tId).get();
    }
}
