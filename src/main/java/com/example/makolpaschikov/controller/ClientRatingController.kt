package com.example.makolpaschikov.controller

import com.example.makolpaschikov.domain.dto.ClientInformationDto
import com.example.makolpaschikov.domain.dto.ClientValidatingResultDto
import com.example.makolpaschikov.service.ClientValidationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/client-validation")
class ClientRatingController(private val clientValidationService: ClientValidationService) : ClientRatingControllerAPI {

    @PostMapping
    override fun validateClientInfo(
        @RequestBody clientInformation: ClientInformationDto
    ): ResponseEntity<ClientValidatingResultDto> {
        val result = clientValidationService.validate(clientInformation)
        return ResponseEntity.ok(result)
    }

}