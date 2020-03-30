import java.io.File

class CompanyShare {
    //  declaring variables like stocksymbol,numberofshares,datetime
    var stockSymbol:String?= null
    var numberOfShares:Int=0
    var datetime:Int=0

    //Declaring the constructor for the variables
    constructor(stockSymbol: String?, numberOfShares: Int, datetime: Int) {
        this.stockSymbol = stockSymbol
        this.numberOfShares = numberOfShares
        this.datetime = datetime
    }

    override fun toString(): String {
        return "[stockSymbol=$stockSymbol, numberOfShares=$numberOfShares, datetime=$datetime]"
    }
}
fun main(){
    val readJsonValue: Array<CompanyShare> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), Array<CompanyShare>::class.java)
    for (index in readJsonValue){
        print("$index")
    }
}