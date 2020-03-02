class Queue<T>(val capacity : Int)
{

    var elements = arrayOfNulls<Any?>(capacity) as Array<T?>
    var front = -1
    var rear = -1
    //function for enqueue
    fun Enqueue(data : T) : Boolean
    {
        if(rear==capacity-1)
        {
            println("Queue is Full")
            return false
        }
        if(rear == -1)
            front++
        elements.set(++rear,data)
        return true
    }
    //function for Dequeue
    fun Dequeue() : Array<T?>
    {
        if(front == -1)
        {
            println("queue is empty")

        }
        elements.get(front++)
        if (front > rear)
             front = rear
             rear = -1

        return elements
    }
    //function for isempty
    fun isEmpty() : Boolean
    {
        if (rear == -1)
            return true
        else return false
    }
    //function for size
    fun size()  : Int
    {
        if (rear==-1)
        {
            return 0
        }
        return rear-front + 1
    }
    override fun toString() : String
    {
        var str = ""
        for(i in front until rear)
        {
            str = str + elements[i]+" "

        }
        return str
    }
}
