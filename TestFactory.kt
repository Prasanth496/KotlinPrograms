package com.designpatterns.creational.factory

import java.util.*

class TestFactory {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            val pc = sc.nextLine()
            println(pc)
            val server = sc.nextLine()
            println(server)
            val foo = sc.nextLine()
            println(foo)
        }
    }
}