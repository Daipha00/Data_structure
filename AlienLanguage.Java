// In an Alien language suprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
// Given a sequence of words written in the Alien language, and the order of the alphabet, find the original sequence of words.
// For example, given the sequence of words "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" and the order of the alphabet "abcdefghijklmnopqrstuvwxyz", the original sequence of words is "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z".
// Note that the order of the alphabet is not the same as the order of the words in the original sequence.

class AlienLanguage {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(originalSequence(words, order));
    }

    static String originalSequence(String[] words, String order) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}