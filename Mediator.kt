package com.designpatterns.behavioural.Mediator

class MediatorTest {
    companion object {
        // A simple static method to run the code without creating object of this class
        @JvmStatic
        fun main(args: Array<String>) {
            // creating the object of mediator
            val mediator: ChatMediator = ChatMediatorImplement()
            //// creating the user Objects
            val user1: User? = UserImpl(mediator, "Ravi")
            val user2: User? = UserImpl(mediator, "Ramesh")
            val user3: User? = UserImpl(mediator, "Shiva")
            val user4: User? = UserImpl(mediator, "Karan")
            // adding the user Objects to the mediator object where communication between the objects happens through the mediator
            mediator.AddUser(user1)
            mediator.AddUser(user2)
            mediator.AddUser(user3)
            mediator.AddUser(user4)
            //here 1 object sends a message which is recieved by all the objects through the mediator
            if (user1 != null) {
                user1.send("hello EveryOne")
            }
            if (user2 != null) {
                user2.receive("hi")
            }
            mediator.SendMessage("hey", user1)
        }

        private fun UserImpl(chatMediator: ChatMediator, s: String) : User? {
                return null
        }

    }
}