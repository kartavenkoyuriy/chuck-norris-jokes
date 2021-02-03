package edu.sfg.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
