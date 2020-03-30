import java.time.LocalDateTime
import java.util.*
import java.util.regex.Pattern

class Regularexpression {
    companion object {
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var Message = "Hello <<name>>, We have your full name as <<full name>> in our system your contact number is 91-xxxxxxxxxx .Please,let us know in case of any clarification Thank you BridgeLabz 01-01-2016"
            println(Message)
            val namePattern = "^([a-zA-Z]{3,20})+$"
            val phonePattern: String = "^([0-9]{2})+-([0-9]{10})+$"
            val Full_namePattern = "^([a-zA-z-_]{3,10})+$"
            var name: String
            var phone: String
            var Full_name = ""
            while (true) {
                println("Enter the name")
                val name = scanner.nextLine()
                if (IsValid(name, namePattern)) {
                    println("Enter the 2nd name")
                    Message = Message.replace("<<name>>", name)
                    val Full_name = scanner.nextLine()
                    if (IsValid(Full_name, Full_namePattern)) {
                        println("Enter the phone number")
                        Message = Message.replace("<<full name>>", name.toString() + " " + Full_name)
                        val phone = scanner.nextLine()
                        if (IsValid(phone, phonePattern)) {
                            Message = Message.replace("91-xxxxxxxxxx", phone)
                            Message = Message.replace("01-01-2016", LocalDateTime.now().toString())
                            println(Message)
                            break
                        } else println("Entered Phone number is not valid")
                    } else println("Entered 2nd name is not valid")
                } else println("Entered name is not valid")
            }
        }

        fun IsValid(value: String, pattern: String): Boolean {
            return if (value.isNullOrBlank()) false else IsValid(value, pattern)
        }
    }
}
