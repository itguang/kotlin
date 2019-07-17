package chapter_4

class LengthCounter {
    var count: Int = 0
        private set
    var name: String = ""

    fun addWord(word: String) {
        count += word.length
    }
}