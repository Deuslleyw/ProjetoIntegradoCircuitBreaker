package com.deusleyDev.api_publication.maper;

import com.deusleyDev.api_publication.controller.request.PublicationRequest;
import com.deusleyDev.api_publication.domain.Publication;
import com.deusleyDev.api_publication.repository.entity.PublicationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicationMapper {

    PublicationEntity toPublicationEntity(Publication publication);

    Publication toPublication(PublicationEntity publicationEntity);

    Publication toPublicationRequest(PublicationRequest publicationRequest);




}
