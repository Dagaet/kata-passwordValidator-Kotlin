package dev.kata.passwordValidator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

internal class PasswordValidatorShould {
    @Test
    fun `Have at least 8 characters`() {
        val passwordValidator = PasswordValidator()
        val isPasswordValid = passwordValidator.execute("12345678")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}
