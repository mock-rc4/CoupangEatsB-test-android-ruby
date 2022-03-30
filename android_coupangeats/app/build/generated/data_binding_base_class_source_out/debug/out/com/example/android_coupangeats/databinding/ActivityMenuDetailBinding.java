// Generated by view binder compiler. Do not edit!
package com.example.android_coupangeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android_coupangeats.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnCart;

  @NonNull
  public final ImageView img;

  @NonNull
  public final AppCompatImageView imgMinus;

  @NonNull
  public final AppCompatImageView imgPlus;

  @NonNull
  public final View line;

  @NonNull
  public final TextView txtCount;

  @NonNull
  public final TextView txtCounttext;

  @NonNull
  public final TextView txtDetail;

  @NonNull
  public final TextView txtPrice;

  @NonNull
  public final TextView txtPricetext;

  @NonNull
  public final TextView txtTitle;

  private ActivityMenuDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnCart, @NonNull ImageView img,
      @NonNull AppCompatImageView imgMinus, @NonNull AppCompatImageView imgPlus, @NonNull View line,
      @NonNull TextView txtCount, @NonNull TextView txtCounttext, @NonNull TextView txtDetail,
      @NonNull TextView txtPrice, @NonNull TextView txtPricetext, @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.btnCart = btnCart;
    this.img = img;
    this.imgMinus = imgMinus;
    this.imgPlus = imgPlus;
    this.line = line;
    this.txtCount = txtCount;
    this.txtCounttext = txtCounttext;
    this.txtDetail = txtDetail;
    this.txtPrice = txtPrice;
    this.txtPricetext = txtPricetext;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cart;
      AppCompatButton btnCart = ViewBindings.findChildViewById(rootView, id);
      if (btnCart == null) {
        break missingId;
      }

      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.img_minus;
      AppCompatImageView imgMinus = ViewBindings.findChildViewById(rootView, id);
      if (imgMinus == null) {
        break missingId;
      }

      id = R.id.img_plus;
      AppCompatImageView imgPlus = ViewBindings.findChildViewById(rootView, id);
      if (imgPlus == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.txt_count;
      TextView txtCount = ViewBindings.findChildViewById(rootView, id);
      if (txtCount == null) {
        break missingId;
      }

      id = R.id.txt_counttext;
      TextView txtCounttext = ViewBindings.findChildViewById(rootView, id);
      if (txtCounttext == null) {
        break missingId;
      }

      id = R.id.txt_detail;
      TextView txtDetail = ViewBindings.findChildViewById(rootView, id);
      if (txtDetail == null) {
        break missingId;
      }

      id = R.id.txt_price;
      TextView txtPrice = ViewBindings.findChildViewById(rootView, id);
      if (txtPrice == null) {
        break missingId;
      }

      id = R.id.txt_pricetext;
      TextView txtPricetext = ViewBindings.findChildViewById(rootView, id);
      if (txtPricetext == null) {
        break missingId;
      }

      id = R.id.txt_title;
      TextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ActivityMenuDetailBinding((ConstraintLayout) rootView, btnCart, img, imgMinus,
          imgPlus, line, txtCount, txtCounttext, txtDetail, txtPrice, txtPricetext, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
