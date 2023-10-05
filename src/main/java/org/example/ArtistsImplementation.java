package org.example;


import java.util.ArrayList;
import java.util.List;

public class ArtistsImplementation implements Artists{

        // private List<Artist> artists = new ArrayList<>();

        // private OwnList artists = new OwnList();

        // private Artist artist = new Artist();
        private Artist[] artists = new Artist[4]; // remember the references

        private int count;

        public void add(Artist artist) {
            artists[count++] = artist;
        }

        public Artist get(int index) {
            return artists[index];
        }

    @Override
    public List<Artist> search(String lastname) {
        List<Artist> listofArtists = new ArrayList<>();

        for (int i=0; i<count; i++ ){
            Artist artist = artists[i];
            boolean matches = artist.getName().equals(lastname);
           if (matches){
               listofArtists.add(artist);
           }
        }
        return listofArtists;
    }

    // search
    }

