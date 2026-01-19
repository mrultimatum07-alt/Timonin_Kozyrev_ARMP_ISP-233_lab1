//var age: Int = 18
//    set(value) {
//        if ((value > 0) and (value < 110))
//            field = value
//    }
//data class Item(
//        val id: Int,
//        val name: String,
//        val quantity: Int
//        )

abstract  class Human(val name: String){
    abstract var age: Int
    abstract fun hello()

}
class Person(name: String, override var age: Int): Human(name){
    override fun hello(){
        println("My name is $name")
    }
}
fun main() {
    val denis: Person = Person("Denis",1)
    val maksim: Person = Person("Maksim",1000)
    denis.hello()
    maksim.hello()
//    val pavel: Human = Human("Pavel")
//    println(age)
//    age = 45
//    println(age)
//    age = -345
//    println(age)
//    val sword = Item(1,"Sword", 1)
//    val betterSword = sword.copy(quantity = 2)
//    println(sword.toString())
//    println(betterSword.toString())
//    val(id, name, quantity) = betterSword
//    println("Id предмета: $id\nИмя: $name\nКоличество: $quantity\n")
}