package dev.kata.passwordValidator

open class Validator {
    open fun  hasNumber(password: String):Boolean{
        val number = password.count{it.isDigit()}
        return number >= 1
    }
    open fun hasUnderscore(password: String):Boolean{
        val predicateUnderscore: (Char) -> Boolean = { it == '_' }
        val underscore = password.find(predicateUnderscore).toString()
        return underscore.length == 1
    }
    open fun hasLowerAndUpperCase(password: String):Boolean{
        val predicateUpperCase: (Char) -> Boolean = { it.isUpperCase() }
        val predicateLowerCase: (Char) -> Boolean = { it.isLowerCase() }
        val upperCase = password.find(predicateUpperCase).toString()
        val lowerCase = password.find(predicateLowerCase).toString()
        return upperCase.length == 1 && lowerCase.length == 1
    }

}