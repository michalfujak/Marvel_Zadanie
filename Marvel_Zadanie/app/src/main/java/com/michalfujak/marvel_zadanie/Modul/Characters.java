package com.michalfujak.marvel_zadanie.Modul;

import java.util.List;

public class Characters
{

    // Variables
    public Integer id;
    public String name;
    public String description;
    public String thumbnail;
    public String thumbnailExt;
    public List<String> comics;


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnailExt()
    {
        return thumbnailExt;
    }

    public void setThumbnailExt(String thumbnailExt)
    {
        this.thumbnailExt = thumbnailExt;
    }

    public List<String> getComics()
    {
        return comics;
    }

    public void setComics(List<String> comics)
    {
        this.comics = comics;
    }


}
