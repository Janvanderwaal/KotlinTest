import java.text.DecimalFormat
import kotlin.math.sqrt

fun main() { 
     val Input1: String = readln() ?: ""

     val decimalFormat = DecimalFormat("#.#")
    val decimalFormat2 = DecimalFormat("#.##")
     var Output: Double = 0.0

     when (Input1){
         "rectangle" -> {     
             val Input2: Double = readln().toDouble()
             val Input3: Double = readln().toDouble()
             Output = Input2 * Input3
             println(Output)}
         
         "circle" -> {
            val Input2: Double = readln().toDouble()
             Output = 3.14 * Math.pow(Input2, 2.0)
             println(Output)
            }
         
         "triangle" -> {
                val Input2: Double = readln().toDouble()
                val Input3: Double = readln().toDouble()
                val Input4: Double = readln().toDouble()
                val test: Double = (Input2 * Input3) / 2
                Output = kotlin.math.sqrt((Input2 + Input3 + Input4) / 2 * ((Input2 + Input3 + Input4) / 2 - Input2) * ((Input2 + Input3 + Input4) / 2 - Input3) * ((Input2 + Input3 + Input4) / 2 - Input4))
                println(Output)}

     }

     //println(Input1)

    // write your code here
}
