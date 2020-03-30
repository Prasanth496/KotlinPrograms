package com.designpatterns.structural.Adapter

class AdapterPatternTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            testClassAdapter()
            testObjectAdapter()
        }

        private fun testObjectAdapter() {
            val sockAdapter: SocketAdapter = SocketObjectAdapterImpl()
            val v3 = getVolt(sockAdapter, 3)
            val v12 = getVolt(sockAdapter, 12)
            val v120 = getVolt(sockAdapter, 120)
            println("v3 volts using Object Adapter=" + v3.getVolts())
            println("v12 volts using Object Adapter=" + v12.getVolts())
            println("v120 volts using Object Adapter=" + v120.getVolts())
        }

        private fun testClassAdapter() {
            val sockAdapter: SocketAdapter = SocketClassAdapterImpl()
            val v3 = getVolt(sockAdapter, 3)
            val v12 = getVolt(sockAdapter, 12)
            val v120 = getVolt(sockAdapter, 120)
            println("v3 volts using Class Adapter=" + v3.getVolts())
            println("v12 volts using Class Adapter=" + v12.getVolts())
            println("v120 volts using Class Adapter=" + v120.getVolts())
        }

        private fun getVolt(sockAdapter: SocketAdapter, i: Int): Volt {
            return when (i) {
                3 -> sockAdapter.get3Volt()
                12 -> sockAdapter.get12Volt()
                120 -> sockAdapter.get120Volt()
                else -> sockAdapter.get120Volt()
            }
        }
    }
}
