package com.designpatterns.structural.Adapter

class SocketObjectAdapterImpl : SocketAdapter {
    //Using Composition for adapter pattern
    private val sock = Socket()

    override fun get120Volt(): Volt {
        return sock.getVolt()
    }

    override fun get12Volt(): Volt {
        val v = sock.getVolt()
        return convertVolt(v, 10)
    }

    override fun get3Volt(): Volt {
        val v = sock.getVolt()
        return convertVolt(v, 40)
    }

    private fun convertVolt(v: Volt, i: Int): Volt {
        return Volt(v.getVolts()!! / i)
    }
}