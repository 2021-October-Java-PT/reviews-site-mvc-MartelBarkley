package com.album.reviews;

public class Review {

    private Long id;
    private String albumTitle;
    private String artistName;
    private String imageUrl;
    private String albumReview;


    public Review(Long id, String albumTitle, String artistName, String imageUrl, String albumReview) {
        this.id=id;
        this.albumTitle=albumTitle;
        this.artistName=artistName;
        this.imageUrl=imageUrl;
        this.albumReview=albumReview;
    }

    public Long getId() {
        return id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
    public String getArtistName(){
        return artistName;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getAlbumReview(){
        return albumReview;
    }

}
