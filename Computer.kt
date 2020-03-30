package com.designpatterns.creational.factory

abstract class Computer
{
    abstract fun GetRAM() : String
    abstract fun GetHDD() : String
    abstract fun GetCPU() : String

    // override tostring to represent the object state to string format
    public override fun toString(): String {
        return "Ram capacity is = ${this.GetRAM()} CPU = ${this.GetCPU()} HDD capacity is ${this.GetHDD()}"
    }

}