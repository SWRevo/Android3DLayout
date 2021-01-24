# Android3DLayout

[![](https://jitpack.io/v/SWRevo/Android3DLayout.svg)](https://jitpack.io/#SWRevo/Android3DLayout)

This Library based on the original [florent37/Android-3D-Layout](https://github.com/florent37/Android-3D-Layout)

[![screen](https://raw.githubusercontent.com/florent37/Android-3D-Layout/master/medias/auto.gif)](https://www.github.com/florent37/Android-3D-Layout)

[![screen](https://raw.githubusercontent.com/florent37/Android-3D-Layout/master/medias/finger.gif)](https://www.github.com/florent37/Android-3D-Layout)


## Gradle

Add the following to your `build.gradle` to use:
```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.SWRevo:Android3DLayout:1.1.0'
}
```


## Usage

Define in xml:

```xml
<id.indosw.android3dlayout.container.DepthContainerRelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        >

        <id.indosw.android3dlayout.view.DepthRelativeLayout
            android:layout_width="150dp"
            android:layout_height="150dp"
            android:layout_centerInParent="true"
            app:depth_elevation="30dp"
            app:depth_value="25dp"
            app:depth_zIndex="0">

            <ImageView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:src="@drawable/homer"
                tools:ignore="ContentDescription" />

        </id.indosw.android3dlayout.view.DepthRelativeLayout>

    </id.indosw.android3dlayout.container.DepthContainerRelativeLayout>
```

Code:

```java
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FollowUserInputActivity extends AppCompatActivity {

    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_user_input);

        LinearLayout container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(6000);
        anim.setExitFadeDuration(2000);
    }


    // Starting animation:- start the animation on onResume.
    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    // Stopping animation:- stop the animation on onPause.
    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }
}

```

## License

    Copyright 2018 florent37

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


Fiches Plateau Moto : [https://www.fiches-plateau-moto.fr/](https://www.fiches-plateau-moto.fr/)
