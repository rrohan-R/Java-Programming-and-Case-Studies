package com.quest.day20_interview_question;

import java.util.*;

public class PlaylistMethodsImpl implements PlaylistMethods {
    Track track;
    Playlist playlist;

    @Override
    public void addTrack(Track track) throws DuplicateTrackException {
        if (playlist.getTracks().contains(track)) {
            throw new DuplicateTrackException("Track with ID " + track.getId() + " already exists in the playlist.");
        }
        playlist.getTracks().add(track);
        System.out.println("Added track " + track.getId() + " to playlist.");
    }

    @Override
    public void removeTrack(int id) {
        if (track.getId() == id) {
            playlist.getTracks().remove(track);
            System.out.println("Removed track " + track.getId() + " from playlist.");
        }
        else {
            System.out.println("Track with ID " + track.getId() + " does not exist in the playlist.");
        }

    }

    @Override
    public List<Track> findDuplicates() {
        Set<Track> uniqueTracks = new HashSet<>();
        List<Track> duplicates = new ArrayList<>();

        for (Track tracks : playlist.getTracks()) {
            if (!uniqueTracks.add(tracks)) {
                duplicates.add(tracks);
            }
        }
        System.out.println("The duplicate tracks are :\n");
        return duplicates;
    }

    @Override
    public List<Track> searchTrack( String songName) {
        List<Track> results = new ArrayList<>();
        String song = songName.toLowerCase();

        for (Track tracks : playlist.getTracks()) {
            if (tracks.getTitle().toLowerCase().contains(song)) {
                results.add(tracks);
            }
        }
        return results;

    }

    @Override
    public void displayTracks() {
        for (Track tracks : playlist.getTracks()) {
            System.out.println("The tracks are :\n" + tracks.getTitle() + " : " + tracks.getArtist());
        }
    }

    @Override
    public void sortTracks() {
        playlist.getTracks().sort(Comparator.comparing(Track::getTitle));
    }

    @Override
    public void shuffleTracks() {
        Collections.shuffle(playlist.getTracks());
    }
}
