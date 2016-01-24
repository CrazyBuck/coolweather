package app.coolweather.com.coolweather.util;

/**
 * Created by weifeng on 2016/1/20.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
