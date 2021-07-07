
package com.reactlibraryusbconnect;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNUsbConnectionModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNUsbConnectionModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNUsbConnection";
  }

  @ReactMethod
  public static boolean isConnected(Context context) {
    Intent intent = context.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
    return intent.getExtras().getBoolean("connected");
  }
//  public void show(String text) {
//    Context context = getReactApplicationContext();
//    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
//  }
}