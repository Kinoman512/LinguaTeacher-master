package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class ListItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_item, 4);
    }
    // views
    public final android.widget.ImageView icon;
    public final android.widget.LinearLayout layoutItem;
    private final android.support.v7.widget.CardView mboundView0;
    public final android.widget.TextView subtitle;
    public final android.widget.TextView title;
    // variables
    private org.videolan.vlc.gui.HistoryAdapter.ViewHolder mHolder;
    private org.videolan.vlc.media.MediaWrapper mMedia;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public ListItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.icon = (android.widget.ImageView) bindings[1];
        this.icon.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[4];
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.subtitle = (android.widget.TextView) bindings[3];
        this.subtitle.setTag(null);
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
            case BR.holder :
                setHolder((org.videolan.vlc.gui.HistoryAdapter.ViewHolder) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.media.MediaWrapper) variable);
                return true;
            case BR.position :
                return true;
        }
        return false;
    }

    public void setPosition(int position) {
        // not used, ignore
    }
    public int getPosition() {
        return 0;
    }
    public void setHolder(org.videolan.vlc.gui.HistoryAdapter.ViewHolder holder) {
        this.mHolder = holder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.HistoryAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setMedia(org.videolan.vlc.media.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.vlc.media.MediaWrapper getMedia() {
        return mMedia;
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
        java.lang.String artistMedia = null;
        boolean artistMediaObjectnul = false;
        java.lang.String titleMedia = null;
        int typeMedia = 0;
        org.videolan.vlc.gui.HistoryAdapter.ViewHolder holder = mHolder;
        android.graphics.drawable.Drawable typeMediaTYPEVIDEOMe = null;
        int ArtistMediaObjectnul1 = 0;
        org.videolan.vlc.media.MediaWrapper media = mMedia;
        boolean TypeMediaTYPEVIDEOMe1 = false;
        android.view.View.OnClickListener androidViewViewOnCli = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(holder));
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (media != null) {
                    // read media.artist
                    artistMedia = media.getArtist();
                    // read media.title
                    titleMedia = media.getTitle();
                    // read media.type
                    typeMedia = media.getType();
                }


                // read media.artist == null
                artistMediaObjectnul = (artistMedia) == (null);
                // read media.type == MediaWrapper.TYPE_VIDEO
                TypeMediaTYPEVIDEOMe1 = (typeMedia) == (org.videolan.vlc.media.MediaWrapper.TYPE_VIDEO);
                if((dirtyFlags & 0xaL) != 0) {
                    if (artistMediaObjectnul) {
                        dirtyFlags |= 0x80L;
                    } else {
                        dirtyFlags |= 0x40L;
                    }}
                if((dirtyFlags & 0xaL) != 0) {
                    if (TypeMediaTYPEVIDEOMe1) {
                        dirtyFlags |= 0x20L;
                    } else {
                        dirtyFlags |= 0x10L;
                    }}


                // read media.artist == null ? View.INVISIBLE : View.VISIBLE
                ArtistMediaObjectnul1 = (artistMediaObjectnul) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE);
                // read media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
                typeMediaTYPEVIDEOMe = (TypeMediaTYPEVIDEOMe1) ? (android.databinding.DynamicUtil.getDrawableFromResource(icon, R.drawable.ic_browser_video_normal)) : (android.databinding.DynamicUtil.getDrawableFromResource(icon, R.drawable.ic_browser_audio_normal));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icon, typeMediaTYPEVIDEOMe);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, artistMedia);
            this.subtitle.setVisibility(ArtistMediaObjectnul1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, titleMedia);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(androidViewViewOnCli);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.HistoryAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.HistoryAdapter.ViewHolder value) {
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

    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListItemBinding>inflate(inflater, org.R.layout.list_item, root, attachToRoot, bindingComponent);
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.list_item, null, false), bindingComponent);
    }
    public static ListItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/list_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): holder
        flag 1 (0x2L): media
        flag 2 (0x3L): position
        flag 3 (0x4L): null
        flag 4 (0x5L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 5 (0x6L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 6 (0x7L): media.artist == null ? View.INVISIBLE : View.VISIBLE
        flag 7 (0x8L): media.artist == null ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}