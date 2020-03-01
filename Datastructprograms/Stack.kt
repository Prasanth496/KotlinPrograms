class Stack<T>(val capacity: Int) {
    var elements = arrayOfNulls<Any?>(capacity) as Array<T?>
    var top = -1

    private fun isFull() = (top == capacity - 1)

    // function for adding data to the stack
    fun push(data: T): Boolean {
        if (isFull()) {
            println("stack overflow")
            return false
        }
        elements.set(++top, data)
        return true
    }
// function for removing data from the stack
    fun pop(): Any? {
        if (top == -1) {
            println("Stack underflow")

        }
        return elements?.get(top--)

    }

// function to what is there at the last
    fun peek(): Unit {
        if (top == -1) {
            println("stack is underflow")

        } else elements?.get(top)
    }
// function to see whether stack is empty
    fun isEmpty() = (top == -1)
// function to get the size of the stack
    fun size(): Int {
        return top + 1
    }

    override fun toString(): String {
        val strBuilder = StringBuilder("")
        for (i in 0 until capacity) {
            strBuilder.append(elements[i])
        }
        return strBuilder.toString()

    }

}