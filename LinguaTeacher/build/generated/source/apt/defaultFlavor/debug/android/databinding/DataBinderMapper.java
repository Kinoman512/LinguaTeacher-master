
package android.databinding;
import org.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 19;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case org.R.layout.video_list_card:
                    return org.databinding.VideoListCardBinding.bind(view, bindingComponent);
                case org.R.layout.list_item:
                    return org.databinding.ListItemBinding.bind(view, bindingComponent);
                case org.R.layout.video_grid_card:
                    return org.databinding.VideoGridCardBinding.bind(view, bindingComponent);
                case org.R.layout.browser_item_separator:
                    return org.databinding.BrowserItemSeparatorBinding.bind(view, bindingComponent);
                case org.R.layout.extension_item_view:
                    return org.databinding.ExtensionItemViewBinding.bind(view, bindingComponent);
                case org.R.layout.vlc_login_dialog:
                    return org.databinding.VlcLoginDialogBinding.bind(view, bindingComponent);
                case org.R.layout.directory_view_item:
                    return org.databinding.DirectoryViewItemBinding.bind(view, bindingComponent);
                case org.R.layout.playlist_item:
                    return org.databinding.PlaylistItemBinding.bind(view, bindingComponent);
                case org.R.layout.vlc_progress_dialog:
                    return org.databinding.VlcProgressDialogBinding.bind(view, bindingComponent);
                case org.R.layout.vlc_question_dialog:
                    return org.databinding.VlcQuestionDialogBinding.bind(view, bindingComponent);
                case org.R.layout.audio_browser_separator:
                    return org.databinding.AudioBrowserSeparatorBinding.bind(view, bindingComponent);
                case org.R.layout.audio_browser_item:
                    return org.databinding.AudioBrowserItemBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -867279847: {
                if(tag.equals("layout/video_list_card_0")) {
                    return org.R.layout.video_list_card;
                }
                break;
            }
            case -739838624: {
                if(tag.equals("layout/list_item_0")) {
                    return org.R.layout.list_item;
                }
                break;
            }
            case 833401969: {
                if(tag.equals("layout/video_grid_card_0")) {
                    return org.R.layout.video_grid_card;
                }
                break;
            }
            case 674149798: {
                if(tag.equals("layout/browser_item_separator_0")) {
                    return org.R.layout.browser_item_separator;
                }
                break;
            }
            case 1440931485: {
                if(tag.equals("layout/extension_item_view_0")) {
                    return org.R.layout.extension_item_view;
                }
                break;
            }
            case 609402918: {
                if(tag.equals("layout/vlc_login_dialog_0")) {
                    return org.R.layout.vlc_login_dialog;
                }
                break;
            }
            case -1882529561: {
                if(tag.equals("layout/directory_view_item_0")) {
                    return org.R.layout.directory_view_item;
                }
                break;
            }
            case -1561895892: {
                if(tag.equals("layout/playlist_item_0")) {
                    return org.R.layout.playlist_item;
                }
                break;
            }
            case 1784601684: {
                if(tag.equals("layout/vlc_progress_dialog_0")) {
                    return org.R.layout.vlc_progress_dialog;
                }
                break;
            }
            case 1448886971: {
                if(tag.equals("layout/vlc_question_dialog_0")) {
                    return org.R.layout.vlc_question_dialog;
                }
                break;
            }
            case 774895153: {
                if(tag.equals("layout/audio_browser_separator_0")) {
                    return org.R.layout.audio_browser_separator;
                }
                break;
            }
            case -1443691447: {
                if(tag.equals("layout/audio_browser_item_0")) {
                    return org.R.layout.audio_browser_item;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"alignMode"
            ,"checkEnabled"
            ,"checked"
            ,"clickable"
            ,"cover"
            ,"dialog"
            ,"handler"
            ,"hasContextMenu"
            ,"hasFooter"
            ,"holder"
            ,"image"
            ,"item"
            ,"max"
            ,"media"
            ,"position"
            ,"progress"
            ,"protocol"
            ,"resolution"
            ,"scaleType"
            ,"storage"
            ,"subTitle"
            ,"time"
            ,"title"
            ,"titleColor"
            ,"type"};
    }
}