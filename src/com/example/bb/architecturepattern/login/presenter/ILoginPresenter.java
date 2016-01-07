/**
 * Project Name:ArchitecturePattern
 * File Name:ILoginPresenter.java
 * Package Name:com.example.bb.architecturepattern.login.presenter
 * Date:2016-1-7
 * Copyright (c) 2016, www.meitu.com All Rights Reserved.
 *
 */

package com.example.bb.architecturepattern.login.presenter;

/**
 * ClassName: ILoginPresenter <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:2016-1-7
 *
 * @author meitu.yanbb
 * @version 0.1
 * @since  MT 1.0
 *
 */
public interface ILoginPresenter {

    public void clear();
    public void doLogin(String name, String password);
    public void setProgressBarVisiblity(int visiblity);
}
