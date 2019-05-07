import com.rsk.Person

fun main() {
    println ("Hello, World!")

    val brixton = Person("Brixton")

    brixton.name = "Jessica"

    println("Your name is ${brixton.name}")

    brixton.display()

    brixton.displayWithLambda(::printName)

    val question = Question()
    question.Answer = "happiness"
    question.display()
    println("hey ${question.Answer}")
    printName("The answer to the question, ${question.Question}, is ${question.Answer}.")

}
fun printName(name: String){
    println(name)

}

class Question {
    var Answer:String = ""
    val Question:String = "What is the meaning of life?"
    fun display() {
        println("You said $Answer")
    }

}