# youtube4kidz.androidtv
The Android TV app for videos from youtube4kidz.gcpappengine repo



# Release

### Preparations:
 - Add a keystore named "android.javakeystore.keystore.jks" to the project folder.
 - Add a file ~\.gradle\gradle.properties and add the following to this file
 
 
```
RELEASE_STORE_FILE=..\\android.javakeystore.keystore.jks
RELEASE_STORE_PASSWORD=YOURPASS
RELEASE_KEY_ALIAS=YOURKEYNAME_LIKE_key0
RELEASE_KEY_PASSWORD=YOURPASS
```


Execute the release command
```
gradle assembleRelease
```

The aok will be located in `youtube4kidz.androidtv\app\build\outputs\apk\release\app-release.apk`
