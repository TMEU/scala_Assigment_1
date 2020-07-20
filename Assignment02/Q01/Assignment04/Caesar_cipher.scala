object Caesar_cipher extends App {

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val inputString = "Hello Caesar"

	val EncryptChar = (c:Char, shift:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)+shift)% alpha.size)

	val DecryptChar = (c:Char, shift:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)-shift+alpha.size) % alpha.size)

	val cipher = (algo:(Char,Int,String) => Char,text:String, shift:Int, alpha:String) => text.map(algo(_,shift,alpha))

	val Encrypt = cipher(EncryptChar,inputString,5,alphabet)

	val Decrypt = cipher(DecryptChar,Encrypt,5,alphabet)

	println( "Encrypted Text of " +inputString+ "=" + Encrypt)

	println("Decrypted Text of " +Encrypt+ "=" + Decrypt)


}