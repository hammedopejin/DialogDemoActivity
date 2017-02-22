package com.codepath.dialogdemoactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.DatePicker;


/**
 * Created by hammedopejin on 2/6/17.
 */

public class MyParentFragment extends Fragment implements EditNameDialogFragment.EditNameDialogListener {
    // Call this method to launch the edit dialog
    private void showEditDialog() {
        FragmentManager fm = getFragmentManager();
        EditNameDialogFragment editNameDialogFragment = EditNameDialogFragment.newInstance("Some Title");
        // SETS the target fragment for use later when sending results
        editNameDialogFragment.setTargetFragment(MyParentFragment.this, 300);
        editNameDialogFragment.show(fm, "fragment_edit_name");
    }

    // This is called when the dialog is completed and the results have been passed
    @Override
    public void onFinishEditDialog(String inputText) {
      //  Toast.makeText(this, "Hi, " + inputText, Toast.LENGTH_SHORT).show();
    }

}
