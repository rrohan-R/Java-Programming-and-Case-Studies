package com.quest.day20_interview_question;

import java.util.HashMap;
import java.util.Map;

public class User {
//    username : Unique username for the user.
//    playlists : A map of playlist names to Playlist objects.
    private String userName;
    private Map<String,Playlist> playlists;
    public User(String userName) {
        this.userName = userName;
        this.playlists = new HashMap<String,Playlist>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", playlists=" + playlists + "]";
    }
}
