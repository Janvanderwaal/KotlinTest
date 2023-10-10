fun main() {
    val inputs : Int = readln().toInt()

    when {
        inputs < 1 -> println("no army") 
        inputs in 1..4 -> println("few")
        inputs in 5..9 -> println("several")
        inputs in 10..19 -> println("pack")
        inputs in 20..49 -> println("lots")
        inputs in 50..99 -> println("horde")
        inputs in 100..249 -> println("throng")
        inputs in 250..499 -> println("swarm")
        inputs in 500..999 -> println("zounds")
        inputs > 999 -> println("legion")
    }
    // write your code here
}
