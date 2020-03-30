package com.designpatterns.behavoiural.Visitor

public class ShoppingCartVisitorImpl : ShoppingCartVisitor
{


    // visit method which is to be implented and written logic in this class
    fun visit(book: Book) : Int
    {
        var cost = 0

        if (book.GetPrice() > 50)
        {
            cost = book.GetPrice() + 5
            println("ISBN: {0} book Price with Tax :{1} ${book.GetIsbnNumber()} $cost")
        }
        else
        {
           var cost = book.GetPrice()
            println("ISBN number: {0} and price without Tax: {1} ${book.GetIsbnNumber()}, $cost")
        }
        return cost
    }

    fun visit(fruit: Fruit) : Int
    {
        var cost = 0
        //Here we write  logic for Fruits
        if (fruit.GetPricePerKg() >300)
        {
            var cost = fruit.GetPricePerKg()
            println("{0} is Eligible for Free Delivery as the PricePerKg is Rs.{1}.00/- ${fruit.GetName()}, ${fruit.GetPricePerKg()}")
        }
        else
        {
            println("{0} total cost with Delivary Charge is {1}+50/-(delivery charge) ${fruit.GetName()}  ${fruit.GetPricePerKg()}")
             var cost = fruit.GetPricePerKg()+50
        }
        return cost
    }
}

interface ShoppingCartVisitor {

}
