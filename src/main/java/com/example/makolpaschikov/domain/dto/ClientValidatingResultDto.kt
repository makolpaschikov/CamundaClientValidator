package com.example.makolpaschikov.domain.dto

data class ClientValidatingResultDto(
    val result: Boolean,
    val cause: String? = null
)