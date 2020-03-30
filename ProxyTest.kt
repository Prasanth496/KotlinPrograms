package com.designpatterns.structural.Proxy

class ProxyTest {
    //  method to run the application
    companion object {

        @JvmStatic
        fun main(args : Array<String>)
        {
            val proxyMath = ProxyMath()
            println(proxyMath.Add(1.0, 3.0))
        }
    }
}