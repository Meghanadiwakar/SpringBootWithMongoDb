package com.stackroute.repository;

import com.stackroute.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
//    @Query("Select a from Track a where a.trackName = ?1")
    public List<Track> findByTrackName(String trackName);
}
