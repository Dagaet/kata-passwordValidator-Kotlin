package dev.kata.passwordValidator

class PasswordValidator{
    fun execute(something: String): Boolean {
        val predicate: (Char) -> Boolean = { it.isUpperCase() }
        val mayus = something.find(predicate)
        if (something.length >= 8 && mayus.toString().length == 1){
            return true
        }
        return false
    }
}