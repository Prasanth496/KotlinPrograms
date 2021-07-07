class Deque<T>
{
    class Node<T>
    {
        var data : T ?= null
        var pre : Node<T> ?= null
        var next : Node<T> ?= null
        constructor(data : T)
        {
            this.data = data
        }

    }
    var head : Node<T> ?= null
    fun AddFront(data : T)
    {
        var n = Node(data)
        if (head == null)
        {
            head = n
            return
        }
        n.next = head
        head!!.pre = n
        head = n
        return
    }
    fun AddRear(data : T)  {

        var n = Node(data)
        if(head==null)
        {
            head = n

        }
        var t = head
        if (t != null) {
                    if (t != null) {
                        while(t?.next!=null) {
                            t = t.next
                        }
                    }
                }
        }


    var n = t.next
        var t = n.pre

    }
    fun RemoveFront()
    {

        if(head==null)
        {
            println("queue is Empty")
            return false

        }

        var data  = head.data
        var head = head.next
        return data
    }
    fun RemoveRear() : T
    {
        if(head==null)
        {
            println("Deque is Empty");
            return false
        }
        var  t = head
        while(t.next!=null)
        {
            t = t.next
        }
        var data = t.data
        t.pre.next = null
        return data
    }
    fun IsEmpty() : Boolean
    {
        if (head == null)
            return true
        else return false
    }
    fun Size() : Int
    {
        var count = 0
        if (head == null)
            return count
        var t = head
        while(t!=null)
        {
            t = t.next
            count++
        }
        return count
    }
     fun toString() : String
    {
        var  str = ""
        var  t = head
        while(t!=null)
        {
            str = str + t.data+" "
            t = t.next
        }
        return str
    }
