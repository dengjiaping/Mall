package cn.wingene.mallxf.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cn.wingene.mall.util.RequestArgUtil;
import cn.wingene.mallxf.cacheData.UserData;
import cn.wingene.mallxf.nohttp.NoHttpRequest;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import junze.java.net.IHttpElement.IResponse;

import junze.androidxf.http.BaseCacheParamsRequest;
import junze.androidxf.http.BaseParamsRequest;
import junze.androidxf.http.BaseResponse;
import junze.androidxf.http.requestargs.ArgsResult;
import junze.androidxf.http.requestargs.RequestArgs;
import junze.androidxf.kit.AKit;

/**
 * Created by Wingene on 2017/5/23.
 */

public class Ask {
    public static class MyBaseResponse extends BaseResponse {
        public Integer err;
        public String msg;
        public String act;

        @Override
        protected void performatInitResponse(String strResponse) throws Exception {
            Result result = AKit.fromJson(strResponse, Result.class);
            err = result.err;
            msg = result.msg;
            act = result.act;
            if (err != null && err != 0) {
                if (err == -1) {
                    throw new NeedLoginException(msg);
                }
                throw new RuntimeException(msg);
            } initData(result.data);
        }

        protected void initData(JsonElement json) {

        }
    }

    public static class Result {
        Integer err;
        String msg;
        String act;
        JsonElement data;
    }

    public static class MyBaseCacheRequest<T extends IResponse> extends BaseCacheParamsRequest<T> {
        Map<String, Object> mMap;

        public MyBaseCacheRequest(String mUrl, T mResponse) {
            super(mUrl, mResponse);
            mMap = new HashMap<>();
        }

        @Override
        public Map<String, Object> getMap() throws Exception {
            ArgsResult result = RequestArgUtil.parseArgs(this);
            mMap.putAll(result.getParams());
            return mMap;
        }
    }

    public static class MyBaseRequest<T extends IResponse> extends BaseParamsRequest<T> {
        Map<String, Object> mMap;

        public MyBaseRequest(String mUrl, T mResponse) {
            super(mUrl, mResponse);
            mMap = new HashMap<>();
        }

        @Override
        public Map<String, Object> getMap() throws Exception {
            ArgsResult result = RequestArgUtil.parseArgs(this);
            mMap.putAll(result.getParams());
            return mMap;
        }
    }

    public static class BaseSignRequest<T extends IResponse> extends MyBaseRequest<T> {
        /**
         * 用户ID	不可 未登录 可为0
         */
        @RequestArgs
        @SerializedName("UserId")
        private Integer userId;

        /**
         * 设备类型	不可 0、网页 1、iOS  2、安卓
         */
        @RequestArgs
        @SerializedName("DeviceType")
        private Integer deviceType;

        /**
         * 设备Key	可空  极光推送用户Key
         */
        @RequestArgs
        @SerializedName("DeviceKey")
        private String deviceKey;

        /**
         * 登录验证码	可空
         */
        @RequestArgs
        @SerializedName("VerifiCode")
        private String verifiCode;

        /**
         * 时间戳10位	不可
         */
        @RequestArgs
        @SerializedName("TimeStamp")
        private Long timeStamp;

        /**
         * 签名	不可 详见1.1签名算法
         */
        // 手动添加到map中。
        @SerializedName("Sign")
        private String sign;

        public BaseSignRequest(String mUrl, T mResponse) {
            super(mUrl, mResponse);
            userId = UserData.getUserId();
            deviceType = 2;
            deviceKey = UserData.getDeviceKey();
            verifiCode = UserData.getverifiCode();
            timeStamp = System.currentTimeMillis() / 1000;
        }

        @Override
        public Map<String, Object> getMap() throws Exception {
            Map<String, Object> map = super.getMap();
            String[] params = new String[map.size()];
            int index = 0;
            for (Entry<String, Object> entry : map.entrySet()) {
                params[index++] = String.format("%s=%s", entry.getKey(), entry.getValue() != null ? entry.getValue
                        () : "");
            }
            sign = NoHttpRequest.signParams(params);
            map.put("Sign", sign);
            return map;
        }
    }

    public static class BaseCacheSignRequest<T extends IResponse> extends MyBaseCacheRequest<T> {
        /**
         * 用户ID	不可 未登录 可为0
         */
        @RequestArgs
        @SerializedName("UserId")
        private Integer userId;

        /**
         * 设备类型	不可 0、网页 1、iOS  2、安卓
         */
        @RequestArgs
        @SerializedName("DeviceType")
        private Integer deviceType;

        /**
         * 设备Key	可空  极光推送用户Key
         */
        @RequestArgs
        @SerializedName("DeviceKey")
        private String deviceKey;

        /**
         * 登录验证码	可空
         */
        @RequestArgs
        @SerializedName("VerifiCode")
        private String verifiCode;

        /**
         * 时间戳10位	不可
         */
        @RequestArgs
        @SerializedName("TimeStamp")
        private Long timeStamp;

        /**
         * 签名	不可 详见1.1签名算法
         */
        // 手动添加到map中。
        @SerializedName("Sign")
        private String sign;

        public BaseCacheSignRequest(String mUrl, T mResponse) {
            super(mUrl, mResponse);
            userId = UserData.getUserId();
            deviceType = 2;
            deviceKey = UserData.getDeviceKey();
            verifiCode = UserData.getverifiCode();
            timeStamp = System.currentTimeMillis() / 1000;
        }

        @Override
        public Map<String, Object> getMap() throws Exception {
            Map<String, Object> map = super.getMap();
            String[] params = new String[map.size()];
            int index = 0;
            for (Entry<String, Object> entry : map.entrySet()) {
                params[index++] = String.format("%s=%s", entry.getKey(), entry.getValue() != null ? entry.getValue
                        () : "");
            }
            sign = NoHttpRequest.signParams(params);
            map.put("Sign", sign);
            return map;
        }
    }

    public static class NeedLoginException extends RuntimeException {
        public NeedLoginException(String message) {
            super(message);
        }
    }
}
