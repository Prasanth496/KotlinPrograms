import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*

class OrderedList<T> {
    // class to create node in linked list
     class Node(var data: Any) {
        var next: Node? = null

    }

    var head: Node? = null
    //function to add elements to Linked_List
    fun add(obj: Any?): Boolean
    {
        val n = Node(obj!!)
        //If head 'null' then  List is empty, add element and make head pointer to refer it
        if (head == null) {
            head = n
            return true
        }
        var t: Node = head as Node
        /* If head not 'null' then traverse the entire list till end
			 *  i.e next_address='null' and add element */while (t.next != null) {
            t = t.next!!
        }
        t.next = n
        return true
    }

    /*Method to display elements of Linked_List*/
    fun display(l: OLL<Int>) {
        var t = head
        //If head 'null' then  List is empty
        if (head == null) {
            println("No elements to display")
            return
        }
        /*If head not 'null' then traverse the entire list till end
		 *  i.e next_address='null' and display list_data */while (t != null) {
            if (t.next != null) {
                print(t.data.toString() + "-->")
            } else {
                print(t.data.toString() + "\n")
            }
            t = t.next
        }
    }

    /*Method to find a number in Linked_List*/
    fun search(ll: OLL<Int>, word: Int): Int {
        var t = head
        var i = 0
        while (t != null) {
            if (t.data as Int == word) return i
            t = t.next
            i++
        }
        return -1
    }

    /*Method to delete a number in Linked_List*/
    fun deleteData(link: OLL<Int>, data: Int) {
        var t = head
        var move = t!!.next
        if (t.data as Int == data && t.next != null) {
            head = t.next
            return
        }
        while (move != null) {
            if (t!!.next!!.data as Int == data) {
                t.next = move.next
                return
            }
            t = t.next
            move = move.next
        }
    }

    /*Method to add a number at specific position in Linked_List*/
    fun insertAtSpecificPosition(oll: OLL<Int>, num: Int) {
        val n = Node(num)
        if (head == null) {
            head = n //List is empty add newNode
            return
        }
        var t: Node = head as Node
        var move = t.next!!
        if (t.next == null && t.data as Int > num) {
            n.next = t
            head = n //If number less than head.data add it first
            return
        }
        while (t.next != null) { // To insert at First
            if (num < t.data as Int) {
                n.next = t
                head = n
                break
            }
            // To insert at Specific position
            if (num > t.data as Int && num < move.data as Int) {
                n.next = move
                t.next = n
                break
            }
            t = t.next!!
            move = move.next!!
        }
        if (t.data as Boolean) {
            t.next = n //To insert at last
        }
    }

    /*Method to add numbers to file*/
    @Throws(IOException::class)
    fun writeListToFile(file: FileWriter, link: OLL<Int>) {
        if (head == null) {
            println("No content to write in file")
            return
        }
        var t = head
        while (t != null) {
            if (t.next != null) file.write(t.data.toString() + ",") else file.write(t.data.toString())
            t = t.next
        }
        file.close()
    }

    companion object {
        @Throws(IOException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val link = OLL<Int>()
            val scanner = Scanner(File("C:\\Users\\prashanth\\Desktop\\number.txt"))
            val numbers = ArrayList<Int>()
            scanner.useDelimiter(",")
            while (scanner.hasNext()) {
                val s = scanner.next().trim { it <= ' ' }
                numbers.add(s.replace("\\uFEFF".toRegex(), "").toInt())
            }
            println("Contents of file: ")
            println(numbers.toString() + "\n")
            for (i in numbers.indices) {
                link.insertAtSpecificPosition(link, numbers[i])
            }
            println("After sorting and adding to link list: ")
            link.display(link)
            println()
            println("Enter number you want to find: ")
            val sc = Scanner(System.`in`)
            val findNum = sc.nextInt()
            val search = link.search(link, findNum)
            if (search != -1) {
                link.deleteData(link, findNum)
                println("$findNum found at index: $search")
                println("After deleting: $findNum")
                link.display(link)
                println()
            } else {
                link.insertAtSpecificPosition(link, findNum)
                println("$findNum not found in list: ")
                println("After adding $findNum at specific position: ")
                link.display(link)
                println()
            }
            val fw = FileWriter("C:\\Users\\prashanth\\Desktop\\sorted.txt")
            //adding numbers to file
            link.writeListToFile(fw, link)
        }
    }
}