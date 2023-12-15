package ru.altana.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Щелкунчик");
        songs.add("Swan Lake");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
