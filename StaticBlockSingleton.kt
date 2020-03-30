package com.designpatterns.singleton

import java.lang.Exception

public class StaticBlockSingleton {

    private val instance : StaticBlockSingleton  = StaticBlockSingleton()

    //init block initialization for exception handling
    init {
        try {
            val instance = StaticBlockSingleton()
        }
        catch (e : Exception) {
            throw RuntimeException("Exception occured while creating singleton instance")
        }
    }
    fun getInstance() : StaticBlockSingleton
    {
        return instance
    }
}