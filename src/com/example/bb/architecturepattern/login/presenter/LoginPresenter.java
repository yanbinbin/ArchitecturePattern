/**
 * Project Name:ArchitecturePattern File Name:LoginPresenter.java Package
 * Name:com.example.bb.architecturepattern.login.presenter Date:2016-1-7
 * Copyright (c) 2016, www.meitu.com All Rights Reserved.
 */

package com.example.bb.architecturepattern.login.presenter;

import android.os.Handler;
import android.os.Looper;

import com.example.bb.architecturepattern.login.model.IUser;
import com.example.bb.architecturepattern.login.model.User;
import com.example.bb.architecturepattern.mvp.login.view.ILoginView;

/**
 * ClassName: LoginPresenter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:2016-1-7
 * 
 * @author meitu.yanbb
 * @version 0.1
 * @since MT 1.0
 */
public class LoginPresenter implements ILoginPresenter {
    ILoginView mILoginView;
    IUser mIUser;
    Handler mHandler;

    public LoginPresenter(ILoginView loginView) {
        this.mILoginView = loginView;
        initUser();
        mHandler = new Handler(Looper.getMainLooper());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.example.bb.architecturepattern.login.presenter.ILoginPresenter#clear
     * ()
     */
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        mILoginView.onClearText();

    }

    /*
     * (non-Javadoc)
     * @see
     * com.example.bb.architecturepattern.login.presenter.ILoginPresenter#doLogin
     * (java.lang.String, java.lang.String)
     */
    @Override
    public void doLogin(String name, String password) {
        // TODO Auto-generated method stub
        Boolean isLoginSuccess = true;
        final int code = mIUser.checkUserValidity(name, password);
        if (code != 0)
            isLoginSuccess = false;
        final Boolean result = isLoginSuccess;
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                mILoginView.onLoginResult(result, code);
            }
        }, 3000);

    }

    /*
     * (non-Javadoc)
     * @see com.example.bb.architecturepattern.login.presenter.ILoginPresenter#
     * setProgressBarVisiblity(int)
     */
    @Override
    public void setProgressBarVisiblity(int visiblity) {
        // TODO Auto-generated method stub
        mILoginView.onSetProgressBarVisibility(visiblity);

    }

    private void initUser() {
        mIUser = new User("mvp", "mvp");
    }
}
