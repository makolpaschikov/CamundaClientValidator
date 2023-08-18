package com.example.makolpaschikov.domain.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ClientInformationDto(
    @JsonProperty("inn") val inn: Long?,
    @JsonProperty("region_code") val regionCode: Long?,
    @JsonProperty("capital") val capital: Long?,
)
