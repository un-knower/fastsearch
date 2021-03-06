package com.berg.fastsearch.core.account.service;

import com.berg.fastsearch.core.account.entity.UserRole;
import com.berg.fastsearch.core.account.web.dto.RoleQueryCondition;
import com.berg.fastsearch.core.account.web.dto.UserRoleDto;
import com.berg.fastsearch.core.account.web.dto.UserRoleQueryCondition;
import com.berg.fastsearch.core.system.base.service.IBaseService;

import java.util.List;

/**
 * <p>用户角色服务接口</p>
 *
 * @author bo.he02@hand-china.com
 * @version v1.0
 * @apiNote Created on 18-3-18
 */
public interface IUserRoleService extends IBaseService<Long, UserRoleDto, UserRoleQueryCondition> {

    /**
     * 根据用户的主键来查找用户的角色
     * @param userId    用户的主键
     * @return          用户的角色
     */
    List<UserRoleDto> findByUserId(Long userId);
}
