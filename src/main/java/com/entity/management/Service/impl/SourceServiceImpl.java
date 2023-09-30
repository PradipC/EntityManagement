package com.entity.management.Service.impl;

import com.entity.management.Service.SourceService;
import com.entity.management.exception.ResourceNotFoundException;
import com.entity.management.model.Source;
import com.entity.management.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceServiceImpl implements SourceService {

    @Autowired
    private SourceRepository sourceRepository;

    @Override
    public Source createSourceEntity(Source source) {
        return sourceRepository.save(source);
    }

    @Override
    public Source updateSourceEntity(String id, Source updatedSourceEntity) {
        Source existingSource = sourceRepository.findById(id).orElse(null);

        if (existingSource != null) {
            existingSource.setSourceEntity(updatedSourceEntity.getSourceEntity());
            existingSource.setSourceServiceId(updatedSourceEntity.getSourceServiceId());
            existingSource.setSourceGuid(updatedSourceEntity.getSourceGuid());
            existingSource.setRefreshToken(updatedSourceEntity.getRefreshToken());
            return sourceRepository.save(existingSource);
        }

        throw new ResourceNotFoundException("Source entity not found of id " + id);
    }
}
