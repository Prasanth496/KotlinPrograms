package com.designpatterns.creational.Prototype

public class PersonShallowCopy : Cloneable
{
    var name : String ?= null
    var  age : String ?= null
    var address : Address ?= null


    /// overridden the clone() from Cloneable
    object Clone(cloneable: Cloneable) {
        return this.cloneable()
    }

    public override fun toString() : String
    {
        return String.format("FullName: {0} \nAge: {1}\nAddress: {2}",this.name,  this.age, this.address)
    }
}