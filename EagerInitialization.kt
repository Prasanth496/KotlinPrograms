package com.designpatterns.singleton

class EagerInitialization {
    private val instance: EagerInitialization = EagerInitialization()
    // private is used to avoid other use the application
    private operator fun invoke(): EagerInitialization {
        return instance

    }
}



