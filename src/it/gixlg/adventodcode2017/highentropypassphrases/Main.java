package it.gixlg.adventodcode2017.highentropypassphrases;

import it.gixlg.adventodcode2017.highentropypassphrases.checkervaliditystrategy.NormalCheckerStrategy;
import it.gixlg.adventodcode2017.highentropypassphrases.checkervaliditystrategy.StrongCheckerStrategy;

public class Main {

    public static void main(String[] args) {
        PasspharesesChecker passpharesesChecker = new PasspharesesChecker();
        //passpharesesChecker.setCheckerValidityStrategy(new NormalCheckerStrategy());  //PART 1
        passpharesesChecker.setCheckerValidityStrategy(new StrongCheckerStrategy());  //PART 2

        int numValidPassphrases = passpharesesChecker.countValidPassphrasesFormInputFile("puzzle_input.txt");
        System.out.println("The output is "+numValidPassphrases);
    }
}
