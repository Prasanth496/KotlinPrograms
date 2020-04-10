package com.designpatterns.creational.factory

public class ComputerFactory {
    fun GetComputer(type: String, cpu: String, hdd: String, ram: String): Computer? {
        if (type.equals("PC")) {
            return PC(cpu, hdd, ram)
        } else if (type.equals("Server")) {
            return Server(cpu, hdd, ram)
        } else
            println("Given class not found")
        return null
    }
}
