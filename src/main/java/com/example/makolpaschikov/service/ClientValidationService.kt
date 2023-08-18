package com.example.makolpaschikov.service

import com.example.makolpaschikov.domain.dto.ClientInformationDto
import com.example.makolpaschikov.domain.dto.ClientValidatingResultDto

interface ClientValidationService {

    fun validate(clientInformation: ClientInformationDto): ClientValidatingResultDto

}