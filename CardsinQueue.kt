import Queue
class CardsinQueue
{
    companion object{
  @JvmStatic
 fun main(args : Array<String>) {
    var firstPerson = Array(4) { arrayOfNulls<String>(13) }
    var secondPerson = Array(4) { arrayOfNulls<String>(13) }
    var thirdPerson = Array(4) { arrayOfNulls<String>(13) }
    var fourthPerson = Array(4) { arrayOfNulls<String>(13) }
    //1-"Clubs", 2-"Diamonds", 3-"Hearts", 4-"Spades"
    shuffleCards(firstPerson, secondPerson, thirdPerson, fourthPerson)

}

fun shuffleCards(firstPerson: Array<Array<String?>>, secondPerson: Array<Array<String?>>, thirdPerson: Array<Array<String?>>, fourthPerson: Array<Array<String?>>) {
    var firstQueueReference = Queue(9)
    var secondQueueReference = Queue(9)
    var thirdQueueReference = Queue(9)
    var fourthQueueReference = Queue(9)
    var count = 0
    var personCount = 1
    var key: String? = null
    var deck: String? = null
    while (count <= 36) {
        var row: Int = (0..3).random()
        var column: Int = (0..12).random()
        when (row) {
            0 -> deck = "Clubs-"
            1 -> deck = "Diamonds-"
            2 -> deck = "Hearts-"
            3 -> deck = "Spades-"
        }
        when (column) {
            0 -> key = " A"
            10 -> key = " K"
            11 -> key = " Q"
            12 -> key = " J"
            1, 2, 3, 4, 5, 6, 7, 8, 9 -> key = " $column"
        }
        when (personCount) {
            1 -> {
                firstQueueReference.enque(deck + key)
                personCount++
            }
            2 -> {
                secondQueueReference.enque(deck + key)
                personCount++
            }
            3 -> {
                thirdQueueReference.enque(deck + key)
                personCount++
            }
            4 -> {
                fourthQueueReference.enque(deck + key)
                personCount = 1
            }
        }
        count++
    }
    firstQueueReference.diplayQueue()
    secondQueueReference.diplayQueue()
    thirdQueueReference.diplayQueue()
    fourthQueueReference.diplayQueue()
}