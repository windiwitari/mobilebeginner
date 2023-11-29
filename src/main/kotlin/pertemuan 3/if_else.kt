package `pertemuan 3`

fun main(){
    val nilai = 70

    if (nilai > 50){
        println("lulus")
    }else{
        println("tidak lulus")
    }

    if (nilai > 70){
        println("A")
    }else if (nilai > 60) {
        println("B")
    }else{
        println("C")
    }

    val number = 0
    val hasil = when(number){
        1->"satu"
        2->"dua"
        3->"tiga"
        else -> "nomor tidak valid"
    }
    println(hasil)
}