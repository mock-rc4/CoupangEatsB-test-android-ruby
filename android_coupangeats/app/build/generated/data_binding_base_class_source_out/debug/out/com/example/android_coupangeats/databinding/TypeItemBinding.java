// Generated by view binder compiler. Do not edit!
package com.example.android_coupangeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android_coupangeats.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TypeItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imgType;

  @NonNull
  public final TextView txtType;

  private TypeItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView imgType,
      @NonNull TextView txtType) {
    this.rootView = rootView;
    this.imgType = imgType;
    this.txtType = txtType;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TypeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TypeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.type_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TypeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_type;
      AppCompatImageView imgType = ViewBindings.findChildViewById(rootView, id);
      if (imgType == null) {
        break missingId;
      }

      id = R.id.txt_type;
      TextView txtType = ViewBindings.findChildViewById(rootView, id);
      if (txtType == null) {
        break missingId;
      }

      return new TypeItemBinding((ConstraintLayout) rootView, imgType, txtType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
