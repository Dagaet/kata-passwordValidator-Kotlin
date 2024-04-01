package dev.kata.passwordValidator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

internal class PasswordValidatorShould {
    @Test
    fun `Have at least 8 characters`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.execute("123456Ab")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a capital letter`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.execute("123456bC")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a lower case letter`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.execute("123456bC")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}
