//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
////Create an instance of this human class and invoke all its functions
fun main(){
    var sister=Human("Moreher",20,50)
    sister.eat(2)
    println(sister.weight)
    sister.speak("I am full")
    sister.birthday()
    var brother=Human("Mohamed",25,70)
    brother.eat(5)
    println(brother.weight)
    brother.speak("I am not yet full")
    brother.birthday()
    var employer=User("Jillo","Mercy","jilercy@gmail.com","0796857861","jmiel123@!")
    println(employer.email)
    println(employer.secondName)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")

    }
    //speak(speech: String) :Prints the string passed to it
    //points)
    fun speak(speech:String){
        println(speech)
    }
    //birthday( ) :Increments the human’s age by 1(2
    //points)
    fun birthday(){
        age+=1
        println(age)
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class User(var firstName:String,var secondName:String,var email:String,var phoneNumber:String,var password:Any)
