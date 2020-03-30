package com.designpatterns.structural.Adapter

//Using inheritance for adapter pattern
class SocketClassAdapterImpl : Socket(), SocketAdapter {
    override fun get120Volt(): Volt {
        return getVolt()
    }

    override fun get12Volt(): Volt {
        val v: Volt = getVolt()
        return convertVolt(v, 10)
    }

    override fun get3Volt(): Volt {
        val v: Volt = getVolt()
        return convertVolt(v, 40)
    }

    private fun convertVolt(v: Volt, i: Int): Volt {
        return Volt(v.getVolts()!! / i)
    }
}