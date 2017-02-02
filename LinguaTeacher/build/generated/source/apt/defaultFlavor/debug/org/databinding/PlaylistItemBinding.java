package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class PlaylistItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView audioItemSubtitle;
    public final android.widget.TextView audioItemTitle;
    public final android.widget.ImageView itemMore;
    private final android.widget.RelativeLayout mboundView0;
    // variables
    private org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder mHolder;
    private java.lang.String mSubTitle;
    private org.videolan.vlc.media.MediaWrapper mMedia;
    private int mTitleColor;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    // Inverse Binding Event Handlers

    public PlaylistItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.audioItemSubtitle = (android.widget.TextView) bindings[2];
        this.audioItemSubtitle.setTag(null);
        this.audioItemTitle = (android.widget.TextView) bindings[1];
        this.audioItemTitle.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[3];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            case BR.holder :
                setHolder((org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder) variable);
                return true;
            case BR.subTitle :
                setSubTitle((java.lang.String) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.media.MediaWrapper) variable);
                return true;
            case BR.titleColor :
                setTitleColor((int) variable);
                return true;
        }
        return false;
    }

    public void setHolder(org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder holder) {
        this.mHolder = holder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setSubTitle(java.lang.String subTitle) {
        this.mSubTitle = subTitle;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subTitle);
        super.requestRebind();
    }
    public java.lang.String getSubTitle() {
        return mSubTitle;
    }
    public void setMedia(org.videolan.vlc.media.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.vlc.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setTitleColor(int titleColor) {
        this.mTitleColor = titleColor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.titleColor);
        super.requestRebind();
    }
    public int getTitleColor() {
        return mTitleColor;
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
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder holder = mHolder;
        boolean textUtilsIsEmptyText = false;
        int TextUtilsIsEmptyText1 = 0;
        java.lang.String subTitle = mSubTitle;
        org.videolan.vlc.media.MediaWrapper media = mMedia;
        int titleColor = mTitleColor;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (holder != null) {
                    // read holder::onMoreClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(holder));
                    // read holder::onClick
                    androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read TextUtils.isEmpty(subTitle)
                textUtilsIsEmptyText = android.text.TextUtils.isEmpty(subTitle);
                if((dirtyFlags & 0x12L) != 0) {
                    if (textUtilsIsEmptyText) {
                        dirtyFlags |= 0x40L;
                    } else {
                        dirtyFlags |= 0x20L;
                    }}


                // read TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
                TextUtilsIsEmptyText1 = (textUtilsIsEmptyText) ? (android.view.View.GONE) : (android.view.View.VISIBLE);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (media != null) {
                    // read media.title
                    titleMedia = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemSubtitle, subTitle);
            this.audioItemSubtitle.setVisibility(TextUtilsIsEmptyText1);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemTitle, titleMedia);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.audioItemTitle.setTextColor(titleColor);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(androidViewViewOnCli);
            this.mboundView0.setOnClickListener(androidViewViewOnCli1);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value) {
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

    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PlaylistItemBinding>inflate(inflater, org.R.layout.playlist_item, root, attachToRoot, bindingComponent);
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.playlist_item, null, false), bindingComponent);
    }
    public static PlaylistItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/playlist_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PlaylistItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): holder
        flag 1 (0x2L): subTitle
        flag 2 (0x3L): media
        flag 3 (0x4L): titleColor
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}