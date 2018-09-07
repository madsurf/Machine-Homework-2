package com.bonto.myapplication;

public class Planets {

    private String name;
    private String imageFileName;

    public Planets(String name, String imageFileName) {
        this.name = name;
        this.imageFileName = imageFileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
