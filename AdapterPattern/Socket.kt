package com.designpatterns.structural.Adapter

public open class Socket
{
    fun getVolt() : Volt
    {
        return Volt(120)
    }
}
