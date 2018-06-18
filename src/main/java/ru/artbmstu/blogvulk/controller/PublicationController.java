package ru.artbmstu.blogvulk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.artbmstu.blogvulk.PublicationEntity.BlogEntity;
import ru.artbmstu.blogvulk.service.IBlogService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping()
public class PublicationController {
    private IBlogService blogService;

    @Autowired
    PublicationController (IBlogService blogService){
        this.blogService = blogService;
    }

    @GetMapping("/publications")
    public ResponseEntity<List<BlogEntity>> getAllPublications() {
        List<BlogEntity> list = blogService.getAllPublications();
        return new ResponseEntity<List<BlogEntity>>(list, HttpStatus.OK);
    }

    @PostMapping("/publication")
    public ResponseEntity<List<BlogEntity>> addArticle(@RequestBody BlogEntity publication) {
        blogService.addPublication(publication);
        List<BlogEntity> list = blogService.getAllPublications();
//        setDate(publication);
        return new ResponseEntity<List<BlogEntity>>(list, HttpStatus.OK);
    }

    private void setDate(BlogEntity publication){
        DateFormat dateFormat = new SimpleDateFormat(("yyyy-MM-dd HH:mm a z"));
    }
}
