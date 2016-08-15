package com.betterjr.modules.operator;

import java.util.Map;

/***
 * 操作员管理
 * @author hubl
 *
 */

public interface IOperatorService {

    /****
     * 新增操作员
     * @param anMap
     * @return
     */
    public String webAddCustOperator(Map<String, Object> anMap);
    
    
    /****
     * 编辑操作员
     * @param anMap
     * @return
     */
    public String webUpdateCustOperator(Map<String, Object> anMap);
    
    /****
     * 操作员分页查询
     * @param anMap
     * @param pageNum
     * @param pageSize
     * @return
     */
    public String webQueryCustOperator(Map<String,String> anMap,int pageNum,int pageSize);
    
    /****
     * 获取菜单信息
     * @param menuId
     * @return
     */
    public String webFindSysMenuByMenuId(Integer anMenuId,String anRoleName);
    
    /****
     * 获取所有菜单信息
     * @return
     */
    public String webFindAllSysMenu();
    
    /****
     * 添加菜单角色信息
     * @param anRoleId 角色ID
     * @param anRoleName 角色名称
     * @param anMenuIdArr 菜单列表，前端传来 "，"分隔
     * @return
     */
    public String webAddMenuRole(String anRoleId,String anRoleName,String anMenuIdArr);
}
