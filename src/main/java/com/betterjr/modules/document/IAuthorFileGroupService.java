package com.betterjr.modules.document;

import java.util.List;
import java.util.Map;

import com.betterjr.modules.document.entity.AuthorFileGroup;

public interface IAuthorFileGroupService {

    public Map<String, AuthorFileGroup> findAllFileGroup();
    
    public List<AuthorFileGroup> findFileGroupList(String anBusinFlag);
    
    public List<AuthorFileGroup> findCustFileGroupList();
}
