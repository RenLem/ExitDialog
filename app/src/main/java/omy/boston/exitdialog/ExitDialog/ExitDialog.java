package omy.boston.exitdialog.ExitDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Binder;
import android.os.Bundle;

import omy.boston.exitdialog.R;

/**
 * Created on 11-Jan-17.
 */

public class ExitDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder dBilder = new AlertDialog.Builder(getActivity());
        dBilder.setTitle(android.R.string.dialog_alert_title);
        dBilder.setIcon(android.R.drawable.ic_dialog_alert
        );
        dBilder.setMessage(R.string.exit_aplication_dialog);
        dBilder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().finish();
            }
        });
        dBilder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dismiss();
            }
        });

        AlertDialog dijalog = dBilder.create();
        return dijalog;
    }
}
