package edu.sfg.chucknorrisjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//comment dependency bean to test xml configuration

//@Configuration
public class JokeConfiguration {

//    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
