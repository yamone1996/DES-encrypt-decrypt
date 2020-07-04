package des

fun main() {
    val keys = "12345678"
    val messages = "49206D69737320796F750D0A00000000"
    println("Key     : $keys")
    println("Message : $messages")

    println()

    val encoded = DES.encrypt(keys, messages)
    println("Encoded : $encoded")

    //println()

   // val decoded = DES.decrypt(keys, encoded)
   // println("Decoded : $decoded")


}