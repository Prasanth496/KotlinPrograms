package com.designpatterns.structural.Adapter

public class Volt
{
    private var volts : Int ?= null
    constructor(v : Int)
    {
        this.volts = v
    }
    fun getVolts() : Int?
    {
        return volts
    }
}
