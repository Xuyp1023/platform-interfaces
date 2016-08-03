package com.betterjr.modules.document;

import java.util.List;

import com.betterjr.modules.document.entity.AgencyAuthorFileGroup;

public interface IAgencyAuthFileGroupService {

    /**
     * 根据合作伙伴编码和业务类型，获得授权使用的业务文件类型
     * @param anAgencyNo 合作伙伴编码
     * @param anBusinFlag 业务文件类型
     * @return
     */
    public List<AgencyAuthorFileGroup> findAuthorFileGroup(String anAgencyNo, String anBusinFlag);
    
    public List<AgencyAuthorFileGroup> findAuthorFileGroup(String[] anAgencyNoList, String anBusinFlag);
    
    /**
     * 根据合作伙伴编码和业务类型，获得授权使用的业务文件类型，组合为直接使用的数据
     * @param anAgencyNo 合作伙伴编码
     * @param anBusinFlag 业务文件类型
     * @return
     */
    public List<String> composeList(String anAgencyNo, String anBusinFlag);
}
