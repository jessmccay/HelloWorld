import com.rsk.Person

fun main() {
    println ("Hello, World!")

    val brixton = Person("Brixton")

    brixton.name = "Jessica"

    println("Your name is ${brixton.name}")

    brixton.display()

    brixton.displayWithLambda(::printName)
}
fun printName(name: String){
    println(name)
}