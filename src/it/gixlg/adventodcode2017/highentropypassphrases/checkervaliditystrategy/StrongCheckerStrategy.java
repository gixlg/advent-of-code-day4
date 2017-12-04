package it.gixlg.adventodcode2017.highentropypassphrases.checkervaliditystrategy;

import java.util.*;

public class StrongCheckerStrategy implements CheckerValidityStrategy {

    @Override
    public boolean isValid(String passphrases) {

        System.out.println(passphrases);
        String[] words = passphrases.split(" ");
        Set<HashMap<String, Integer>> set = new HashSet<HashMap<String, Integer>>();
        for (String word : words) {

            HashMap<String, Integer> characterMap = generateCharactersMap(word);
            //printMap(characterMap);

            if (!set.contains(characterMap)) {
                set.add(characterMap);
            } else {
                return false;
            }
        }
        return true;
    }

    private HashMap<String, Integer> generateCharactersMap(String word){
        HashMap<String, Integer> characterMap = new HashMap<String, Integer>();
        for (String character : word.split("")) {
            Integer count = 1;
            if (characterMap.containsKey(character)) {
                count = characterMap.get(character) + 1;
            }
            characterMap.put(character, count);
        }
        return  characterMap;

    }

    private void printMap(HashMap<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        System.out.println(sb.toString());
        System.out.println();

    }
}
