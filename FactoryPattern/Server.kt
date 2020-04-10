package com.designpatterns.creational.factory

class Server : Computer
{
    private var ram : String
    private var hdd : String
    private var cpu : String
    constructor(cpu: String, hdd : String, ram : String)
    {
        this.cpu = cpu
        this.hdd = hdd
        this.ram = ram
    }

     override fun GetCPU() : String
    {
        return this.cpu
    }
    override  fun GetHDD() : String
    {
        return this.hdd
    }
    override fun  GetRAM() : String
    {
        return this.ram
    }
}
