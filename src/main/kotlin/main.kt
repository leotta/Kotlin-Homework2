import com.sun.jdi.Bootstrap

fun main() {

    //Задача 1

    var kopecks = 100
    var transfer: Int = 1000 * kopecks          // Ввод в рублях
    var amount: Double  = (transfer * 0.75)/100
    if (amount < 3500) {
        amount = 3500.0
    }
    println("Ваша комиссия составляет: " + amount + " копеек")

    //Задача 2

    var likes = 61
    if ( likes % 10 == 1 ) {
        println("Приложение нравится " + likes + " человеку")
    } else {println("Приложение нравится " + likes + " людям")}

    //Задача 3

    var purchase = 100
    var sale5: Double = purchase * 0.95
    var sale1: Double = sale5 - (sale5 / 100)
    var musiclove: Boolean = true
    var result: Double = 0.0
    if (musiclove == true) {
        result == sale1
        println("Стоимость вашей покупки " +  sale1 + " рублей")
    } else println("Стоимость вашей покупки " +  sale5 + " рублей")
}