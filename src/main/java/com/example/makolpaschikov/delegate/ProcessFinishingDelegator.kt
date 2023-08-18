package com.example.makolpaschikov.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class ProcessFinishingDelegator : JavaDelegate {

    @Throws(Exception::class)
    override fun execute(delegateExecution: DelegateExecution) {

    }

}