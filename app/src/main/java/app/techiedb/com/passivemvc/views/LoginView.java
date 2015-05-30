package app.techiedb.com.passivemvc.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

import app.techiedb.com.passivemvc.R;
import app.techiedb.com.passivemvc.controllers.LoginControllerListener;

/**
 * Copyright (C) 2014 Sugar Ventures Inc. All rights reserved. Mobile UX Promotion Division. This software and its documentation are
 * confidential and proprietary information of Sugar Ventures Inc.  No part of the software and documents may be copied, reproduced,
 * transmitted, translated, or reduced to any electronic medium or machine-readable form without the prior written consent of Sugar Ventures
 * Inc. Sugar Ventures Inc makes no representations with respect to the contents, and assumes no responsibility for any errors that might
 * appear in the software and documents. This publication and the contents hereof are subject to change without notice. History
 *
 * @author Larry Pham
 * @since May.30.2015
 */
public class LoginView extends LinearLayout {

  private EditText mEmailEditText;
  private EditText mPasswordEditText;

  public LoginView(Context context) {
    super(context);
  }

  public LoginView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public LoginView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public void setControllerListener(OnClickListener listener) {
    findViewById(R.id.sign_in_button).setOnClickListener(listener);
  }

  public String getLogin() {
    mEmailEditText = (EditText) this.findViewById(R.id.email_login);
    return mEmailEditText.getText().toString();
  }

  public String getPassword() {
    mPasswordEditText = (EditText) this.findViewById(R.id.password_login);
    return mPasswordEditText.getText().toString();
  }

  public void setPasswordError(String error) {
    mPasswordEditText.setError(error);
  }

  public void setLoginError(String error) {
    mEmailEditText.setError(error);
  }
}
