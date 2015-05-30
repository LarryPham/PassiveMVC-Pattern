package app.techiedb.com.passivemvc.controllers;

import android.util.Log;
import android.view.View;

import app.techiedb.com.passivemvc.ErrorConstants;
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
public class LoginController implements View.OnClickListener {
  public static final String TAG = LoginController.class.getSimpleName();
  private LoginView mLoginView;
  private LoginControllerListener  mListener;

  public LoginController(LoginView loginView, LoginControllerListener listener) {
    this.mLoginView = loginView;
    this.mListener = listener;
  }

  @Override
  public void onClick(View view) {
    Log.i(TAG, "onClick()");
    if (mLoginView.getLogin().isEmpty() || mLoginView.getLogin().equals("")) {
      mLoginView.setLoginError(ErrorConstants.ERROR_FIELD_REQUIRED);
    } else if (!mLoginView.getLogin().contains("@")) {
      mLoginView.setLoginError(ErrorConstants.ERROR_INVALID_EMAIL);
    }

    if (mLoginView.getPassword().isEmpty() || mLoginView.getPassword().equals("")) {
      mLoginView.setPasswordError(ErrorConstants.ERROR_FIELD_REQUIRED);
    } else if (mLoginView.getPassword().length() < 3) {
      mLoginView.setPasswordError(ErrorConstants.ERROR_INVALID_PASSWORD);
    } else {
      mListener.onLoginSuccess();
    }
  }
}
