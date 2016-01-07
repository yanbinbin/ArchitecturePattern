/**
 * Project Name:ArchitecturePattern File Name:MVPPattern.java Package
 * Name:com.example.bb.architecturepattern.mvp Date:2016-1-7 Copyright (c) 2016,
 * www.meitu.com All Rights Reserved.
 */

package com.example.bb.architecturepattern.mvp.login.view;

import com.example.bb.architecturepattern.R;
import com.example.bb.architecturepattern.login.presenter.ILoginPresenter;
import com.example.bb.architecturepattern.login.presenter.LoginPresenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * ClassName: MVPPattern <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:2016-1-7
 * 
 * @author meitu.yanbb
 * @version 0.1
 * @since MT 1.0
 */
public class LoginActivity extends Activity implements ILoginView,
        OnClickListener {

    private EditText editUser;
    private EditText editPass;
    private Button btnLogin;
    private Button btnClear;
    ILoginPresenter mILoginPresenter;
    private ProgressBar progressBar;

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mvp);
        // find view
        editUser = (EditText)this.findViewById(R.id.user);
        editPass = (EditText)this.findViewById(R.id.password);
        btnLogin = (Button)this.findViewById(R.id.login);
        btnClear = (Button)this.findViewById(R.id.clear);
        progressBar = (ProgressBar)this.findViewById(R.id.progress);

        // set listener
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        mILoginPresenter = new LoginPresenter(this);
        mILoginPresenter.setProgressBarVisiblity(View.GONE);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.example.bb.architecturepattern.mvp.login.view.ILoginView#onClearText
     * ()
     */
    @Override
    public void onClearText() {
        // TODO Auto-generated method stub
        editUser.setText("");
        editPass.setText("");

    }

    /*
     * (non-Javadoc)
     * @see
     * com.example.bb.architecturepattern.mvp.login.view.ILoginView#onLoginResult
     * (java.lang.Boolean, int)
     */
    @Override
    public void onLoginResult(Boolean result, int code) {
        // TODO Auto-generated method stub
        mILoginPresenter.setProgressBarVisiblity(View.INVISIBLE);
        btnLogin.setEnabled(true);
        btnClear.setEnabled(true);
        if (result)
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Login Fail, code = " + code,
                    Toast.LENGTH_SHORT).show();

    }

    /*
     * (non-Javadoc)
     * @see com.example.bb.architecturepattern.mvp.login.view.ILoginView#
     * onSetProgressBarVisibility(int)
     */
    @Override
    public void onSetProgressBarVisibility(int visibility) {
        // TODO Auto-generated method stub
        progressBar.setVisibility(visibility);

    }

    /*
     * (non-Javadoc)
     * @see android.view.View.OnClickListener#onClick(android.view.View)
     */
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
        case R.id.clear:
            mILoginPresenter.clear();

            break;
        case R.id.login:
            mILoginPresenter.setProgressBarVisiblity(View.VISIBLE);
            btnLogin.setEnabled(false);
            btnClear.setEnabled(false);
            mILoginPresenter.doLogin(editUser.getText().toString(), editPass
                    .getText().toString());

            break;

        default:
            break;
        }
    }
}
