package com.example.demo;

import java.util.List;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@SpringBootApplication
public class DemoApplication {
  @Autowired
  ChapterRepository chapterRepository;

  public static void main(String[] args) {
     SpringApplication.run(DemoApplication.class, args);
  }

    @ShellMethod("saves a chapter")
    public Chapter addChapter(int chapId, String title, String podcastUrl, int bookId, String assistantId) {
        Chapter chapter = new Chapter(chapId, title, podcastUrl, bookId, assistantId);
        return chapterRepository.save(chapter);
    }


    @ShellMethod("Loads all chapters")
  public String findAllChapters() {
     Iterable<Chapter> chapters = this.chapterRepository.findAll();
     return Lists.newArrayList(chapters).toString();
  }


  @ShellMethod("Removes all books")
  public void removeAllBooks() {
     this.chapterRepository.deleteAll();
  }
}
