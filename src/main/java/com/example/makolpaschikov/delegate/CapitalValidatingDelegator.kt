package com.example.makolpaschikov.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class CapitalValidatingDelegator : JavaDelegate {
    @Throws(Exception::class)
    override fun execute(delegateExecution: DelegateExecution) {
        val capital = delegateExecution.getVariable("capital") as Long
        if (capital < 5_000_000) {
            delegateExecution.setVariable("result", true)
            delegateExecution.setVariable("cause", "Капитал компании меньше 5 000 000")
        } else {
            delegateExecution.setVariable("result", false)
        }
    }
}
