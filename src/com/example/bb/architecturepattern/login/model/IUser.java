/**
 * Project Name:ArchitecturePattern File Name:IUser.java Package
 * Name:com.example.bb.architecturepattern.login.model Date:2016-1-7 Copyright
 * (c) 2016, www.meitu.com All Rights Reserved.
 */

package com.example.bb.architecturepattern.login.model;

/**
 * ClassName: IUser <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:2016-1-7
 * 
 * @author meitu.yanbb
 * @version 0.1
 * @since MT 1.0
 */
public interface IUser {

    String getName();

    String getPassword();

    int checkUserValidity(String user, String password);
}
