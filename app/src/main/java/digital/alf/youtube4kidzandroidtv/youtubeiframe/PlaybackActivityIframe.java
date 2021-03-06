/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package digital.alf.youtube4kidzandroidtv.youtubeiframe;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import digital.alf.youtube4kidzandroidtv.Movie;
import fr.bmartel.youtubetv.YoutubeTvFragment;

public class PlaybackActivityIframe extends FragmentActivity {
    public static final String SHARED_ELEMENT_NAME = "hero";
    public static final String MOVIE = "Movie";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Movie movie =
                (Movie) getIntent().getSerializableExtra(PlaybackActivityIframe.MOVIE);

        Bundle args = new Bundle();
        args.putString("videoId", movie.getYoutubeId());
        args.putString("videoQuality", "hd1080");
        args.putString("autoplay", "true");
        args.putString("videoAnnotation", "false");

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(android.R.id.content, YoutubeTvFragment.newInstance(args))
                    .commit();
        }
    }
}