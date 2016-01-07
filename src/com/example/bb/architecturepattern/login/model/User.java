/**
 * Project Name:ArchitecturePattern File Name:User.java Package
 * Name:com.example.bb.architecturepattern.login.model Date:2016-1-7 Copyright
 * (c) 2016, www.meitu.com All Rights Reserved.
 */

package com.example.bb.architecturepattern.login.model;

import android.text.TextUtils;

/**
 * ClassName: User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:2016-1-7
 * 
 * @author meitu.yanbb
 * @version 0.1
 * @since MT 1.0
 */
public class User implements IUser {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /*
     * (non-Javadoc)
     * @see com.example.bb.architecturepattern.login.model.IUser#getName()
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /*
     * (non-Javadoc)
     * @see com.example.bb.architecturepattern.login.model.IUser#getPassword()
     */
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.example.bb.architecturepattern.login.model.IUser#checkUserValidity
     * (java.lang.String, java.lang.String)
     */
    @Override
    public int checkUserValidity(String user, String password) {
        // TODO Auto-generated method stub
        if (TextUtils.equals(user, "mvp") && TextUtils.equals(password, "mvp")) {
            return 0;
        }
        return -1;
    }

}
