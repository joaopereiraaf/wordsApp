package com.example.myapplication

data class Words(val word: String, val wordCount: Int)

fun hashOfWords(input: String): List<Words> {
    val listOfStrings = input.split(" ")
    val wordCount = hashMapOf<String, Int>()
    for (word in listOfStrings) {
        if (!wordCount.containsKey(word)) {
            wordCount.put(word, 1)
        } else {
            wordCount.replace(word, wordCount.getValue(word) + 1)
        }
    }
    val listOfWords = wordCount.toList()
        .sortedBy { (_, value) -> value }
        .map { (key, value) ->
            Words(key, value)
        }
    return listOfWords
}
