package com.deusleyDev.api_publication.service;

import com.deusleyDev.api_publication.domain.Publication;
import com.deusleyDev.api_publication.maper.PublicationMapper;
import com.deusleyDev.api_publication.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository rep;

    @Autowired
    private PublicationMapper publicationMapper;


    public void insert(Publication publication) {

        var publicationEntity = publicationMapper.toPublicationEntity(publication);
        rep.save(publicationEntity);
    }

    public List<Publication> findAll() {
        var publications = rep.findAll();
        return publications.stream().map(publicationMapper::toPublication).toList();

    }
    public Publication findById(String id){
        return rep.findById(id).map(publicationMapper::toPublication).orElseThrow(RuntimeException::new);

    }


}
