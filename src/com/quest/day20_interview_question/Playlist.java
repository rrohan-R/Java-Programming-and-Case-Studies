package com.quest.day20_interview_question;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playlistName;
    private List<Track> tracks=new ArrayList<>();
    public Playlist(String playlistName) {
        this.playlistName=playlistName;

    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "playlistName=" + playlistName + ", tracks=" + tracks;
    }
}
