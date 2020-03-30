package com.designpatterns.behavioural.Mediator

public class UserImpl : User
{
    private val mediator : String ?= null
    private var name : String?= null

    // constructor to initialize the parent class constructor
    constructor(mediator : ChatMediator, name : String)
    {

    }


    // this method prints the message recieved by this object
    fun Recieve(message : String) {
        println("${this.name} Recieved Message =$message")

    }


    // this method sends the message to other objects via mediator
    fun Send(message : String)
    {
        println("${this.name}  Sending Message = $message")
        this.mediator.Send(message, this)
    }
}