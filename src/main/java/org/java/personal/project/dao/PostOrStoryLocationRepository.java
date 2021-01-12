package org.java.personal.project.dao;

import org.java.personal.project.domain.PostOrStoryLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostOrStoryLocationRepository extends MongoRepository<PostOrStoryLocation, String> {
}
