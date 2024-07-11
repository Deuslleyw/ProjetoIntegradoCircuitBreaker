package com.deusleyDev.api_publication.repository;

import com.deusleyDev.api_publication.repository.entity.PublicationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends MongoRepository<PublicationEntity, String> {
}
