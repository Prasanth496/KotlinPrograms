import java.io.InputStreamReader

class List<T>
{

    class Node<T>
    {
        var data: T
        var next: Node<Any?>? = null

        constructor (data: T) {
            this.data = data
        }
    }

    var head: Node<Any?>? = null

    fun Append(data: InputStreamReader): Boolean {
        var n = Node(data)
        if (head == null) {
            var head = n
            return true
        }

        var t = head
        while (t?.next != null) {
            var t = t.next
        }
        var next = n
        return true;
    }

    fun Pop(): Any? {
        if (head == null) {
            println("List is Empty")
        }
        var t = head
        var p = head
        while (t?.next != null) {
            p = t
            t = t.next
        }
        var obj = t?.data
        p?.next
        return obj
    }

    fun peek(ind: Int): Any? {
        if (head == null) {

        }
        if (ind == 0)
            return head?.data
        var t: Node<Any?>? = head
        while (ind > 0 && t?.next != null) {

            var t = t.next

        }
        if (ind == 0)
            return t?.data
        return null
    }

    fun peek(): Any? {
        if (head == null)
            println("empty List")
        var t: Node<Any?>? = head
        var p: Node<Any?>? = head
        while (t?.next != null) {
            p = t
            t = t.next
        }
        var obj = t?.data
        return obj
    }

    fun search(data: InputStreamReader): Boolean {
        if (head == null)
            println("empty List");
        var t = head;
        while (t != null) {
            if (t.data?.equals(data)!!)
                return true;
            t = t.next
        }
        return false
    }

    fun isEmpty(): Boolean {
        if (head == null)
            return true;
        return false;
    }

    fun size() : Int {
        if (head == null)
            return 0;
        var t = head
        var count = 0
        while (t != null) {
            count++
            t = t.next
        }
        return count
    }

    fun Add(data: T): Boolean {
        var n: Node<Any?> = Node(data);
        if (head == null) {
            var head = n
            return true
        }
        n.next = head as Node<Any?>
        head = n
        return true
    }

    override fun toString(): String {
        if (head == null) {

        }
        var t = head
        var str = ""
        while (t != null) {
            str = str + t.data + " "
            t = t.next;
        }
        return str
    }

    fun Index(data: T): Int {
        var count = -1
        if (head == null)
            return -1
        var t = head;
        while (t != null) {
            count++
            if (t.data?.equals(data)!!)
                return count
            t = t.next

        }
        return -1
    }

    fun Insert(ind: Int, data: Any?): Boolean {
        var n = Node(data)
        if (ind == 0) {
            var ind = ind-1
            n.next = head?.next
            head = n
            return true
        }
        var t = head
        var pre = null
        while (ind > 0 && t != null)
        {
            var ind = ind - 1
            var pre = t
            t = t.next
        }
        if (ind == 0) {
            n.next = t
            return true
        }
        println("index is not in range")
        return true
    }


    fun Remove(data: InputStreamReader) : Boolean?
    {
        if (head == null)
            println("list is empty")
        if (head?.next == null)
             head = null
        var t = head
        var pre = null
        while (t != null)
        {
            if (t.data?.equals(data)!!)
            {
                var pre = t.next
                return true
            }
            var pre = t
            t = t.next
        }
        return false
    }
    fun Pop(ind : Int) : Any?
    {
        var obj : T
        if (ind == 0)
        {
            obj = head?.data as T
            head = head?.next
            return obj
        }
        var t = head
        var pre = null;
        while(ind>0 && t!=null)
        {
            var ind = ind-1
            var pre = t
            t = t.next
        }


        if (ind == 0)
        {
            var pre= t?.next
            var obj = t?.data
            return obj
        }
        println("index is not range")
        return false

    }
    fun ToArray() : Array<Int>
    {
        var size : Int =size()
        var array = arrayOf(size)
        for(i in 0 until size)
        {
            array[i]= peek(i) as Int
        }
        return array
    }
}