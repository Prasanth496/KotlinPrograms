package com.designpatterns.behavioural.Mediator

abstract class User (mediator: ChatMediator, name: String)
 {
    protected var mediator: ChatMediator
    protected var name: String

   // a normal function to sending the message
    abstract fun Send(message: String?)

   // a normal function to recieving the message
    abstract fun Recieve(message: String?)

   //  to initialize the variables
    init {
        this.mediator = mediator
        this.name = name
    }
}