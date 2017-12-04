package it.gixlg.adventodcode2017.highentropypassphrases;

import it.gixlg.adventodcode2017.highentropypassphrases.checkervaliditystrategy.CheckerValidityStrategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasspharesesChecker {

    private CheckerValidityStrategy checkerValidityStrategy;

    public CheckerValidityStrategy getCheckerValidityStrategy() {
        return checkerValidityStrategy;
    }

    public void setCheckerValidityStrategy(CheckerValidityStrategy checkerValidityStrategy) {
        this.checkerValidityStrategy = checkerValidityStrategy;
    }

    public int countValidPassphrasesFormInputFile(String pathToInputFile){
        try (BufferedReader br = new BufferedReader(new FileReader(pathToInputFile))) {

            String sCurrentLine;
            int validPassphrases=0;

            while ((sCurrentLine = br.readLine()) != null) {
                if (checkerValidityStrategy.isValid(sCurrentLine)){
                    validPassphrases++;
                    System.out.println(sCurrentLine + "is valid");
                }else{
                    System.out.println(sCurrentLine + "is NOT valid");
                }

            }
            return validPassphrases;

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

    }

}
