package com.quest.day20_interview_question;

import java.util.Scanner;

public class StreamingPlatformPlaylistManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlaylistMethodsImpl playlistMethods= new PlaylistMethodsImpl();
        UserMethodsImpl userMethods=new UserMethodsImpl();
        User user=null;


        while (true) {
            System.out.println("\n--- Playlist Manager ---");
            System.out.println("1. Create User");
            System.out.println("2. Create Playlist");
            System.out.println("3. Add Track to Playlist");
            System.out.println("4. Remove Track from Playlist");
            System.out.println("5. Display Tracks in Playlist");
            System.out.println("6. Compare Two Tracks");
            System.out.println("7. Sort Tracks in Playlist");
            System.out.println("8. Shuffle Playlist");
            System.out.println("9. Merge Playlists");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        user = new User(username);
                        System.out.println("User created successfully!");
                    }
                    case 2 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.print("Enter playlist name: ");
                        String playlistName = scanner.nextLine();
                        userMethods.createNewPlaylist(playlistName);
                        System.out.println("Playlist created successfully!");
                    }
                    case 3 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.print("Enter track ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter track title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter track artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter track duration: ");
                        double duration = Double.parseDouble(scanner.nextLine());
                        Track track = new Track(id, title, artist, duration);
                        playlistMethods.addTrack(track);
                        System.out.println("Track added successfully!");
                    }
                    case 4 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.print("Enter track ID to remove: ");
                        int trackId = scanner.nextInt();
                        playlistMethods.removeTrack(trackId);
                        System.out.println("Track removed successfully!");
                    }
                    case 5 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.println("Tracks in Playlist:");
                        playlistMethods.displayTracks();
                    }
                    case 6 -> {
                        System.out.print("Enter first track ID: ");
                        int id1 = scanner.nextInt();
                        System.out.print("Enter second track ID: ");
                        int id2 = scanner.nextInt();
                        Track track1 = new Track(id1, "", "", 0);
                        Track track2 = new Track(id2, "", "", 0);
                        if (track1.equals(track2)) {
                            System.out.println("Tracks are equal.");
                        } else {
                            System.out.println("Tracks are not equal.");
                        }
                        System.out.println("The duplicate Tracks in Playlists are:");
                        playlistMethods.findDuplicates();
                    }
                    case 7 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.println("Sort by Title");
                        System.out.print("Enter your choice: ");
                        int sortChoice = Integer.parseInt(scanner.nextLine());
                        playlistMethods.sortTracks();
                        System.out.println("Tracks sorted successfully!");
                        playlistMethods.displayTracks();
                    }
                    case 8 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        playlistMethods.shuffleTracks();
                        System.out.println("Playlist shuffled!");
                        playlistMethods.displayTracks();
                    }
                    case 9 -> {
                        if (validUserCheck(scanner, userMethods, user)) continue;
                        System.out.print("Enter first playlist name: ");
                        String playlist1 = scanner.nextLine();
                        System.out.print("Enter second playlist name: ");
                        String playlist2 = scanner.nextLine();
                        System.out.print("Enter new playlist name: ");
                        String newPlaylistName = scanner.nextLine();
                        userMethods.mergePlaylist(playlist1, playlist2, newPlaylistName);
                        System.out.println("Playlists merged successfully!");
                    }
                    case 10 -> {
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static boolean validUserCheck(Scanner scanner, UserMethodsImpl userMethods, User user) {
        if (user == null) {
            System.out.println("Create a user first!");
            return true;
        }
        System.out.print("Enter playlist name: ");
        String playlistName = scanner.nextLine();
        Playlist playlist = userMethods.getPlaylist(playlistName);
        if (playlist == null) {
            System.out.println("Playlist not found!");
            return true;
        }
        return false;
    }
}

