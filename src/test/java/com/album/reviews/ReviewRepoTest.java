package com.album.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepoTest {

    @Test
    public void shouldFindOneReview(){
        Review oneReview = new Review(1L, "Album Name", "Artist Name", "Album Review","albumReview");
        ReviewRepository underTest = new ReviewRepository(oneReview);
        Review foundReview = underTest.findOne(1L);
        assertEquals(oneReview, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        Review oneReview = new Review(1L, "Album Name", "Artist Name", "Album Review","albumReview");
        Review twoReview = new Review(2L, "Album Name", "Artist Name", "Album Review","albumReview");
        ReviewRepository underTest = new ReviewRepository(oneReview, twoReview);
        Collection<Review> foundReview = underTest.findAll();
        assertThat(foundReview).contains(oneReview, twoReview);

    }
}
