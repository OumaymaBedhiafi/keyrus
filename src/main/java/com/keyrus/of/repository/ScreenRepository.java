package com.keyrus.of.repository;

import com.keyrus.of.model.Screen;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ScreenRepository implements PanacheMongoRepository<Screen> {


}
