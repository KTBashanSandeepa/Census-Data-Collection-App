// Generated by view binder compiler. Do not edit!
package com.example.censusdatacollectionapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.censusdatacollectionapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView LogoLogin;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final ConstraintLayout layout;

  @NonNull
  public final EditText pwdLogin;

  @NonNull
  public final TextView textLogin;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView LogoLogin,
      @NonNull Button btnLogin, @NonNull ConstraintLayout layout, @NonNull EditText pwdLogin,
      @NonNull TextView textLogin) {
    this.rootView = rootView;
    this.LogoLogin = LogoLogin;
    this.btnLogin = btnLogin;
    this.layout = layout;
    this.pwdLogin = pwdLogin;
    this.textLogin = textLogin;
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
      id = R.id.LogoLogin;
      ImageView LogoLogin = ViewBindings.findChildViewById(rootView, id);
      if (LogoLogin == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      ConstraintLayout layout = (ConstraintLayout) rootView;

      id = R.id.pwdLogin;
      EditText pwdLogin = ViewBindings.findChildViewById(rootView, id);
      if (pwdLogin == null) {
        break missingId;
      }

      id = R.id.text_Login;
      TextView textLogin = ViewBindings.findChildViewById(rootView, id);
      if (textLogin == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, LogoLogin, btnLogin, layout,
          pwdLogin, textLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
