package com.example.user.myapplication;

public class Artikel{

    private String Tittle;
    private String Category;
    private String Description;
    private String Tgl;
    private int Thumbnail;

    public Artikel(){

    }

    public Artikel(String tittle, String category, String description, String tgl, int thumbnail) {
        Tittle = tittle;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Tgl = tgl;
    }

    public String getTgl() {
        return Tgl;
    }

    public void setTgl(String tgl) {
        Tgl = tgl;
    }


    public String getTittle() {
        return Tittle;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
