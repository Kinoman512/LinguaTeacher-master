package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class AudioBrowserItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.view.View footer;
    public final android.widget.ImageView itemMore;
    public final android.widget.LinearLayout layoutItem;
    public final android.widget.ImageView mediaCover;
    public final android.widget.TextView subtitle;
    public final android.widget.TextView title;
    // variables
    private boolean mClickable;
    private org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem mItem;
    private org.videolan.vlc.interfaces.IAudioClickHandler mHandler;
    private org.videolan.vlc.media.MediaWrapper mMedia;
    private int mPosition;
    private boolean mHasFooter;
    private int mAlignMode;
    private android.graphics.drawable.BitmapDrawable mCover;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public AudioBrowserItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.footer = (android.view.View) bindings[5];
        this.footer.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[0];
        this.layoutItem.setTag(null);
        this.mediaCover = (android.widget.ImageView) bindings[1];
        this.mediaCover.setTag(null);
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
                mDirtyFlags = 0x100L;
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
            case BR.clickable :
                setClickable((boolean) variable);
                return true;
            case BR.item :
                setItem((org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.interfaces.IAudioClickHandler) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.media.MediaWrapper) variable);
                return true;
            case BR.position :
                setPosition((int) variable);
                return true;
            case BR.hasFooter :
                setHasFooter((boolean) variable);
                return true;
            case BR.alignMode :
                setAlignMode((int) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }

    public void setClickable(boolean clickable) {
        this.mClickable = clickable;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickable);
        super.requestRebind();
    }
    public boolean getClickable() {
        return mClickable;
    }
    public void setItem(org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem getItem() {
        return mItem;
    }
    public void setHandler(org.videolan.vlc.interfaces.IAudioClickHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.interfaces.IAudioClickHandler getHandler() {
        return mHandler;
    }
    public void setMedia(org.videolan.vlc.media.MediaWrapper media) {
        this.mMedia = media;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.vlc.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setPosition(int position) {
        this.mPosition = position;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public int getPosition() {
        return mPosition;
    }
    public void setHasFooter(boolean hasFooter) {
        this.mHasFooter = hasFooter;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.hasFooter);
        super.requestRebind();
    }
    public boolean getHasFooter() {
        return mHasFooter;
    }
    public void setAlignMode(int alignMode) {
        this.mAlignMode = alignMode;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.alignMode);
        super.requestRebind();
    }
    public int getAlignMode() {
        return mAlignMode;
    }
    public void setCover(android.graphics.drawable.BitmapDrawable cover) {
        this.mCover = cover;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
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
        boolean clickable = mClickable;
        java.lang.String artistMedia = null;
        boolean artistMediaObjectnul = false;
        boolean textUtilsIsEmptyText = false;
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.audio.AudioBrowserListAdapter.ListItem item = mItem;
        int hasFooterVISIBLEView = 0;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        boolean titleMediaObjectnull = false;
        org.videolan.vlc.interfaces.IAudioClickHandler handler = mHandler;
        java.lang.String mTitleItem = null;
        int coverObjectnullVISIB = 0;
        java.lang.String mSubTitleItem = null;
        boolean coverObjectnull = false;
        boolean TextUtilsIsEmptyText1 = false;
        boolean TextUtilsIsEmptyText2 = false;
        org.videolan.vlc.media.MediaWrapper media = mMedia;
        int position = mPosition;
        int clickableVISIBLEView = 0;
        java.lang.String TitleMediaObjectnull1 = null;
        int TextUtilsIsEmptyText3 = 0;
        boolean hasFooter = mHasFooter;
        int alignMode = mAlignMode;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        java.lang.String ArtistMediaObjectnul1 = null;

        if ((dirtyFlags & 0x105L) != 0) {

                if((dirtyFlags & 0x101L) != 0) {
                    if (clickable) {
                        dirtyFlags |= 0x10000L;
                    } else {
                        dirtyFlags |= 0x8000L;
                    }}

            if ((dirtyFlags & 0x101L) != 0) {

                    // read clickable ? View.VISIBLE : View.GONE
                    clickableVISIBLEView = (clickable) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
            }

                if (handler != null) {
                    // read handler::onMoreClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x10aL) != 0) {



                if (item != null) {
                    // read item.mSubTitle
                    mSubTitleItem = item.mSubTitle;
                }
                if (media != null) {
                    // read media.artist
                    artistMedia = media.getArtist();
                    // read media.title
                    titleMedia = media.getTitle();
                }


                // read TextUtils.isEmpty(item.mSubTitle)
                TextUtilsIsEmptyText1 = android.text.TextUtils.isEmpty(mSubTitleItem);
                // read media.artist == null
                artistMediaObjectnul = (artistMedia) == (null);
                // read media.title == null
                titleMediaObjectnull = (titleMedia) == (null);
                if((dirtyFlags & 0x10aL) != 0) {
                    if (TextUtilsIsEmptyText1) {
                        dirtyFlags |= 0x400L;
                    } else {
                        dirtyFlags |= 0x200L;
                    }}
                if((dirtyFlags & 0x10aL) != 0) {
                    if (artistMediaObjectnul) {
                        dirtyFlags |= 0x400000L;
                    } else {
                        dirtyFlags |= 0x200000L;
                    }}
                if((dirtyFlags & 0x10aL) != 0) {
                    if (titleMediaObjectnull) {
                        dirtyFlags |= 0x40000L;
                    } else {
                        dirtyFlags |= 0x20000L;
                    }}
        }
        if ((dirtyFlags & 0x110L) != 0) {
        }
        if ((dirtyFlags & 0x120L) != 0) {

                if((dirtyFlags & 0x120L) != 0) {
                    if (hasFooter) {
                        dirtyFlags |= 0x1000L;
                    } else {
                        dirtyFlags |= 0x800L;
                    }}


                // read hasFooter ? View.VISIBLE : View.GONE
                hasFooterVISIBLEView = (hasFooter) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        if ((dirtyFlags & 0x140L) != 0) {
        }
        if ((dirtyFlags & 0x180L) != 0) {



                // read cover != null
                coverObjectnull = (cover) != (null);
                if((dirtyFlags & 0x180L) != 0) {
                    if (coverObjectnull) {
                        dirtyFlags |= 0x4000L;
                    } else {
                        dirtyFlags |= 0x2000L;
                    }}


                // read cover != null ? View.VISIBLE : View.GONE
                coverObjectnullVISIB = (coverObjectnull) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                if (item != null) {
                    // read item.mTitle
                    mTitleItem = item.mTitle;
                }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                // read TextUtils.isEmpty(media.artist)
                TextUtilsIsEmptyText2 = android.text.TextUtils.isEmpty(artistMedia);
        }
        if ((dirtyFlags & 0x10aL) != 0) {

                // read media.artist == null ? item.mSubTitle : media.artist
                ArtistMediaObjectnul1 = (artistMediaObjectnul) ? (mSubTitleItem) : (artistMedia);
        }

        if ((dirtyFlags & 0x10aL) != 0) {

                // read TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false
                textUtilsIsEmptyText = (TextUtilsIsEmptyText1) ? (TextUtilsIsEmptyText2) : (false);
                // read media.title == null ? item.mTitle : media.title
                TitleMediaObjectnull1 = (titleMediaObjectnull) ? (mTitleItem) : (titleMedia);
                if((dirtyFlags & 0x10aL) != 0) {
                    if (textUtilsIsEmptyText) {
                        dirtyFlags |= 0x100000L;
                    } else {
                        dirtyFlags |= 0x80000L;
                    }}


                // read TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false ? View.GONE : View.VISIBLE
                TextUtilsIsEmptyText3 = (textUtilsIsEmptyText) ? (android.view.View.GONE) : (android.view.View.VISIBLE);
        }
        // batch finished
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            this.footer.setVisibility(hasFooterVISIBLEView);
        }
        if ((dirtyFlags & 0x110L) != 0) {
            // api target 1

            this.itemMore.setTag(position);
        }
        if ((dirtyFlags & 0x101L) != 0) {
            // api target 1

            this.itemMore.setVisibility(clickableVISIBLEView);
        }
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)androidViewViewOnCli, clickable);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mediaCover, cover);
            this.mediaCover.setVisibility(coverObjectnullVISIB);
        }
        if ((dirtyFlags & 0x102L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.mediaCover, item);
        }
        if ((dirtyFlags & 0x10aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, ArtistMediaObjectnul1);
            this.subtitle.setVisibility(TextUtilsIsEmptyText3);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, TitleMediaObjectnull1);
        }
        if ((dirtyFlags & 0x140L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.UiTools.setAlignModeByPref(this.title, alignMode);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.interfaces.IAudioClickHandler value;
        public OnClickListenerImpl setValue(org.videolan.vlc.interfaces.IAudioClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioBrowserItemBinding>inflate(inflater, org.R.layout.audio_browser_item, root, attachToRoot, bindingComponent);
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.audio_browser_item, null, false), bindingComponent);
    }
    public static AudioBrowserItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_browser_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioBrowserItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): clickable
        flag 1 (0x2L): item
        flag 2 (0x3L): handler
        flag 3 (0x4L): media
        flag 4 (0x5L): position
        flag 5 (0x6L): hasFooter
        flag 6 (0x7L): alignMode
        flag 7 (0x8L): cover
        flag 8 (0x9L): null
        flag 9 (0xaL): TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false
        flag 10 (0xbL): TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false
        flag 11 (0xcL): hasFooter ? View.VISIBLE : View.GONE
        flag 12 (0xdL): hasFooter ? View.VISIBLE : View.GONE
        flag 13 (0xeL): cover != null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): cover != null ? View.VISIBLE : View.GONE
        flag 15 (0x10L): clickable ? View.VISIBLE : View.GONE
        flag 16 (0x11L): clickable ? View.VISIBLE : View.GONE
        flag 17 (0x12L): media.title == null ? item.mTitle : media.title
        flag 18 (0x13L): media.title == null ? item.mTitle : media.title
        flag 19 (0x14L): TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false ? View.GONE : View.VISIBLE
        flag 20 (0x15L): TextUtils.isEmpty(item.mSubTitle) ? TextUtils.isEmpty(media.artist) : false ? View.GONE : View.VISIBLE
        flag 21 (0x16L): media.artist == null ? item.mSubTitle : media.artist
        flag 22 (0x17L): media.artist == null ? item.mSubTitle : media.artist
    flag mapping end*/
    //end
}