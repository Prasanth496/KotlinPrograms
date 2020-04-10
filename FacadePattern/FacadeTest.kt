package com.designpatterns.structural.Facade

class FacadeTest {
    //this is a simple static method which is used to run without creating this class
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // this is the client interface which client will use just by creating the Facade class Object
            val facade = Facade()
            println("the parts required for making a car")
            // just by calling the Facade Method the car having different subsystem of class with thier methods are invoked
            //using the Facade class
            facade.MakeCar()
        }
    }
}
