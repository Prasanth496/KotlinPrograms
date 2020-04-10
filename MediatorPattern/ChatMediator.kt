package com.designpatterns.behavioural.Mediator

interface ChatMediator {
    fun SendMessage(msg: String?, user: User?)
    fun AddUser(user: User?)
}
