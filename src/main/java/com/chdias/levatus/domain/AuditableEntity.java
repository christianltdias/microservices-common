package com.chdias.levatus.domain;

import java.time.LocalDateTime;

public abstract class AuditableEntity<TId> extends Entity<TId> {
    public String createdBy;
    public LocalDateTime createdOn;
    public String lastModifiedBy;
    public LocalDateTime lastModifiedOn;
}
