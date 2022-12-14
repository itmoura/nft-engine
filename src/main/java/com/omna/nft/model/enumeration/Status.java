package com.omna.nft.model.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Status", description = "status para o nft")
public enum Status {
    ACTIVE,
    INACTIVE,
    SOLD,
    BLOCKED,
    DELETED,
    EXPIRED,
    FOR_SALE
}
