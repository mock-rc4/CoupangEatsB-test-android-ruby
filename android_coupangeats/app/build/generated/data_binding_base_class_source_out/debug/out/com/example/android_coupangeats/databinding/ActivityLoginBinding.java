// Generated by view binder compiler. Do not edit!
package com.example.android_coupangeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android_coupangeats.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final AppCompatImageButton btnPwEye;

  @NonNull
  public final AppCompatImageButton btnX;

  @NonNull
  public final EditText etxtId;

  @NonNull
  public final EditText etxtPw;

  @NonNull
  public final AppCompatImageView imgLogo;

  @NonNull
  public final LinearLayoutCompat layoutId;

  @NonNull
  public final LinearLayoutCompat layoutPw;

  @NonNull
  public final TextView txtSignIn;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogin, @NonNull AppCompatImageButton btnPwEye,
      @NonNull AppCompatImageButton btnX, @NonNull EditText etxtId, @NonNull EditText etxtPw,
      @NonNull AppCompatImageView imgLogo, @NonNull LinearLayoutCompat layoutId,
      @NonNull LinearLayoutCompat layoutPw, @NonNull TextView txtSignIn) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnPwEye = btnPwEye;
    this.btnX = btnX;
    this.etxtId = etxtId;
    this.etxtPw = etxtPw;
    this.imgLogo = imgLogo;
    this.layoutId = layoutId;
    this.layoutPw = layoutPw;
    this.txtSignIn = txtSignIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      AppCompatButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btn_pw_eye;
      AppCompatImageButton btnPwEye = ViewBindings.findChildViewById(rootView, id);
      if (btnPwEye == null) {
        break missingId;
      }

      id = R.id.btn_x;
      AppCompatImageButton btnX = ViewBindings.findChildViewById(rootView, id);
      if (btnX == null) {
        break missingId;
      }

      id = R.id.etxt_id;
      EditText etxtId = ViewBindings.findChildViewById(rootView, id);
      if (etxtId == null) {
        break missingId;
      }

      id = R.id.etxt_pw;
      EditText etxtPw = ViewBindings.findChildViewById(rootView, id);
      if (etxtPw == null) {
        break missingId;
      }

      id = R.id.img_logo;
      AppCompatImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.layout_id;
      LinearLayoutCompat layoutId = ViewBindings.findChildViewById(rootView, id);
      if (layoutId == null) {
        break missingId;
      }

      id = R.id.layout_pw;
      LinearLayoutCompat layoutPw = ViewBindings.findChildViewById(rootView, id);
      if (layoutPw == null) {
        break missingId;
      }

      id = R.id.txt_sign_in;
      TextView txtSignIn = ViewBindings.findChildViewById(rootView, id);
      if (txtSignIn == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, btnPwEye, btnX, etxtId,
          etxtPw, imgLogo, layoutId, layoutPw, txtSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}