package com.example.demo

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun greetingUsesProvidedName() {
        assertEquals("Hello, GitHub!", greeting("GitHub"))
    }
}
