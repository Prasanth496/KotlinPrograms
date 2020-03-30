package com.designpatterns.behavioural.Mediator

class ChatMediatorImplement : ChatMediator {

        // to store the user objects were one object contact another
        private lateinit var users: List<User>


        // constructor for initializing the list Object
        constructor() {
            var users = List<User>()
        }

        private fun <T> List(): User {
            return User()
        }


        // method to add Objects to the List
        override fun AddUser(user: User?) {
            this.users.get(user);
        }


    override fun SendMessage(msg: String?, user: User?) {
            for (u in users) {
                if (u != user) {
                    u.Recieve(msg)
                }
            }
        }
    }

    private fun <E> List<E>.get(index: E) {

    }

    open class User {
        inner class Recieve(msg: String?) {

        }

        fun send(user: String) {

        }

        fun receive(msg: String) {

        }

    }
