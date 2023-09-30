package com.entity.management.Service.impl;

import com.entity.management.Service.TargetService;
import com.entity.management.exception.ResourceNotFoundException;
import com.entity.management.model.Target;
import com.entity.management.repository.TargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {

    @Autowired
    private TargetRepository targetRepository;

    @Override
    public Target createTargetEntity(Target target) {
        return targetRepository.save(target);
    }

    @Override
    public Target updateTargetEntity(String id, Target updatedTargetEntity) {
        Target existingTarget = targetRepository.findById(id).orElse(null);

        if (existingTarget != null) {
            existingTarget.setTargetEntity(updatedTargetEntity.getTargetEntity());
            existingTarget.setTargetServiceId(updatedTargetEntity.getTargetServiceId());
            existingTarget.setTargetGuid(updatedTargetEntity.getTargetGuid());
            existingTarget.setRefreshToken(updatedTargetEntity.getRefreshToken());
            return targetRepository.save(existingTarget);
        }

        throw new ResourceNotFoundException("Target entity not found of id " + id);
    }


}
