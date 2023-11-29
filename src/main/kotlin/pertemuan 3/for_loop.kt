package `pertemuan 3`

fun main() {
    for (i in 1..10) { //titik titik dua merupakan range(sampai)
        println("nilai = $i")
        for (i in 10 downTo 1) { //downTo merupakan range(sampai) menurun
            println("nilai = $i")
        }

        val cars = arrayOf("volvo", "BMW", "ford", "mazda") // untuk mendeklarasikan banyak string
        for (x in cars)
            println(x)

        var i = 0 //mengulang dengan menambah 1 persatu sampai mencapai tujuan (0-5)
        while (i < 5) {
            println("nilai $i")
            i++
        }
    }
    var percobaan = 1 //mendeklarasikan string dengan menambah angka
    do {
        println("Buka Pintu - percobaaan ke $percobaan")
        percobaan++
    }while (percobaan < 5)
}