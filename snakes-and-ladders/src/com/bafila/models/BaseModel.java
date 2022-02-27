package com.bafila.models;

import java.util.Date;

//this provides date which is present at db layer
//this class is a base and is extended by all other model classes
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;
}
