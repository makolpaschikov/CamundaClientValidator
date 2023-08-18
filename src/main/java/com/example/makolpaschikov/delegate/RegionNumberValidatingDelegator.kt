package com.example.makolpaschikov.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class RegionNumberValidatingDelegator : JavaDelegate {
    @Throws(Exception::class)
    override fun execute(delegateExecution: DelegateExecution) {
        val region = delegateExecution.getVariable("regionCode") as Long
        if (region == 24L) {
            delegateExecution.setVariable("result", true)
            delegateExecution.setVariable("cause", "Компания находится в запрещенном регионе (Красноярский край)")
        } else {
            delegateExecution.setVariable("result", false)
        }
    }
}
