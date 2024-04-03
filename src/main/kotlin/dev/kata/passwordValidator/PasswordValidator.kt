package dev.kata.passwordValidator

class PasswordValidator{
    fun isValid(password: String): Boolean {
        return password.length >= 8 && hasLowerAndUpperCase(password) && hasNumber(password) && hasUnderscore(password)
    }

    private fun  hasNumber(password: String):Boolean{
        val number = password.count{it.isDigit()}
        return number >= 1
    }
    private fun hasUnderscore(password: String):Boolean{
        val predicateUnderscore: (Char) -> Boolean = { it == '_' }
        val underscore = password.find(predicateUnderscore).toString()
        return underscore.length == 1
    }
    private fun hasLowerAndUpperCase(password: String):Boolean{
        val predicateUpperCase: (Char) -> Boolean = { it.isUpperCase() }
        val predicateLowerCase: (Char) -> Boolean = { it.isLowerCase() }
        val upperCase = password.find(predicateUpperCase).toString()
        val lowerCase = password.find(predicateLowerCase).toString()
        return upperCase.length == 1 && lowerCase.length == 1
    }
}