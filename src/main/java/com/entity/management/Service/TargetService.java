package com.entity.management.Service;

import com.entity.management.model.Target;

public interface TargetService {


    Target createTargetEntity(Target target);


    Target updateTargetEntity(String id, Target updatedTargetEntity);


}
