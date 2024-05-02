package se.lexicon;

public class Main {
    public static void main(String[] args) {
        String notNull = "null";
        if (notNull == null) throw new IllegalArgumentException("GM: Condition 'notNull == null' is always 'true' ");

    }
}