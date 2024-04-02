package dev.kata.passwordValidator

class PasswordValidator1 : Validator(){
    fun execute(password: String): Boolean {
        return password.length >= 8 && hasLowerAndUpperCase(password) && hasNumber(password) && hasUnderscore(password)
    }
}
class PasswordValidator2: Validator() {
    fun execute(password: String): Boolean {
        return password.length >= 6 && hasLowerAndUpperCase(password) && hasNumber(password)
    }
}
class PasswordValidator3: Validator() {
    fun execute(password: String): Boolean {
        return password.length >= 16 && hasLowerAndUpperCase(password) && hasUnderscore(password)
    }
}