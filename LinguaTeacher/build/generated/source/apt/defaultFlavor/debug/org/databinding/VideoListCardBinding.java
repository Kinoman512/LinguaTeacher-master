package org.databinding;
import org.R;
import org.BR;
import android.view.View;
public class VideoListCardBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.info_layout, 7);
    }
    // views
    public final android.widget.LinearLayout infoLayout;
    public final android.widget.ImageView itemMore;
    public final android.support.v7.widget.CardView layoutItem;
    public final android.widget.ProgressBar mlItemProgress;
    public final android.widget.TextView mlItemResolution;
    public final android.widget.ImageView mlItemThumbnail;
    public final android.widget.TextView mlItemTime;
    public final android.widget.TextView mlItemTitle;
    // variables
    private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder mHolder;
    private android.widget.ImageView.ScaleType mScaleType;
    private org.videolan.vlc.media.MediaWrapper mMedia;
    private int mMax;
    private int mProgress;
    private java.lang.String mTime;
    private java.lang.String mResolution;
    private android.graphics.drawable.BitmapDrawable mCover;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    // Inverse Binding Event Handlers

    public VideoListCardBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.infoLayout = (android.widget.LinearLayout) bindings[7];
        this.itemMore = (android.widget.ImageView) bindings[3];
        this.itemMore.setTag(null);
        this.layoutItem = (android.support.v7.widget.CardView) bindings[0];
        this.layoutItem.setTag(null);
        this.mlItemProgress = (android.widget.ProgressBar) bindings[6];
        this.mlItemProgress.setTag(null);
        this.mlItemResolution = (android.widget.TextView) bindings[5];
        this.mlItemResolution.setTag(null);
        this.mlItemThumbnail = (android.widget.ImageView) bindings[1];
        this.mlItemThumbnail.setTag(null);
        this.mlItemTime = (android.widget.TextView) bindings[4];
        this.mlItemTime.setTag(null);
        this.mlItemTitle = (android.widget.TextView) bindings[2];
        this.mlItemTitle.setTag(null);
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
            case BR.holder :
                setHolder((org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder) variable);
                return true;
            case BR.scaleType :
                setScaleType((android.widget.ImageView.ScaleType) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.vlc.media.MediaWrapper) variable);
                return true;
            case BR.max :
                setMax((int) variable);
                return true;
            case BR.progress :
                setProgress((int) variable);
                return true;
            case BR.time :
                setTime((java.lang.String) variable);
                return true;
            case BR.resolution :
                setResolution((java.lang.String) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
        }
        return false;
    }

    public void setHolder(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder holder) {
        this.mHolder = holder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.mScaleType = scaleType;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.scaleType);
        super.requestRebind();
    }
    public android.widget.ImageView.ScaleType getScaleType() {
        return mScaleType;
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
    public void setMax(int max) {
        this.mMax = max;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.max);
        super.requestRebind();
    }
    public int getMax() {
        return mMax;
    }
    public void setProgress(int progress) {
        this.mProgress = progress;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public int getProgress() {
        return mProgress;
    }
    public void setTime(java.lang.String time) {
        this.mTime = time;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.time);
        super.requestRebind();
    }
    public java.lang.String getTime() {
        return mTime;
    }
    public void setResolution(java.lang.String resolution) {
        this.mResolution = resolution;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.resolution);
        super.requestRebind();
    }
    public java.lang.String getResolution() {
        return mResolution;
    }
    public void setCover(android.graphics.drawable.BitmapDrawable cover) {
        this.mCover = cover;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
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
            case 0 :
                return onChangeBindingHolde((android.databinding.ViewDataBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBindingHolde(android.databinding.ViewDataBinding bindingHolder, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
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
        int maxInt0INVISIBLEView = 0;
        java.lang.String titleMedia = null;
        org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder holder = mHolder;
        android.widget.ImageView.ScaleType scaleType = mScaleType;
        boolean maxInt0 = false;
        org.videolan.vlc.media.MediaWrapper media = mMedia;
        int max = mMax;
        int progress = mProgress;
        java.lang.String time = mTime;
        java.lang.String resolution = mResolution;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;
        android.databinding.ViewDataBinding bindingHolder = null;

        if ((dirtyFlags & 0x20bL) != 0) {


            if ((dirtyFlags & 0x202L) != 0) {

                    if (holder != null) {
                        // read holder::onMoreClick
                        androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(holder));
                        // read holder::onClick
                        androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(holder));
                    }
            }

                if (holder != null) {
                    // read holder.binding
                    bindingHolder = holder.binding;
                }
                updateRegistration(0, bindingHolder);
            if ((dirtyFlags & 0x208L) != 0) {

                    if (media != null) {
                        // read media.title
                        titleMedia = media.getTitle();
                    }
            }
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x210L) != 0) {



                // read max == 0
                maxInt0 = (max) == (0);
                if((dirtyFlags & 0x210L) != 0) {
                    if (maxInt0) {
                        dirtyFlags |= 0x800L;
                    } else {
                        dirtyFlags |= 0x400L;
                    }}


                // read max == 0 ? View.INVISIBLE : View.VISIBLE
                maxInt0INVISIBLEView = (maxInt0) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE);
        }
        if ((dirtyFlags & 0x220L) != 0) {
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x300L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(androidViewViewOnCli);
            this.layoutItem.setOnClickListener(androidViewViewOnCli1);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            this.mlItemProgress.setMax(max);
            this.mlItemProgress.setVisibility(maxInt0INVISIBLEView);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            this.mlItemProgress.setProgress(progress);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemResolution, resolution);
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            this.mlItemThumbnail.setScaleType(scaleType);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mlItemThumbnail, cover);
        }
        if ((dirtyFlags & 0x20bL) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.mlItemThumbnail, media, bindingHolder);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTime, time);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTitle, titleMedia);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
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

    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VideoListCardBinding>inflate(inflater, org.R.layout.video_list_card, root, attachToRoot, bindingComponent);
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.R.layout.video_list_card, null, false), bindingComponent);
    }
    public static VideoListCardBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/video_list_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VideoListCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): holder.binding
        flag 1 (0x2L): holder
        flag 2 (0x3L): scaleType
        flag 3 (0x4L): media
        flag 4 (0x5L): max
        flag 5 (0x6L): progress
        flag 6 (0x7L): time
        flag 7 (0x8L): resolution
        flag 8 (0x9L): cover
        flag 9 (0xaL): null
        flag 10 (0xbL): max == 0 ? View.INVISIBLE : View.VISIBLE
        flag 11 (0xcL): max == 0 ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}