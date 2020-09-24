package by.jis4.komarov.service;

import java.util.Set;

public interface UniqueWord {

    void addWord(Set<String> vocabulary, String word);

    int getWordsCount(Set<String> vocabulary);

    void printVocabulary(Set<String> vocabulary);

}
