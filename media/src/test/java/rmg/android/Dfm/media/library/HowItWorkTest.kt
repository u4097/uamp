package rmg.android.Dfm.media.library
/**
 * Created by Oleg Sitnikov on 2019-01-01
 */


/**
 *  1. MusicService starts
 *
 *  2. It create new MediaSessions
 *
 *  3. Sets media sessions tocken
 *
 *  4. Create MediaController  and register it's callbacks
 *
 *  5. Create NotificationBuilder
 *
 *  6. Create MediaSessionConnector
 *
 *  7. Create ExoPlayer and pass it to MediaSessionConnector
 *
 *  8. Create MediaSessionConnector.PlaybackPreparer  and pass it to MediaSessionConnector
 *
 *  9. Override fun onPrepareFromMediaId(mediaId: String?, extras: Bundle?) method
 *
 *  ===========================================
 *
 *  1. Client Start
 *
 *  2. It create  MediaSessionConnection
 *
 *  3. MediaSessionConnection create MediaBrowserCompat and call connect method on it to connect to the MusicService
 *
 *  4. MediaBrowserConnectionCallback class: it listen onConnection callback from MusicService, when connected it create:
 *
 *  5. MediaControllerCompat with MediaControllerCallback where listen of MediaMetadata and PlaybackState
 *
 *  6.  MediaControllerCompat.TransportControls for control player state from UI
 *
 *  7. call subscribe  MediaBrowserCompat to listen for new MediaMetaData from onLoadChild method of MusicService
 *
 *
 *  When MediaBrowser call connect method it call method onGetRoot from MusicService and return BROWSER_ROOT
 *
 *  After that triggers rootMediaId LiveData in MainActivityViewModel
 *
 *  MainActivity observe it and triggers navigateToMediaItem(mediaId), it open MediaItemFragment with list of media child items
 *
 *  When MusicService call onLoadChildren it call method buildAlbum of BrowserTree which return clients as map of methadata
 *  in  subscriptionCallback of MediaBrowser
 *
 *  this metadata show in recycler view  of MediaFragment
 *
 *
 */

