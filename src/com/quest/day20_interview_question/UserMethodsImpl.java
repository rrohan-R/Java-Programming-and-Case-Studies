package com.quest.day20_interview_question;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UserMethodsImpl implements UserMethods {
    User user;
    @Override
    public void createNewPlaylist( String name) {
        user.getPlaylists().put(name,new Playlist(name));
        System.out.println("Playlist created successfully");
    }

    @Override
    public void deletePlaylist( String name) {
        user.getPlaylists().remove(name);
        System.out.println("Playlist deleted successfully");
    }

    @Override
    public Playlist getPlaylist(  String name) {
        return user.getPlaylists().get(name);
    }

    @Override
    public void displayPlaylist( Playlist playlist) {
        for (Map.Entry<String, Playlist> entry : user.getPlaylists().entrySet()) {
            System.out.println("Playlists of "+entry.getKey() + " are :\n " + entry.getValue().getPlaylistName());
        }
    }

    @Override
    public Playlist mergePlaylist(String playlist1, String playlist2, String mergedPlaylist){
        Playlist p1 = user.getPlaylists().get(playlist1);
        Playlist p2 = user.getPlaylists().get(playlist2);

        if (p1 == null || p2 == null) {
            System.out.println("Both or one of the Playlist doesn't exist");
        }

        Playlist newPlaylist = new Playlist(mergedPlaylist);
        Set<Track> mergedTracks = new HashSet<>(p1.getTracks());
        mergedTracks.addAll(p2.getTracks());

        for (Track tracks : mergedTracks) {
            try {
                newPlaylist.getTracks().add(tracks);
            } catch (DuplicateTrackException ignored) {
            }
        }

        user.getPlaylists().put(mergedPlaylist, newPlaylist);
        return newPlaylist;
    }
}
