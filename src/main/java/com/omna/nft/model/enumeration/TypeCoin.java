package com.omna.nft.model.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TypeCoin", description = "Tipo de moeda")
public enum TypeCoin {
    BRL,
    USD,
    BTC,
    ETH
}
