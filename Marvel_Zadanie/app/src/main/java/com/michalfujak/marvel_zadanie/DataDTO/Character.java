package com.michalfujak.marvel_zadanie.DataDTO;


import java.util.Date;
import java.util.List;

public class Character
{

    // Variables
    public Integer id;
    public String name;
    public String description;
    public Date modified;
    public String resourceURI;
    public List<Url> urls;
    public Image thumbnail;
    public List<ComicList> comics;
    public List<StoryList> stories;
    public List<EventList> events;
    public List<SeriesList> series;
}
