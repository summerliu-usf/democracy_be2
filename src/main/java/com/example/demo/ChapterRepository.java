package com.example.demo;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface ChapterRepository extends DatastoreRepository<Chapter, Integer> {

    String findAssistantIdByBookId(int bookId);

    String findPodcastUrlByChapId(int chapId);

}
