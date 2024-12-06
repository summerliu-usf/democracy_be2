package com.example.demo;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "Chapter")
public class Chapter {

  @Id
  private int chapId;
  private String title;
  private String podcastUrl;
  private int bookId;
  private String assistantId;

  public Chapter() {}

  public Chapter(int chapId, String title, String podcastUrl, int bookId, String assistantId) {
    this.chapId = chapId;
    this.title = title;
    this.podcastUrl = podcastUrl;
    this.bookId = bookId;
    this.assistantId = assistantId;
  }

  public int getChapId() {
    return chapId;
  }

  public void setChapId(int chapId) {
    this.chapId = chapId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPodcastUrl() {
    return podcastUrl;
  }

  public void setPodcastUrl(String podcastUrl) {
    this.podcastUrl = podcastUrl;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }
}
