package hw4;

public class Question3 {
    public static void main(String[] args) {
        String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        char[] vowels = {'a','e','i','o','u'};
        for(int i= 0;i<vowels.length;i++) {
        	countVowels(planets,vowels[i]);
        }
    }

    public static void countVowels(String[] input, char vowel) {
        int count = 0;
        for (int i=0;i<input.length;i++) {
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == vowel) {
                    count++;
                }
            }
        }
        System.out.println(vowel + " 共有: " + count + " 個");
    }
}
