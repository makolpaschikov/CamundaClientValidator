package com.example.makolpaschikov.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class InnStartValidatingDelegator : JavaDelegate {
    @Throws(Exception::class)
    override fun execute(delegateExecution: DelegateExecution) {
        val inn = delegateExecution.getVariable("inn") as Long
        val innAsString = inn.toString()

        if (innAsString.startsWith("9909")) {
            delegateExecution.setVariable("result", true)
            delegateExecution.setVariable("cause", "Компания не является резидентом РФ")
        } else {
            delegateExecution.setVariable("result", false)
        }
    }
}
