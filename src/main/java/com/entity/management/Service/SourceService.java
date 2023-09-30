package com.entity.management.Service;

import com.entity.management.model.Source;

public interface SourceService {


    Source createSourceEntity(Source source);


    Source updateSourceEntity(String id, Source updatedSourceEntity);
}
