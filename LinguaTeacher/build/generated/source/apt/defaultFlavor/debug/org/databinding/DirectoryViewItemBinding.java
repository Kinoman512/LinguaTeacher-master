package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class DirectoryViewItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.CheckBox browserCheckbox;
    public final android.widget.TextView dviIcon;
    public final android.widget.ImageView itemMore;
    public final android.widget.LinearLayout layoutItem;
    public final android.widget.TextView text;
    public final android.widget.TextView title;
    // variables
    private int mType;
    private boolean mHasContextMenu;
    private boolean mChecked;
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage mStorage;
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder mHolder;
    private boolean mCheckEnabled;
    private java.lang.String mProtocol;
    private org.videolan.vlc.media.MediaWrapper mMedia;
    private android.graphics.drawable.BitmapDrawable mImage;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    private OnClickListenerImpl2 mAndroidViewViewOnCl2;
    // Inverse Binding Event Handlers

    public DirectoryViewItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.browserCheckbox = (android.widget.CheckBox) bindings[1];
        this.browserCheckbox.setTag(null);
        this.dviIcon = (android.widget.TextView) bindings[2];
        this.dviIcon.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[5];
        this.itemMore.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[0];
        this.layoutItem.setTag(null);
        this.text = (android.widget.TextView) bindings[4];
        this.text.setTag(null);
        this.title = (android.widget.TextView) bindings[3];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            case BR.type :
                setType((int) variable);
                return true;
            case BR.hasContextMenu :
                setHasContextMenu((boolean) variable);
                return true;
            case BR.checked :
                setChecked((boolean) variable);
                return true;
            case BR.storage :
                setStorage((org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder) variable);
                return true;
            case BR.checkEnabled :
                setCheckEnabled((boolean) variable);
                return true;
            case BR.protocol :
                setProtocol((java.lang.String) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.media.MediaWrapper) variable);
                return true;
            case BR.image :
                setImage((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }

    public void setType(int type) {
        this.mType = type;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.type);
        super.requestRebind();
    }
    public int getType() {
        return mType;
    }
    public void setHasContextMenu(boolean hasContextMenu) {
        this.mHasContextMenu = hasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hasContextMenu);
        super.requestRebind();
    }
    public boolean getHasContextMenu() {
        return mHasContextMenu;
    }
    public void setChecked(boolean checked) {
        this.mChecked = checked;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.checked);
        super.requestRebind();
    }
    public boolean getChecked() {
        return mChecked;
    }
    public void setStorage(org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage storage) {
        this.mStorage = storage;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.storage);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage getStorage() {
        return mStorage;
    }
    public void setHolder(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder holder) {
        this.mHolder = holder;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setCheckEnabled(boolean checkEnabled) {
        this.mCheckEnabled = checkEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.checkEnabled);
        super.requestRebind();
    }
    public boolean getCheckEnabled() {
        return mCheckEnabled;
    }
    public void setProtocol(java.lang.String protocol) {
        this.mProtocol = protocol;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.protocol);
        super.requestRebind();
    }
    public java.lang.String getProtocol() {
        return mProtocol;
    }
    public void setMedia(org.videolan.vlc.media.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.vlc.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setImage(android.graphics.drawable.BitmapDrawable image) {
        this.mImage = image;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
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
        boolean storageObjectnull = false;
        int hasContextMenuVISIBL = 0;
        int type = mType;
        boolean hasContextMenu = mHasContextMenu;
        boolean checked = mChecked;
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.Storage storage = mStorage;
        boolean typeInt2 = false;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder holder = mHolder;
        boolean checkEnabled = mCheckEnabled;
        boolean descriptionMediaObje = false;
        int typeInt2VISIBLEViewG = 0;
        java.lang.String nameStorageObjectnul = null;
        boolean holderObjectnull = false;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        boolean NameStorageObjectnul1 = false;
        java.lang.String protocol = mProtocol;
        org.videolan.vlc.media.MediaWrapper media = mMedia;
        boolean TypeInt21 = false;
        boolean hasContextMenuBoolea = false;
        android.graphics.drawable.BitmapDrawable image = mImage;
        java.lang.String descriptionMedia = null;
        int DescriptionMediaObje1 = 0;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;
        android.view.View.OnClickListener androidViewViewOnCli2 = null;
        int TypeInt2VISIBLEViewG1 = 0;
        java.lang.String nameStorage = null;

        if ((dirtyFlags & 0x201L) != 0) {



                // read type != 2
                typeInt2 = (type) != (2);
                // read type == 2
                TypeInt21 = (type) == (2);
                if((dirtyFlags & 0x201L) != 0) {
                    if (typeInt2) {
                        dirtyFlags |= 0x2000L;
                    } else {
                        dirtyFlags |= 0x1000L;
                    }}
                if((dirtyFlags & 0x201L) != 0) {
                    if (TypeInt21) {
                        dirtyFlags |= 0x200000L;
                    } else {
                        dirtyFlags |= 0x100000L;
                    }}


                // read type != 2 ? View.VISIBLE : View.GONE
                typeInt2VISIBLEViewG = (typeInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
                // read type == 2 ? View.VISIBLE : View.GONE
                TypeInt2VISIBLEViewG1 = (TypeInt21) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        if ((dirtyFlags & 0x21aL) != 0) {

                if((dirtyFlags & 0x202L) != 0) {
                    if (hasContextMenu) {
                        dirtyFlags |= 0x800L;
                    } else {
                        dirtyFlags |= 0x400L;
                    }}
                if((dirtyFlags & 0x20aL) != 0) {
                    if (hasContextMenu) {
                        dirtyFlags |= 0x20000L;
                    } else {
                        dirtyFlags |= 0x10000L;
                    }}

            if ((dirtyFlags & 0x202L) != 0) {

                    // read hasContextMenu ? View.VISIBLE : View.GONE
                    hasContextMenuVISIBL = (hasContextMenu) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
            }
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x288L) != 0) {



                if (storage != null) {
                    // read storage.name
                    nameStorage = storage.getName();
                }


                // read storage.name == null
                NameStorageObjectnul1 = (nameStorage) == (null);
                if((dirtyFlags & 0x288L) != 0) {
                    if (NameStorageObjectnul1) {
                        dirtyFlags |= 0x8000L;
                    } else {
                        dirtyFlags |= 0x4000L;
                    }}
        }
        if ((dirtyFlags & 0x212L) != 0) {


            if ((dirtyFlags & 0x210L) != 0) {

                    // read holder != null
                    holderObjectnull = (holder) != (null);
                    if (holder != null) {
                        // read holder::onCheckBoxClick
                        androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(holder));
                        // read holder::onClick
                        androidViewViewOnCli2 = (((mAndroidViewViewOnCl2 == null) ? (mAndroidViewViewOnCl2 = new OnClickListenerImpl2()) : mAndroidViewViewOnCl2).setValue(holder));
                    }
            }

                if (holder != null) {
                    // read holder::onMoreClick
                    androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x220L) != 0) {
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {



                if (media != null) {
                    // read media.description
                    descriptionMedia = media.getDescription();
                }


                // read media.description != null
                descriptionMediaObje = (descriptionMedia) != (null);
                if((dirtyFlags & 0x280L) != 0) {
                    if (descriptionMediaObje) {
                        dirtyFlags |= 0x80000L;
                    } else {
                        dirtyFlags |= 0x40000L;
                    }}


                // read media.description != null ? View.VISIBLE : View.GONE
                DescriptionMediaObje1 = (descriptionMediaObje) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        if ((dirtyFlags & 0x300L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {



                // read storage != null
                storageObjectnull = (storage) != (null);
        }
        if ((dirtyFlags & 0x8000L) != 0) {



                if (media != null) {
                    // read media.title
                    titleMedia = media.getTitle();
                }
        }

        if ((dirtyFlags & 0x288L) != 0) {

                // read storage.name == null ? media.title : storage.name
                nameStorageObjectnul = (NameStorageObjectnul1) ? (titleMedia) : (nameStorage);
        }
        if ((dirtyFlags & 0x20aL) != 0) {

                // read hasContextMenu ? true : storage != null
                hasContextMenuBoolea = (hasContextMenu) ? (true) : (storageObjectnull);
        }
        // batch finished
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.browserCheckbox.setVisibility(TypeInt2VISIBLEViewG1);
            this.dviIcon.setVisibility(typeInt2VISIBLEViewG);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            this.browserCheckbox.setEnabled(checkEnabled);
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.browserCheckbox, checked);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            this.browserCheckbox.setOnClickListener(androidViewViewOnCli);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.layoutItem, (android.view.View.OnClickListener)androidViewViewOnCli2, holderObjectnull);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dviIcon, protocol);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.dviIcon, image);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.AsyncImageLoader.downloadIcon(this.dviIcon, media);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, descriptionMedia);
            this.text.setVisibility(DescriptionMediaObje1);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            this.itemMore.setVisibility(hasContextMenuVISIBL);
        }
        if ((dirtyFlags & 0x212L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)androidViewViewOnCli1, hasContextMenu);
        }
        if ((dirtyFlags & 0x20aL) != 0) {
            // api target 1

            this.layoutItem.setLongClickable(hasContextMenuBoolea);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, nameStorageObjectnul);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCheckBoxClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
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

    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DirectoryViewItemBinding>inflate(inflater, org.R.layout.directory_view_item, root, attachToRoot, bindingComponent);
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.directory_view_item, null, false), bindingComponent);
    }
    public static DirectoryViewItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DirectoryViewItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/directory_view_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DirectoryViewItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): type
        flag 1 (0x2L): hasContextMenu
        flag 2 (0x3L): checked
        flag 3 (0x4L): storage
        flag 4 (0x5L): holder
        flag 5 (0x6L): checkEnabled
        flag 6 (0x7L): protocol
        flag 7 (0x8L): media
        flag 8 (0x9L): image
        flag 9 (0xaL): null
        flag 10 (0xbL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 11 (0xcL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 12 (0xdL): type != 2 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): type != 2 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): storage.name == null ? media.title : storage.name
        flag 15 (0x10L): storage.name == null ? media.title : storage.name
        flag 16 (0x11L): hasContextMenu ? true : storage != null
        flag 17 (0x12L): hasContextMenu ? true : storage != null
        flag 18 (0x13L): media.description != null ? View.VISIBLE : View.GONE
        flag 19 (0x14L): media.description != null ? View.VISIBLE : View.GONE
        flag 20 (0x15L): type == 2 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): type == 2 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}