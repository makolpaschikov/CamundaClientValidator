package com.example.makolpaschikov.controller

import com.example.makolpaschikov.domain.dto.ClientInformationDto
import com.example.makolpaschikov.domain.dto.ClientValidatingResultDto
import org.springframework.http.ResponseEntity

interface ClientRatingControllerAPI {
    fun validateClientInfo(clientInformation: ClientInformationDto): ResponseEntity<ClientValidatingResultDto>
}