// Generated by view binder compiler. Do not edit!
package com.example.android_coupangeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.android_coupangeats.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ContentScrollingBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  private ContentScrollingBinding(@NonNull View rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentScrollingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentScrollingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_scrolling, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentScrollingBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ContentScrollingBinding(rootView);
  }
}
