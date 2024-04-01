package dev.kata.passwordValidator

class PasswordValidator{
    fun execute(password: String): Boolean {
        return password.length >= 8 && hasLowerAndUpperCase(password)
    }

    private fun hasLowerAndUpperCase(password: String):Boolean{
        val predicateUpperCase: (Char) -> Boolean = { it.isUpperCase() }
        val predicateLowerCase: (Char) -> Boolean = { it.isLowerCase() }
        val upperCase = password.find(predicateUpperCase).toString()
        val lowerCase = password.find(predicateLowerCase).toString()
        return upperCase.length == 1 && lowerCase.length == 1
    }
}