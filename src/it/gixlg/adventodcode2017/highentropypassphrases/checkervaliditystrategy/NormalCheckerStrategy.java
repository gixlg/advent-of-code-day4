package it.gixlg.adventodcode2017.highentropypassphrases.checkervaliditystrategy;

import java.util.*;

public class NormalCheckerStrategy implements CheckerValidityStrategy {

    @Override
    public boolean isValid(String line) {
        String[] words = line.split(" ");
        Set<String> setOfWord = new HashSet<String>();
        for (String word : words) {
            if (!setOfWord.contains(word)) {
                setOfWord.add(word);
            } else {
                return false;
            }

        }
        return true;
    }
}
