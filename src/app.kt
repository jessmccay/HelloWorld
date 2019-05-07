import com.rsk.Person

fun main() {
    println ("Hello, World!")
    val brixton = Person("Brixton")
    brixton.name = "Jessica"
    println("Your name is ${brixton.name}")
    brixton.display()
    brixton.displayWithLambda(::printName)

    val q:Question? = Question()
    println(q?.question)
    q?.answer = "Love & happiness"
    q?.display()
    val message = if(q?.answer == q?.correctAnswer) {
        "You were right!"
    } else {
        "Sorry, you were incorrect."
    }
    println(message)
    println("The answer to the question, ${q?.question}, is ${q?.answer}.")
}
fun printName(name: String){
    println(name)

}

class Question {
    var answer:String? = null
    val question:String = "What is the meaning of life?"
    val correctAnswer = "Love & happiness"


    fun display() {
        println("You said $answer")
    }

}