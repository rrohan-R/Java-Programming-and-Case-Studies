package com.quest.day20_interview_question;

public class Track {
    private int id;
    private String title;
    private String artist;
    private double durationInMinutes;
    public Track(int id, String title, String artist, double durationInMinutes) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.durationInMinutes = durationInMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", title=" + title + ", artist=" + artist + ", duration=" + durationInMinutes +"]";
    }

    @Override
    public boolean equals(Object obj) {
        return id==((Track)obj).id;
    }
}
