package com.designpatterns.structural.Proxy

public class RealMath : Math
{
    public override fun Add(m : Double, n : Double) : Double
    {
        return m + n
    }

    public override fun Division(m : Double, n : Double) : Double
    {
        return m / n
    }

    public override fun Multiplication(m : Double, n : Double) : Double
    {
        return m * n
    }

    public override fun Sub(m : Double, n : Double) : Double
    {
        return m - n
    }
}