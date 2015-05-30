package app.techiedb.com.passivemvc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import app.techiedb.com.passivemvc.R;
import app.techiedb.com.passivemvc.controllers.LoginController;
import app.techiedb.com.passivemvc.controllers.LoginControllerListener;
import app.techiedb.com.passivemvc.views.LoginView;

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
public class LoginActivity extends Activity implements LoginControllerListener {
  public static final String TAG = LoginActivity.class.getSimpleName();
  protected LoginController mLoginController;
  protected LoginView mLoginView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_layout);
    this.mLoginView = (LoginView) findViewById(R.id.login_form);
    mLoginController = new LoginController(mLoginView, this);
    this.mLoginView.setControllerListener(mLoginController);
  }

  @Override
  public void onLoginSuccess() {
      final Intent intent = new Intent(this, WelcomeActivity.class);
      this.startActivity(intent);
  }
}
