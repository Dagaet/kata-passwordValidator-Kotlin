package dev.kata.passwordValidator

class PasswordValidator{
    fun execute(something: String): Boolean {
        return something.length >= 8 && hasLowerAndUpperCase(something)
    }

    private fun hasLowerAndUpperCase(dataParsed: String):Boolean{
        val predicateUpperCase: (Char) -> Boolean = { it.isUpperCase() }
        val predicateLowerCase: (Char) -> Boolean = { it.isLowerCase() }
        val upperCase = dataParsed.find(predicateUpperCase).toString()
        val lowerCase = dataParsed.find(predicateLowerCase).toString()
        return upperCase.length == 1 && lowerCase.length == 1
    }
}