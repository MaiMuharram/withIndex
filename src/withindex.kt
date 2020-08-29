fun main(){

    val myName = listOf<Char>('M','A','I','M','O','N','A','H')

    println("The List's Values and Indexes Using withIndex :")

    for ((index, value) in myName.withIndex()) {
        println("$index: $value")
    }


}