class Book(
    val name: String,
    val desc: String,
    val originalPrice: Int,

    ) {

    var discount: Int = 0
    fun use() {
        discount = when {
            discount < 10 -> 10
            discount < 50 -> 50
            else -> 80
        }
    }

    fun printInfo() {
        println("name: $name")
        println("price: ${getPrice()}")
    }

    fun getPrice(): Int {
        return originalPrice * (100 - discount) / 100
    }
}

val myBook = Book(
    name = "쉬운 Kotlin",
    desc = "자바보다 좋아요",
    originalPrice = 10000
)

myBook.printInfo()
myBook.use()
myBook.printInfo()
myBook.use()
myBook.printInfo()
