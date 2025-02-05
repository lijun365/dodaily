package org.freefly.dodaily.userservice.service;

import org.freefly.dodaily.common.entity.UserCookie;

public interface ICookie {

    public int insertCookie(UserCookie userCookie);

    public UserCookie selectCookie(int id);

    public int deleteCookies(int id);
}
