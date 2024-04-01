package dev.kata.passwordValidator

class PasswordValidator{
    fun execute(something: String): Boolean {
        val predicateUpperCase: (Char) -> Boolean = { it.isUpperCase() }
        val predicateLowerCase: (Char) -> Boolean = { it.isLowerCase() }
        val upperCase = something.find(predicateUpperCase)
        val lowerCase = something.find(predicateLowerCase)
        return something.length >= 8 && upperCase.toString().length == 1 && lowerCase.toString().length == 1
    }
}