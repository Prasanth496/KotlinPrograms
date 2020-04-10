import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.util.*

public class InventoryDetails {
    var rice: RiceDetails? = null
    var pulse: PulseDetails? = null
    var wheat: WheatDetails? = null

    constructor() {}
    constructor(rice: RiceDetails, pulse: PulseDetails, wheat: WheatDetails) : this() {
        this.rice = rice
        this.pulse = pulse
        this.wheat = wheat
    }

    override fun toString(): String {
        return "rice: $rice , pulse: $pulse, wheat: $wheat"
    }
}

public class RiceDetails {
    var propertyName: String? = null
    var weight: Int = 0
    var pricePerKg: Int = 0

    constructor() {}
    constructor(propertyName: String, weight: Int, pricePerKg: Int) : this() {
        this.propertyName = propertyName
        this.weight = weight
        this.pricePerKg = pricePerKg
    }

    override fun toString(): String {
        return "PropertyName: $propertyName , Weight: $weight, PricePerKG: $pricePerKg"
    }
}

public class PulseDetails {
    var propertyName: String? = null
    var weight: Int = 0
    var pricePerKg: Int = 0

    constructor() {}
    constructor(propertyName: String, weight: Int, pricePerKg: Int) : this() {
        this.propertyName = propertyName
        this.weight = weight
        this.pricePerKg = pricePerKg
    }

    override fun toString(): String {
        return "PropertyName: $propertyName , Weight: $weight, PricePerKG: $pricePerKg"
    }
}

public class WheatDetails {
    var propertyName: String? = null
    var weight: Int = 0
    var pricePerKg: Int = 0

    constructor() {}
    constructor(propertyName: String, weight: Int, pricePerKg: Int) : this() {
        this.propertyName = propertyName
        this.weight = weight
        this.pricePerKg = pricePerKg
    }

    override fun toString(): String {
        return "PropertyName: $propertyName , Weight: $weight, PricePerKG: $pricePerKg"
    }
}

var mapper = ObjectMapper()
fun writeInJason(ar: InventoryDetails) {
    try {
        mapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), ar)
        print("write ")
    } catch (ex: Exception) {
        print("not write")
        print(ex.printStackTrace())
    }
}

//method for reading the json
fun readInJason() {
    try {
        var carRead = mapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), InventoryDetails::class.java)
        print("read ")
        print(carRead)
    } catch (ex: Exception) {
        print("not read")
        print(ex.printStackTrace())
    }
}
// main function
fun main() {
    var read = Scanner(System.`in`)
    //  println("Rice")
    var List = LinkedList<String>()
    println("Enter the PropertyName")
    var propertyName = read.next()
    println("Enter the weight")
    var weight = read.nextInt()
    println("Enter the PricePerKG")
    var pricePerKg = read.nextInt()
    var rice = RiceDetails(propertyName, weight, pricePerKg)
    println("Enter the PropertyName")
    propertyName = read.next()
    println("Enter the weight")
    weight = read.nextInt()
    println("Enter the PricePerKG")
    pricePerKg = read.nextInt()
    var pulse = PulseDetails(propertyName, weight, pricePerKg)
    println("Enter the PropertyName")
    propertyName = read.next()
    println("Enter the weight")
    weight = read.nextInt()
    println("Enter the PricePerKG")
    pricePerKg = read.nextInt()
    var wheat = WheatDetails(propertyName, weight, pricePerKg)
    //writing to the json file
    List.add(rice.toString())
    List.add(pulse.toString())
    List.add(wheat.toString())
    var net = InventoryDetails(rice, pulse, wheat)
    writeInJason(net)
    //reading the json file
    readInJason()
}