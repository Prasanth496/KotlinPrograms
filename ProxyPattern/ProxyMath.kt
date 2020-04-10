package com.designpatterns.structural.Proxy

public class ProxyMath : Math
{
    private val realMath = RealMath();
    public override fun  Add(m :Double, n:Double) : Double
    {
        return realMath.Add(m, n)
    }

    public override fun Division(m :Double, n: Double) : Double
    {
        return realMath.Division(m, n)
    }

    public override fun Multiplication(m: Double, n : Double) : Double
    {
        return realMath.Multiplication(m, n)
    }

    public override fun Sub(m :Double, n :Double) : Double
    {
        return realMath.Sub(m, n)
    }
}
