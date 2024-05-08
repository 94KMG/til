class Car(
    val model: String,
    var speed: Int,
    var gas: Int
) {

    val limitSpeed: Int = 300
    val maxFuel: Int = 100
    fun getSpeeds(): Int {
        return speed
    }

    fun increaseSpeed(): Int {
        val rpm: Int = 10
        speed = when (speed) {
            limitSpeed -> 0
            else -> speed * (100 + rpm) / (100)
        }
        return speed
    }

    fun addGas(newGas: Int): Int {
        gas = when (gas) {
            maxFuel -> gas
            else -> gas + newGas
        }
        return gas
    }

    fun printInfo(){
        println("model: $model")
        println("speed: $speed")
        println("gas: $gas")
    }
}

val car = Car(
    model = "산타페",
    speed = 200,
    gas = 80
)

car.printInfo()
car.addGas(20)
car.printInfo()
car.increaseSpeed()
car.printInfo()
car.getSpeeds()
