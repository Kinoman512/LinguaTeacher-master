package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class VlcQuestionDialogBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.Button action1;
    public final android.widget.Button action2;
    public final android.widget.Button cancel;
    private final android.widget.ScrollView mboundView0;
    public final android.widget.TextView text;
    // variables
    private org.videolan.vlc.gui.dialogs.VlcQuestionDialog mHandler;
    private org.videolan.libvlc.Dialog.QuestionDialog mDialog;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    private OnClickListenerImpl2 mAndroidViewViewOnCl2;
    // Inverse Binding Event Handlers

    public VlcQuestionDialogBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.action1 = (android.widget.Button) bindings[4];
        this.action1.setTag(null);
        this.action2 = (android.widget.Button) bindings[3];
        this.action2.setTag(null);
        this.cancel = (android.widget.Button) bindings[2];
        this.cancel.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.text = (android.widget.TextView) bindings[1];
        this.text.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.handler :
                setHandler((org.videolan.vlc.gui.dialogs.VlcQuestionDialog) variable);
                return true;
            case BR.dialog :
                setDialog((org.videolan.libvlc.Dialog.QuestionDialog) variable);
                return true;
        }
        return false;
    }

    public void setHandler(org.videolan.vlc.gui.dialogs.VlcQuestionDialog handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.dialogs.VlcQuestionDialog getHandler() {
        return mHandler;
    }
    public void setDialog(org.videolan.libvlc.Dialog.QuestionDialog dialog) {
        this.mDialog = dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }
    public org.videolan.libvlc.Dialog.QuestionDialog getDialog() {
        return mDialog;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean textUtilsIsEmptyText = false;
        int TextUtilsIsEmptyText1 = 0;
        boolean TextUtilsIsEmptyText2 = false;
        java.lang.String action2TextDialog = null;
        java.lang.String textDialog = null;
        java.lang.String TextUtilsIsEmptyText3 = null;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;
        org.videolan.vlc.gui.dialogs.VlcQuestionDialog handler = mHandler;
        android.view.View.OnClickListener androidViewViewOnCli2 = null;
        boolean TextUtilsIsEmptyText4 = false;
        java.lang.String cancelTextDialog = null;
        int TextUtilsIsEmptyText5 = 0;
        org.videolan.libvlc.Dialog.QuestionDialog dialog = mDialog;
        java.lang.String action1TextDialog = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onAction2
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                    // read handler::onAction1
                    androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(handler));
                    // read handler::onCancel
                    androidViewViewOnCli2 = (((mAndroidViewViewOnCl2 == null) ? (mAndroidViewViewOnCl2 = new OnClickListenerImpl2()) : mAndroidViewViewOnCl2).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.action2Text
                    action2TextDialog = dialog.getAction2Text();
                    // read dialog.text
                    textDialog = dialog.getText();
                    // read dialog.cancelText
                    cancelTextDialog = dialog.getCancelText();
                    // read dialog.action1Text
                    action1TextDialog = dialog.getAction1Text();
                }


                // read TextUtils.isEmpty(dialog.action2Text)
                textUtilsIsEmptyText = android.text.TextUtils.isEmpty(action2TextDialog);
                // read TextUtils.isEmpty(dialog.cancelText)
                TextUtilsIsEmptyText2 = android.text.TextUtils.isEmpty(cancelTextDialog);
                // read TextUtils.isEmpty(dialog.action1Text)
                TextUtilsIsEmptyText4 = android.text.TextUtils.isEmpty(action1TextDialog);
                if((dirtyFlags & 0x6L) != 0) {
                    if (textUtilsIsEmptyText) {
                        dirtyFlags |= 0x100L;
                    } else {
                        dirtyFlags |= 0x80L;
                    }}
                if((dirtyFlags & 0x6L) != 0) {
                    if (TextUtilsIsEmptyText2) {
                        dirtyFlags |= 0x40L;
                    } else {
                        dirtyFlags |= 0x20L;
                    }}
                if((dirtyFlags & 0x6L) != 0) {
                    if (TextUtilsIsEmptyText4) {
                        dirtyFlags |= 0x10L;
                    } else {
                        dirtyFlags |= 0x8L;
                    }}


                // read TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
                TextUtilsIsEmptyText5 = (textUtilsIsEmptyText) ? (android.view.View.GONE) : (android.view.View.VISIBLE);
                // read TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
                TextUtilsIsEmptyText1 = (TextUtilsIsEmptyText4) ? (android.view.View.GONE) : (android.view.View.VISIBLE);
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
                TextUtilsIsEmptyText3 = (TextUtilsIsEmptyText2) ? (cancel.getResources().getString(android.R.string.cancel)) : (cancelTextDialog);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.action1, action1TextDialog);
            this.action1.setVisibility(TextUtilsIsEmptyText1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.action2, action2TextDialog);
            this.action2.setVisibility(TextUtilsIsEmptyText5);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.cancel, TextUtilsIsEmptyText3);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, textDialog);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action1.setOnClickListener(androidViewViewOnCli1);
            this.action2.setOnClickListener(androidViewViewOnCli);
            this.cancel.setOnClickListener(androidViewViewOnCli2);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction2(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction1(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VlcQuestionDialogBinding>inflate(inflater, org.R.layout.vlc_question_dialog, root, attachToRoot, bindingComponent);
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.vlc_question_dialog, null, false), bindingComponent);
    }
    public static VlcQuestionDialogBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/vlc_question_dialog_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VlcQuestionDialogBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
        flag 6 (0x7L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
        flag 7 (0x8L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}