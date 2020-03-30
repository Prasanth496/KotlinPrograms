package com.designpatterns.singleton

public class ThreadSafeSingleton
{
    private val instance : ThreadSafeSingleton = ThreadSafeSingleton()

    private fun getInstance(): ThreadSafeSingleton
    {

        if (instance == null)
        {
            val instance = ThreadSafeSingleton()
        }
        return instance
    }
}
