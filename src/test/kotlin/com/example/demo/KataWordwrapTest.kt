package com.example.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KataWordwrapTest {
    @Test
    fun separateTheString() {
        val s = WordwrapKata()
        val result = s.wrap("Escribe una clase llamada Wrapper", 5)
        assertEquals("Escri\nbe\nuna\nclase\nllama\nda\nWrapp\ner", result)
    }

}