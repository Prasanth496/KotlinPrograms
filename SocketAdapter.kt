package com.designpatterns.structural.Adapter

public interface SocketAdapter
{
    // methods to build a adapter that produces 3,12 and 120 volts
     fun get120Volt() : Volt
     fun get12Volt() : Volt
     fun get3Volt() : Volt
}