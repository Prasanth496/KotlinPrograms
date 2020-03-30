package com.designpatterns.creational.factory

class PC : Computer
{
    private var cpu : String
    private var hdd : String
    private var ram : String

    constructor(cpu : String,hdd : String,ram : String)
    {
        this.cpu = cpu
        this.hdd = hdd
        this.ram = ram
    }

    override fun GetCPU() : String
    {
        return this.cpu
    }
    override fun GetHDD() : String
    {
        return this.hdd
    }
    override fun GetRAM() : String
    {
        return this.ram
    }

}
