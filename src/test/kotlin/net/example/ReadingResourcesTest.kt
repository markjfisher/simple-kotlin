package net.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReadingResourcesTest {
    // This reads every line individually
    private val testData1 = resourceLines(2022, 1)

    // This reads blocks up to blank lines
    // NOTE: This is the Windows version, if you're on Linux, remove the delimiter as it defaults to \n\n
    private val testData2 = resourceStrings(2022, 2, "\r\n\r\n")

    @Test
    fun `can read test data line by line`() {
        assertThat(testData1).containsExactly("1 a", "2 b", "3 c")
    }

    @Test
    fun `can read into blocks`() {
        val crlf = "\r\n"
        // useful when you need to first break input into blocks, then break each block up separately
        assertThat(testData2).containsExactly("a${crlf}b${crlf}c", "d${crlf}e${crlf}f")
    }
}