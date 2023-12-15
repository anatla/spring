package ru.altana.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Smells Like Teen Spirit");
        songs.add("We Will Rock You");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
