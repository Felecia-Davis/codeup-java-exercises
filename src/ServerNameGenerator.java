public class ServerNameGenerator {
    public static void main(String [] args) {
        String[] nouns = {"cat", "dog", "bison","bat", "umbrella","ball", "beach", "book","cake"," meat"};
        String[] adjectives = {"pretty", "nice", "lovely", "friendly", "excellent","lively","kind","gentle","sparkling" };
    System.out.println("Here is your server name:");
    System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
    public static String randomElement(String[] word){
        return word[(int)(Math.random()*(word.length-1))];
    }
}
