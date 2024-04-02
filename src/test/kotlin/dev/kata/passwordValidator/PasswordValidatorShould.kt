package dev.kata.passwordValidator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Validator1Should {
    @Test
    fun `Have at least 8 characters`() {
        val passwordValidator = PasswordValidator1()
        val isPasswordValid = passwordValidator.execute("aaaaa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a capital letter`() {
        val passwordValidator = PasswordValidator1()
        val isPasswordValid = passwordValidator.execute("aaaaa0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a lower case letter`() {
        val passwordValidator = PasswordValidator1()
        val isPasswordValid = passwordValidator.execute("AAAAA0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a number`() {
        val passwordValidator = PasswordValidator1()
        val isPasswordValid = passwordValidator.execute("AAAAA1bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least an underscore`() {
        val passwordValidator = PasswordValidator1()
        val isPasswordValid = passwordValidator.execute("AAAAA_1bC")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}

internal class Validator2Should{
    @Test
    fun `Have at least 6 characters`() {
        val passwordValidator = PasswordValidator2()
        val isPasswordValid = passwordValidator.execute("aa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a capital letter`() {
        val passwordValidator = PasswordValidator2()
        val isPasswordValid = passwordValidator.execute("aa0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a lower case letter`() {
        val passwordValidator = PasswordValidator2()
        val isPasswordValid = passwordValidator.execute("AA0bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }
    @Test
    fun `Have at least a number`() {
        val passwordValidator = PasswordValidator2()
        val isPasswordValid = passwordValidator.execute("AA1bC_")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}
internal class Validator3Should{
    @Test
    fun `Have at least 16 characters`() {
        val passwordValidator = PasswordValidator3()
        val isPasswordValid = passwordValidator.execute("1234562345aa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a capital letter`() {
        val passwordValidator = PasswordValidator3()
        val isPasswordValid = passwordValidator.execute("1234562345aa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }

    @Test
    fun `Have at least a lower case letter`() {
        val passwordValidator = PasswordValidator3()
        val isPasswordValid = passwordValidator.execute("1234562345aa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }
    @Test
    fun `Have at least an underscore`() {
        val passwordValidator = PasswordValidator3()
        val isPasswordValid = passwordValidator.execute("1234562345aa0Ab_")
        assertThat(isPasswordValid).isEqualTo(true)
    }
}