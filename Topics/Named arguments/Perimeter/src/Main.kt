import kotlin.math.hypot
fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x1, y4: Double = y1): Double {
    val vertices = listOf(
        Pair(x1, y1),
        Pair(x2, y2),
        Pair(x3, y3),
        Pair(x4, y4)
    )

    if (vertices.size < 3 || vertices.size > 4) {
        throw IllegalArgumentException("A polygon must have 3 or 4 vertices.")
    }

    var totalPerimeter = 0.0

    for (i in 0 until vertices.size) {
        val (x1, y1) = vertices[i]
        val (x2, y2) = vertices[(i + 1) % vertices.size] // Wrap around for the last vertex

        totalPerimeter += hypot(x2 - x1, y2 - y1)
    }

    return totalPerimeter
}
fun main(){
val input = readLine()?.split(" ")

    if (input != null && input.size == 8) {
        val x1 = input[0].toDouble()
        val y1 = input[1].toDouble()
        val x2 = input[2].toDouble()
        val y2 = input[3].toDouble()
        val x3 = input[4].toDouble()
        val y3 = input[5].toDouble()
        val x4 = input[6].toDouble()
        val y4 = input[7].toDouble()

        val quadrilateralPerimeter = perimeter(x1, y1, x2, y2, x3, y3, x4, y4)
        println(quadrilateralPerimeter)
    } else {
        println("Please enter 8 valid coordinates separated by spaces.")
    }
}
