import java.util.*

fun isWon(array: Array<CharArray>): String?
{
    //variables to check if player has won the game
    var prow = 0
    var pcol = 0
    var pd1 = 0
    var pd2 = 0
    //variables to check if computer has won the game
    var crow = 0
    var ccol = 0
    var cd1 = 0
    var cd2 = 0
    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i][j] == 'X') pcol++ else pcol = 0
            if (array[i][j] == 'O') ccol++ else ccol = 0
        }
        //If all 'O's in a column
        if (ccol == 3)
            return "Sorry!! Computer has won the game"
        //If all 'X's in a column
        if (pcol == 3) return "Congrats!! You won the game"
    }
    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i][j] == 'X') prow++ else prow = 0
            if (array[i][j] == '*') crow++ else crow = 0
            if (i == j && array[i][j] == 'X') pd1++
            if (i == j && array[i][j] == '*') cd1++
            if (i + j == 2 && array[i][j] == 'X') pd2++
            if (i + j == 2 && array[i][j] == '*') cd2++
        }
        //If all 'X's in a row
        if (prow == 3)
            return "Congrats!! You won the game"
        //If all 'O's in a row
        if (crow == 3)
            return "Sorry!! Computer won the game "
    }
    //If all 'X's in diagonal
    if (pd1 == 3 || pd2 == 3) return "You won the game "
    //If all 'O's in diagonal
    return if (cd1 == 3 || cd2 == 3) "Sorry!! Computer won the game " else null
}

fun isFull(a: Array<CharArray>): Boolean {
    for (i in a.indices) {
        for (j in a.indices) {
            if (a[i][j] == '_') return false
        }
    }
    return true
}

fun displayGameBoard(board: Array<CharArray>) {
    for (i in board.indices) {
        for (j in board.indices) {
            print(board[i][j].toString() + " ")
        }
        println()
    }
}


fun main(args: Array<String>) {
    val board = arrayOf(charArrayOf('_', '_', '_'), charArrayOf('_', '_', '_'), charArrayOf('_', '_', '_'))
    println("Before Play:")
    displayGameBoard(board)
    val scanner = Scanner(System.`in`)
    val r = Random()
    while (true)
    {
        println("----------------------")
        while (true) {
            println("Enter the row to insert:")
            val row: Int = scanner.nextInt()
            println("Enter the column to insert:")
            val col: Int = scanner.nextInt()
            if (row > 2 || col > 2 || board[row][col] != '_')
                println("Invalid cell or cell not empty choose another")
            else
                board[row][col] = 'X'
                break

        }
        while (true)
        {
            val row1: Int = r.nextInt(3)
            val col1: Int = r.nextInt(3)
            // Random  input by computer to fill the cell
            if (board[row1][col1] == '_' || isFull(board) == true) {
                board[row1][col1] = 'O'
                break
            }
        }
        //Display the board after each input
        displayGameBoard(board)
        // If board is full then neither user nor computer won then match draw
        if (isFull(board) == true && isWon(board) == null)
        {
            println("Sorry!! Match draw Try another time")
            break
        }
        //Check whether user or computer won the game
        if (isWon(board) != null) {
            println(isWon(board))
            break
        }
    }
    displayGameBoard(board)
}