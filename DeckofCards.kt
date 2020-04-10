class DeckofCards {
    companion object {

        // function for correctdisplay
        fun correctDisplay(firstPerson: Array<Array<String?>>, person: Int) {
            var count = 0
            var array: Array<Array<String?>?> = arrayOfNulls(4)
            for (rowIndex in 0..3) {
                for (columnIndex in 0..12) {
                    if (firstPerson[rowIndex][columnIndex] != null) {
                        count++
                    }
                }
            }
            for (rowIndex in 0..3) {
                array[rowIndex] = arrayOfNulls(count)
                var jaggedCount = 0
                for (columnIndex in 0..12) {
                    if (firstPerson[rowIndex][columnIndex] != null) {
                        array[rowIndex]!![jaggedCount++] = firstPerson[rowIndex][columnIndex]
                    }
                }
            }
            println("Display the correct order of $person person ")
            for (rowIndex in array.indices) {
                for (columnIndex in 0 until 3) {
                    print("${array[rowIndex]!![columnIndex]} ")
                }
                println()
            }
        }

        // function for shuffle the cards
        fun shuffleCards(
            firstPerson: Array<Array<String?>>,
            secondPerson: Array<Array<String?>>,
            thirdPerson: Array<Array<String?>>,
            fourthPerson: Array<Array<String?>>
        ) {
            var count = 0
            var personCount = 1
            var key: String? = null
            while (count <= 36) {
                var row: Int = (0..3).random()
                var column: Int = (0..12).random()
                when (column) {
                    0 -> key = "A"
                    10 -> key = "K"
                    11 -> key = "Q"
                    12 -> key = "J"
                    1, 2, 3, 4, 5, 6, 7, 8, 9 -> key = "$column"
                }
                when (personCount) {
                    1 -> {
                        firstPerson[row][column] = key
                        personCount++
                    }
                    2 -> {
                        secondPerson[row][column] = key
                        personCount++
                    }
                    3 -> {
                        thirdPerson[row][column] = key
                        personCount++
                    }
                    4 -> {
                        fourthPerson[row][column] = key
                        personCount = 1
                    }
                }
                count++
            }
        }

        //function for displaying the array
        fun displayArray(firstPerson: Array<Array<String?>>, person: Int) {
            println("The cards of $person person ")
            for (rowIndex in firstPerson) {
                for (columnIndex in rowIndex) {
                    print("$columnIndex ")
                }
                println()
            }
        }
        @JvmStatic
        fun main(args : Array<String>) 
        {
            var firstPerson = Array(4) { arrayOfNulls<String>(13) }
            var secondPerson = Array(4) { arrayOfNulls<String>(13) }
            var thirdPerson = Array(4) { arrayOfNulls<String>(13) }
            var fourthPerson = Array(4) { arrayOfNulls<String>(13) }
            //1-"Clubs", 2-"Diamonds", 3-"Hearts", 4-"Spades"
            shuffleCards(firstPerson, secondPerson, thirdPerson, fourthPerson)
            displayArray(firstPerson, 1)
            displayArray(secondPerson, 2)
            displayArray(thirdPerson, 3)
            displayArray(fourthPerson, 4)
            correctDisplay(firstPerson, 1)
            correctDisplay(secondPerson, 2)
            correctDisplay(thirdPerson, 3)
            correctDisplay(fourthPerson, 4)
        }
    }
}
