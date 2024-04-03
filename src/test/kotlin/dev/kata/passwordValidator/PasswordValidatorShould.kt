package dev.kata.passwordValidator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PasswordValidatorShould {
    @Test
    fun `Allow password with at least 8 characters`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("aaaaa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }
    @Test
    fun `Allow a password with all requirements`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("a0Ab_")
        assertThat(isPasswordValid).isEqualTo(false)
    }

    @Test
    fun `Have at least a capital letter`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("aaaaa0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a lower case letter`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("AAAAA0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a number`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("AAAAA1bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least an underscore`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.isValid("AAAAA_1bC")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}
