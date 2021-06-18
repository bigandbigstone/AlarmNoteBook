package com.example.AlarmNoteBook.util;

import android.widget.Toast;

import com.example.AlarmNoteBook.AlarmNoteBookApplication;

/**
 * @author jsbintask@gmail.com
 * @date 2018/4/25 17:08
 */
public class ToastUtil {
    public static void showToastShort(String msg) {
        Toast.makeText(AlarmNoteBookApplication.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void showToastShort(int res) {
        Toast.makeText(AlarmNoteBookApplication.getContext(), AlarmNoteBookApplication.getContext().getString(res), Toast.LENGTH_SHORT).show();
    }
}
