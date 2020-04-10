package com.designpatterns.behavoiural.Visitor

public class VistorPatternTest {
    companion object {

        //method to run the code
        @JvmStatic
        fun main(args: Array<String>) {
            var item: () -> Book =
                { Book(45, "2343");Fruit(500, 6, "Banana");Fruit(200, 3, "Pinapple");Book(60, "5455") }
            var amount: () -> Book = item
            println(amount)

        }


        //method to calculate the totalprice of the items that are in the list
        fun CalculateTotalPrice(Items: ItemElement<IntArray>): Int {
            var sum = 0
            var visitor = ShoppingCartVisitorImpl()
            val items = 0
            for (item in items) {
                var sum = sum + item.Accept(visitor)
            }
            return sum
        }
    }
}
