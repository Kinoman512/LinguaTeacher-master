package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class VlcLoginDialogBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_container, 7);
        sViewsWithIds.put(R.id.password_container, 8);
        sViewsWithIds.put(R.id.password, 9);
    }
    // views
    public final android.widget.Button action;
    public final android.widget.Button cancel;
    public final android.widget.EditText login;
    public final android.support.design.widget.TextInputLayout loginContainer;
    private final android.widget.ScrollView mboundView0;
    public final android.widget.EditText password;
    public final android.support.design.widget.TextInputLayout passwordContainer;
    public final android.widget.CheckBox store;
    public final android.widget.TextView text;
    public final android.widget.TextView warning;
    // variables
    private org.videolan.vlc.gui.dialogs.VlcLoginDialog mHandler;
    private org.videolan.libvlc.Dialog.LoginDialog mDialog;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    // Inverse Binding Event Handlers

    public VlcLoginDialogBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.action = (android.widget.Button) bindings[6];
        this.action.setTag(null);
        this.cancel = (android.widget.Button) bindings[5];
        this.cancel.setTag(null);
        this.login = (android.widget.EditText) bindings[2];
        this.login.setTag(null);
        this.loginContainer = (android.support.design.widget.TextInputLayout) bindings[7];
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.password = (android.widget.EditText) bindings[9];
        this.passwordContainer = (android.support.design.widget.TextInputLayout) bindings[8];
        this.store = (android.widget.CheckBox) bindings[3];
        this.store.setTag(null);
        this.text = (android.widget.TextView) bindings[1];
        this.text.setTag(null);
        this.warning = (android.widget.TextView) bindings[4];
        this.warning.setTag(null);
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
                setHandler((org.videolan.vlc.gui.dialogs.VlcLoginDialog) variable);
                return true;
            case BR.dialog :
                setDialog((org.videolan.libvlc.Dialog.LoginDialog) variable);
                return true;
        }
        return false;
    }

    public void setHandler(org.videolan.vlc.gui.dialogs.VlcLoginDialog handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.dialogs.VlcLoginDialog getHandler() {
        return mHandler;
    }
    public void setDialog(org.videolan.libvlc.Dialog.LoginDialog dialog) {
        this.mDialog = dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }
    public org.videolan.libvlc.Dialog.LoginDialog getDialog() {
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
        int dialogAsksStoreDialo = 0;
        java.lang.String textDialog = null;
        org.videolan.vlc.gui.dialogs.VlcLoginDialog handler = mHandler;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        boolean DialogAsksStoreDialo1 = false;
        boolean handlerStoreHandler = false;
        java.lang.String dialogGetDefaultUser = null;
        boolean dialogAsksStoreDialo1 = false;
        org.videolan.libvlc.Dialog.LoginDialog dialog = mDialog;
        int DialogAsksStoreDialo2 = 0;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onCancel
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                    // read handler.store()
                    handlerStoreHandler = handler.store();
                    // read handler::onLogin
                    androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.text
                    textDialog = dialog.getText();
                    // read dialog.getDefaultUsername()
                    dialogGetDefaultUser = dialog.getDefaultUsername();
                    // read dialog.asksStore()
                    dialogAsksStoreDialo1 = dialog.asksStore();
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if (dialogAsksStoreDialo1) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                    } else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                    }}


                // read dialog.asksStore() ? View.VISIBLE : View.GONE
                dialogAsksStoreDialo = (dialogAsksStoreDialo1) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false
                DialogAsksStoreDialo1 = (dialogAsksStoreDialo1) ? (!org.videolan.libvlc.util.AndroidUtil.isMarshMallowOrLater()) : (false);
                if((dirtyFlags & 0x6L) != 0) {
                    if (DialogAsksStoreDialo1) {
                        dirtyFlags |= 0x100L;
                    } else {
                        dirtyFlags |= 0x80L;
                    }}


                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false ? View.VISIBLE : View.GONE
                DialogAsksStoreDialo2 = (DialogAsksStoreDialo1) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action.setOnClickListener(androidViewViewOnCli1);
            this.cancel.setOnClickListener(androidViewViewOnCli);
            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.store, handlerStoreHandler);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.login, dialogGetDefaultUser);
            this.store.setVisibility(dialogAsksStoreDialo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, textDialog);
            this.warning.setVisibility(DialogAsksStoreDialo2);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.dialogs.VlcLoginDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.dialogs.VlcLoginDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLogin(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static VlcLoginDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcLoginDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VlcLoginDialogBinding>inflate(inflater, org.R.layout.vlc_login_dialog, root, attachToRoot, bindingComponent);
    }
    public static VlcLoginDialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcLoginDialogBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.vlc_login_dialog, null, false), bindingComponent);
    }
    public static VlcLoginDialogBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcLoginDialogBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/vlc_login_dialog_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VlcLoginDialogBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false
        flag 6 (0x7L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false
        flag 7 (0x8L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater() : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}