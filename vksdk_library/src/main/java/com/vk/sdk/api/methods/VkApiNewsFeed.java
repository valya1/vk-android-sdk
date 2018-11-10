package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

public class VkApiNewsFeed extends VKApiBase {


    public VKRequest getNewsFeedForContestants(VKParameters params){
        return prepareRequest("getDiscoverForContestant", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "newsfeed";
    }
}
