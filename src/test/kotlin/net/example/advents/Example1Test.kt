package net.example.advents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Example1Test {
    @Test
    fun `can add numbers`() {
        val underTest = Example1()
        assertThat(underTest.sums(1, 2)).isEqualTo(3)
    }
}