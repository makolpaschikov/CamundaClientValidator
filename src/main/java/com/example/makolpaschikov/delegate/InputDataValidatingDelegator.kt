package com.example.makolpaschikov.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException

@Component
class InputDataValidatingDelegator : JavaDelegate {
    @Throws(Exception::class)
    override fun execute(delegateExecution: DelegateExecution) {
        delegateExecution.getVariable("inn") as Long?
            ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Inn cannot be null")

        delegateExecution.getVariable("regionCode") as Long?
            ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Region cannot be null")

        delegateExecution.getVariable("capital") as Long?
            ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Capital cannot be null")
    }
}
