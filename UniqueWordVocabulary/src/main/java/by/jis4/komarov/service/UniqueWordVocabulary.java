package by.jis4.komarov.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class UniqueWordVocabulary implements UniqueWord{
    Logger log = LoggerFactory.getLogger(UniqueWordVocabulary.class);

    @Override
    public void addWord(Set<String> vocabulary, String word) {

        if (word == null){
            log.info("Недопустимое значение");
        }else{
            vocabulary.add(word);
        }
    }

    @Override
    public int getWordsCount(Set<String> vocabulary) {
        log.info("count = {}", vocabulary.size());
        return vocabulary.size();

    }

    @Override
    public void printVocabulary(Set<String> vocabulary) {
        log.info("Вывод: ");
        for (String word: vocabulary) {
            log.info(" = {}", word);
            
        }

    }
}
