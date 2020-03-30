import java.util.*

class AnagramPalindromePrimes {
	companion object {
		//function to check numbers are prime
		fun isPrime(n: Int): Boolean {
			var i = 2
			while (i <= n / 2) {
				if (n % i == 0) return false
				else i++
			}
			return true
		}

        //function check numbers are palindromes
		fun isPalindrome(s1: String): Boolean {
			var s2 = ""
			for (i  in 0 until s1.length) {
				s2 = s1[i].toString()+s2
			}
			return s1 == s2
		}
		//function to check numbers are anagrams
		 fun isAnagram(str1: String, str2: String): Boolean {
			var str1 = str1
			var str2 = str2
			if (str1.length != str2.length) return false
			else {
				str1 = sort(str1)
				str2 = sort(str2)
			}
			return compare(str1, str2)
		}
		//function to compare the two strings
		private fun compare(str1: String, str2: String): Boolean {
			val array1 = str1.toCharArray()
			val array2 = str2.toCharArray()
			for (i in array1.indices) {
				if (array1[i] != array2[i]) return false
			}
			return true
		}
        //function to sort the strings
		fun sort(str1: String): String {
			val sort = str1.toCharArray()
			for (i in sort.indices) {
				for (j in sort.indices) {
					if (sort[i] > sort[j]) {
						val temp = sort[i]
						sort[i] = sort[j]
						sort[j] = temp
					}
				}
			}
			return String(sort)
		}

		@JvmStatic
		fun main(args: Array<String>) {
			val al = ArrayList<Int>()
			for (i in 2..999) {
				if (isPrime(i) && isPalindrome(i.toString())) al.add(i)
			}
			println("Prime and palindrome numbers within 1 to 1000 are:")
			println(al)
			println("Prime and palindrome and Anagram numbers within 1 to 1000 are:")
			var count = 0
			for (i in al.indices) {
				var res = false
				for (j in 0..1000) {
					res = isAnagram(al[i].toString(), j.toString())
					if (res)
					{
						println(al[i])
						count++
						break
					}
				}
			}
			println("Count: $count")
			println("Total prime numbers: " + al.size)

		}
	}
}