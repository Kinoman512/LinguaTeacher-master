package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class ExtensionItemViewBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView author;
    public final android.widget.ImageView extensionImage;
    public final android.widget.ImageView itemMore;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.TextView title;
    // variables
    private org.videolan.vlc.extensions.api.VLCExtensionItem mItem;
    private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder mHolder;
    private android.graphics.drawable.BitmapDrawable mImage;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public ExtensionItemViewBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.author = (android.widget.TextView) bindings[3];
        this.author.setTag(null);
        this.extensionImage = (android.widget.ImageView) bindings[1];
        this.extensionImage.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title = (android.widget.TextView) bindings[2];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            case BR.item :
                setItem((org.videolan.vlc.extensions.api.VLCExtensionItem) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder) variable);
                return true;
            case BR.image :
                setImage((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }

    public void setItem(org.videolan.vlc.extensions.api.VLCExtensionItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public org.videolan.vlc.extensions.api.VLCExtensionItem getItem() {
        return mItem;
    }
    public void setHolder(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder holder) {
        this.mHolder = holder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setImage(android.graphics.drawable.BitmapDrawable image) {
        this.mImage = image;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getImage() {
        return mImage;
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
        boolean typeItemInt0 = false;
        java.lang.String subTitleItem = null;
        int typeItemInt0VISIBLEV = 0;
        org.videolan.vlc.extensions.api.VLCExtensionItem item = mItem;
        org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder holder = mHolder;
        int typeItem = 0;
        android.graphics.drawable.BitmapDrawable image = mImage;
        java.lang.String titleItem = null;
        android.view.View.OnClickListener androidViewViewOnCli = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.subTitle
                    subTitleItem = item.getSubTitle();
                    // read item.type
                    typeItem = item.getType();
                    // read item.title
                    titleItem = item.getTitle();
                }


                // read item.type != 0
                typeItemInt0 = (typeItem) != (0);
                if((dirtyFlags & 0x9L) != 0) {
                    if (typeItemInt0) {
                        dirtyFlags |= 0x20L;
                    } else {
                        dirtyFlags |= 0x10L;
                    }}


                // read item.type != 0 ? View.VISIBLE : View.GONE
                typeItemInt0VISIBLEV = (typeItemInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(holder));
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.author, subTitleItem);
            this.itemMore.setVisibility(typeItemInt0VISIBLEV);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, titleItem);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.extensionImage, image);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(androidViewViewOnCli);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExtensionItemViewBinding>inflate(inflater, org.R.layout.extension_item_view, root, attachToRoot, bindingComponent);
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.extension_item_view, null, false), bindingComponent);
    }
    public static ExtensionItemViewBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/extension_item_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExtensionItemViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): holder
        flag 2 (0x3L): image
        flag 3 (0x4L): null
        flag 4 (0x5L): item.type != 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): item.type != 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}