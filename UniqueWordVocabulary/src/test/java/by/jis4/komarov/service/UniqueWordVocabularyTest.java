package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {
    UniqueWordVocabulary uniqueWordVocabulary;

    @Before
    public void setUp() {
        uniqueWordVocabulary = new UniqueWordVocabulary();
    }

    @Test
    public void addWord() {
         Set<String> vocabulary = new HashSet<>();
        uniqueWordVocabulary.addWord(vocabulary, "book");
        uniqueWordVocabulary.addWord(vocabulary, "look");
        uniqueWordVocabulary.addWord(vocabulary, "cook");
        uniqueWordVocabulary.addWord(vocabulary, "car");
        uniqueWordVocabulary.addWord(vocabulary, "house");

    }

    @Test
    public void addWordNull() {
        Set<String> vocabulary = new HashSet<>();
        uniqueWordVocabulary.addWord(vocabulary, null);


    }

    @Test
    public void getWordsCount() {
        Set<String> vocabulary = new HashSet<>();
        uniqueWordVocabulary.addWord(vocabulary, "book");
        uniqueWordVocabulary.addWord(vocabulary, "look");
        uniqueWordVocabulary.addWord(vocabulary, "cook");
        uniqueWordVocabulary.addWord(vocabulary, "car");
        uniqueWordVocabulary.addWord(vocabulary, "house");
        uniqueWordVocabulary.getWordsCount(vocabulary);
    }

    @Test
    public void printVocabulary() {
        Set<String> vocabulary = new HashSet<>();
        uniqueWordVocabulary.addWord(vocabulary, "book");
        uniqueWordVocabulary.addWord(vocabulary, "look");
        uniqueWordVocabulary.addWord(vocabulary, "cook");
        uniqueWordVocabulary.addWord(vocabulary, "car");
        uniqueWordVocabulary.addWord(vocabulary, "house");
        uniqueWordVocabulary.printVocabulary(vocabulary);

    }
}