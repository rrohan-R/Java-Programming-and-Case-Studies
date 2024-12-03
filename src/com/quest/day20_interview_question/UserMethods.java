package com.quest.day20_interview_question;

public interface UserMethods {

    /*Constructor to initialize the username.
    Method to create a new playlist.
    Method to delete an existing playlist.
    Method to get a playlist by name.
    Method to display all playlists and their details.*/

    void createNewPlaylist( String name);
    void deletePlaylist( String name);
    Playlist getPlaylist( String name);
    void displayPlaylist( Playlist playlist);
    Playlist mergePlaylist( String name1, String name2,String name3);
}
