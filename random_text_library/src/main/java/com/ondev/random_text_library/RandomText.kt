package com.ondev.random_text_library

import kotlin.random.Random

object RandomText {
    private val listChars = ('a'..'z').toList()

    fun build(start: Byte, end: Byte): String {
        var result = ""
        val max = Random.nextInt(start.toInt(), end.toInt())
        for (i in 1..max) {
            result += listChars[Random.nextInt(listChars.size - 1)]
        }
        return result
    }

}