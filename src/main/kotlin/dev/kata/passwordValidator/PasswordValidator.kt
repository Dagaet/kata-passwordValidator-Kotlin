package dev.kata.passwordValidator

class PasswordValidator{
    fun execute(something: String): Boolean {
        return something.length >= 8
    }
}

class StringCalculatorDependency {
    fun doSomething() {}
}
