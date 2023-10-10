// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false){
    var yearold: Int = old
    var pkilometers: Int = kilometers
    var pmaximumSpeed: Int = maximumSpeed
    var pautomatic: Boolean = automatic
    var Autowaarde: Int = 20000 - (2000 * yearold)


    if (pmaximumSpeed > 120) {
        Autowaarde = Autowaarde + (pmaximumSpeed - 120) * 100
    }else {
        Autowaarde = Autowaarde - (120 - pmaximumSpeed ) * 100
    }
    
    if (pkilometers > 9999 ){
        val tienduizendkilometers : Int = pkilometers / 10000
        Autowaarde = Autowaarde - (tienduizendkilometers * 200)
    }
    
    if (pautomatic == true){
        Autowaarde = Autowaarde + 1500
    }

println(Autowaarde)
}


