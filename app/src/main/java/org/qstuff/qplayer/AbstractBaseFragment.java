package org.qstuff.qplayer;



import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.squareup.otto.Bus;

import javax.inject.Inject;

/**
 * Created by Claus Chierici (chierici@karlmax-berlin.com) on 4/16/15
 * for Karlmax Berlin GmbH & Co. KG
 * <p/>
 * Copyright (C) 2014 Karlmax Berlin GmbH & Co. KG, All rights reserved.
 */
public class AbstractBaseFragment extends Fragment {

    @Inject protected Bus bus;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bus = new Bus();
    }

    @Override
    public void onResume() {
        super.onResume();
        bus.register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        bus.unregister(this);
    }

    protected void onEvent() {

    }

}
