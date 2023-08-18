package com.example.makolpaschikov.service

import com.example.makolpaschikov.domain.dto.ClientInformationDto
import com.example.makolpaschikov.domain.dto.ClientValidatingResultDto
import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables
import org.springframework.stereotype.Service

@Service
class ClientValidationServiceImpl(private val runtimeService: RuntimeService) : ClientValidationService {


    override fun validate(clientInformation: ClientInformationDto): ClientValidatingResultDto {
        val vars = mapOf(
            "inn" to clientInformation.inn,
            "regionCode" to clientInformation.regionCode,
            "capital" to clientInformation.capital
        )

        val process = runtimeService
            .createProcessInstanceByKey("validator")
            .setVariables(vars)
            .execute() as ProcessInstanceWithVariables

        return ClientValidatingResultDto(
            process.variables["result"] as Boolean,
            process.variables["cause"] as String?
        )
    }
}