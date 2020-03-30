package com.designpatterns.singleton

public class LazyInitialization
{
    private val instance : LazyInitialization = LazyInitialization()
    fun getInstance() : LazyInitialization
    {
        if(instance == null)
        {
            val instance = LazyInitialization()
        }
        return instance
    }
}