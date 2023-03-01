fun main() {
val person = Human("Joyeuse",20,70)
    person.eat(2)
    person.weight
    person.speak("Imagination is more important than knowledge")
    person.birthday()
    var user1= User("Joyeuse","KABANYANA","joyeusekabanyana@gmail.com",787520385,"abana")
    println(user1.lname)
    println(user1.email)
}
class Human(var name:String, var age:Int, var weight:Int){
   fun eat(foodWeight: Int){
       println("I am eating ${foodWeight} kgs of food")
       weight+=foodWeight
       println("my weight is ${weight}kgs")
   }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday( ){
        age++
        println("I am ${age} years old")
    }

}
data class User(var fname:String, var lname:String, var email:String, var phonenumber:Int, var password:String)


