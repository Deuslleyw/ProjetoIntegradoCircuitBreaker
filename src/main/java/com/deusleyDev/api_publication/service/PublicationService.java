package com.deusleyDev.api_publication.service;

import com.deusleyDev.api_publication.domain.Publication;
import com.deusleyDev.api_publication.maper.PublicationMapper;
import com.deusleyDev.api_publication.repository.PublicationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PublicationService {

    @Autowired
    private PublicationRepository rep;

    @Autowired
    private PublicationMapper publicationMapper;

    @Autowired
    private CommentService commentService;


    public void insert(Publication publication) {

        var publicationEntity = publicationMapper.toPublicationEntity(publication);
        rep.save(publicationEntity);
    }

    public List<Publication> findAll() {
        var publications = rep.findAll();
        return publications.stream().map(publicationMapper::toPublication).toList();
    }
    public Publication findById(String id){
        var publication = rep.findById(id).map(publicationMapper::toPublication).orElseThrow(RuntimeException::new);

        var comments = commentService.getComments(id);
        publication.setComments(comments);

        return publication;

    }

}

///DeusleyDiego