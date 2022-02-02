fun main(){
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    var yourString = "abcz"
    var n: Int = 0
    var newString = ""

    yourString.forEach{ letter ->
        if (alphabet.indexOf(letter) + n >= alphabet.length) {
            newString += alphabet[(n-(alphabet.length-alphabet.indexOf(letter)))]
        }else {
            newString += alphabet[(alphabet.indexOf(letter) + n)]
        }
    }
    println(newString)
}