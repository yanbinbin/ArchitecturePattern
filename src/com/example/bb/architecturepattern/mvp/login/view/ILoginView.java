/**
 * Project Name:ArchitecturePattern
 * File Name:ILoginView.java
 * Package Name:com.example.bb.architecturepattern.mvp.login.view
 * Date:2016-1-7
 * Copyright (c) 2016, www.meitu.com All Rights Reserved.
 *
 */

package com.example.bb.architecturepattern.mvp.login.view;

/**
 * ClassName: ILoginView <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:2016-1-7
 *
 * @author meitu.yanbb
 * @version 0.1
 * @since  MT 1.0
 *
 */
public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}
