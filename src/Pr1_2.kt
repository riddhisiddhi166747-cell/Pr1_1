fun main() {
    val i: Int = 10
    val doubleNumber: Double = i.toDouble()

    println("Integer value: $i")
    println("Double value (from integer): $doubleNumber")

    val str: String = i.toString()
    println("integer to string: $str")

    val i1: Int = str.toInt()
    val i2: Int = Integer.parseInt(str)
    println("Integer Value1 (From String): $i1")
    println("Integer Value2 (From String): $i2")

    val sd: String = "11.12"
    val dFS: Double = sd.toDouble()
    println("Double Value (From String): $dFS")
}
