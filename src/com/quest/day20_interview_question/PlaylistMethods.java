package com.quest.day20_interview_question;

import java.util.List;

public interface PlaylistMethods {

    /*Method to add a track to the playlist (throw DuplicateTrackException if the track already exists).
    Method to remove a track from the playlist.
    Method to find duplicates in the playlist.
    Method to search for a track by title or artist (case-insensitive).
    Method to display all tracks in the playlist.
    Method to sort tracks by duration or title using a Comparator.
    Method to shuffle tracks randomly.*/

    void addTrack( Track track);
    void removeTrack(int id);
    List<Track> findDuplicates();
    List<Track> searchTrack( String songName);
    void displayTracks();
    void sortTracks();
    void shuffleTracks();

}
