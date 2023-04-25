fun main(args: Array<String>) {
    var account = CurrentAccount("700883078","Aita",200.0)
    account.deposit(300.0)
    account.withdraw(400.0)
    account.details()

    multiples(20,4)

    var given = givenString("am good")
    println(given[0])
    println(given[6])
    println(given.length)



}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun givenString(text:String):String{
    return text





}



 open class CurrentAccount(var number:String, var name:String,var balance:Double){
    fun deposit(amount:Double){
        var balance = 0
        for( i in 1..1000){
            balance++
        }
        println(amount)

    }
     fun withdraw(amount:Double){
        var balance = 0
        for(i in 1..1000){
            balance--
        }
        println(amount)

    }
     fun details(){
        println("Account number $number with balance $balance is operated by $name")
    }
}
class SavingsAccount(var number:String, var name:String,var balance:Double,var withdrawals:Int){

    fun withdrawals(){

    }

}
fun multiples(num1:Int,num2:Int){
    var num1 = 6
    var num2 = 8
    for(i in 1..1000){
        num1*=i
        num2*=8
        if(num1 <= num2){
            println("Bingo")
        }

    }
}

fun takePassword(password:String):Boolean{
    when(password){
        in 0..9 ->println()
        in 9..17->println()
        in 6..17->println()
        else -> println()

}





