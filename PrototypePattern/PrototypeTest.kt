package com.designpatterns.creational.Prototype

class PrototypeTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val originalShallow = PersonShallowCopy()
            originalShallow.name = "Ashok"
            originalShallow.age = 23.toString()
            originalShallow.address = Address("Banglore", "Karnataka", "India")
            //now printing the original copy
            println("Original copy of Shallow------------------------>")
            println(originalShallow)
            //now creating the prototype of the original copy
            val duplicateShallow = originalShallow.Clone() as PersonShallowCopy
            //// making changes to the cloned copy
            duplicateShallow.name = "Pavan"
            duplicateShallow.age = 24.toString()
            duplicateShallow.address!!.city = "Pune"
            duplicateShallow.address!!.state = "Maharashtra"
            duplicateShallow.address!!.country = "India"
            //printing the duplicate copy
            println("Duplicate copy of Shallow------------------>-\n$duplicateShallow")
            //again priniting the original copy of the shallow copy
            println("once again Original copy of the Shallow ---------------------------->\n $originalShallow Deepclone")
            // now deep copy simulation
            val deepCopyOriginal = PersonDeepCopy()
            deepCopyOriginal.name = "Ashok"
            deepCopyOriginal.age = 23
            deepCopyOriginal.address = Address("Banglore", "Karantaka", "India")
            //Creating the clone
            val DeepDuplicate = deepCopyOriginal.Clone() as PersonDeepCopy
            DeepDuplicate.name = "Pavan"
            DeepDuplicate.age = 24
            DeepDuplicate.address.city = "Pune"
            DeepDuplicate.address.state = "Maharashtra"
            DeepDuplicate.address.Country = "India"
            // printing the original copy of deepCopy
            println("Original copy--------------------------------------->\n$deepCopyOriginal")
            // Printing the cloned copy
            println("Duplicate----------------------------------->\n$DeepDuplicate")
            //again printing the Original copy
            println("Again printing the origin copy------------------->\n$deepCopyOriginal")
        }
    }
}
