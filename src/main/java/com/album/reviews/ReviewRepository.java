package com.album.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review music1 = new Review(1L,"To Pimp A ButterFly","Kendrick Lamar","images/Kendrick.jpg","This album sets lamar apart from the pack. He's officially a leader of the New School. 10/10");
        Review music2 = new Review(2L,"Songs In The Key Of Life","Stevie Wonder","images/songsstevie.jpg","During Stevie's legendary run from 1972-1980, he released one of the greatest r&b, pop, and funk classics entitled Songs in the Key of Life. This two disc capsule provided the soundtrack to 70's. It show us how to love, how to be proud and how to be BLACK. 10/10 ");
        Review music3 = new Review(3L,"Thriller","Michael Jackson","images/Mike.png","This is considered Jackson's Magnum Opus. With the help of Legendary producer Quincy Jones and Songwriting partners like Paul McCartney and Rob Temperton this post disco masterpiece still sits as the highest selling record of all time. 10/10.");
        Review music4 = new Review(4L,"Igor","Tyler The Creator","images/Tyler.jpg","Tyler Baudelaire we call him! Sonics from the gates of heaven. This bold statement sets tyler apart from the pack. He no longer the student, he's become the teacher. 10/10");
        Review music5 = new Review(5L,"Future Sex Love Sounds","Justin Timberlake","images/Justin.png","Welcome to the future! Timberlake's sophomore juggernaut wowed us all. With production from super producers Timbaland and Danja, they and Timberlake gave us r&b/pop 2025. 10/10");

        reviewList.put(music1.getId(), music1);
        reviewList.put(music2.getId(), music2);
        reviewList.put(music3.getId(), music3);
        reviewList.put(music4.getId(), music4);
        reviewList.put(music5.getId(), music5);
    }

    public ReviewRepository(Review ...reviewToAdd) {
        for (Review review: reviewToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(Long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
