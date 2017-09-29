package cn.wingene.mallxm.display.home.firstMenu.data;

import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by wangcq on 2017/8/22.
 */

public class RecommendModel {

    /**
     * err : 0
     * msg : 鑾峰彇閫氱敤鍟嗗煄棣栭〉鎴愬姛
     * act : null
     * data : {"HeadMenuList":[{"Type":1,"Title":"鎺ㄨ崘","Param":"","OrderIndex":1},{"Type":2,"Title":"澶╁ぉ鐗逛环",
     * "Param":"","OrderIndex":2},{"Type":3,"Title":"鏂板搧","Param":"","OrderIndex":3},{"Type":20,"Title":"灞呭",
     * "Param":"A1","OrderIndex":4},{"Type":20,"Title":"闆堕","Param":"A2","OrderIndex":5},{"Type":20,"Title":"缇庡",
     * "Param":"A3","OrderIndex":6},{"Type":20,"Title":"鏈嶉グ","Param":"A4","OrderIndex":7},{"Type":20,"Title":"娲楁姢",
     * "Param":"A5","OrderIndex":8},{"Type":20,"Title":"鎴峰","Param":"A6","OrderIndex":9},{"Type":20,"Title":"鐢电珵",
     * "Param":"A7","OrderIndex":10},{"Type":20,"Title":"杞︾敤","Param":"A8","OrderIndex":11}],
     * "BannerList":[{"Image":"http://img.usoft100.com/upload/image/20170818/1503025419497527.jpg",
     * "Title":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","Type":30,"Param":"3","OrderIndex":1},
     * {"Image":"http://img.usoft100.com/upload/image/20170818/1503025413756160.jpg","Title":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","Type":30,"Param":"2","OrderIndex":2}],"Brand":{"Image":"http://img
     * .usoft100.com/upload/image/20170815/1502786357708628.png","Title":"鍝佺墝澶у巶鐩翠緵","Type":4,"Param":"tant",
     * "OrderIndex":10,"ProductList":[{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
     * "SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"}]},
     * "New":{"Image":"http://img.usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"姣忓懆鏂板搧","Type":0,
     * "Param":"","OrderIndex":11,"ProductList":[{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
     * "SellingPoint":"濂戒骇鍝�"},{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":0,
     * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧4",
     * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧5","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧6","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧7","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧8","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]},"Recommend":{"Image":"http://img
     * .usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"浜烘皵鎺ㄨ崘","Type":0,"Param":"","OrderIndex":12,
     * "ProductList":[{"ProductId":0,"ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg",
     * "ProductName":"鍟嗗搧1","ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,
     * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧2",
     * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]},"Specials":{"Image":"http://img
     * .usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"澶╁ぉ鐗逛环","Type":0,"Param":"","OrderIndex":13,
     * "ProductList":[{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":2,
     * "ProductImage":"http://img.usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg",
     * "ProductName":"鑺辫姳鍏瓙 T鎭� 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂戒骇鍝�"},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]},"Like":{"Image":"http://img
     * .usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"鐚滀綘鍠滄","Type":0,"Param":"","OrderIndex":14,
     * "ProductList":[{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":2,
     * "ProductImage":"http://img.usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg",
     * "ProductName":"鑺辫姳鍏瓙 T鎭� 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null}]}}
     */

    private int err;
    private String msg;
    private Object act;
    /**
     * HeadMenuList : [{"Type":1,"Title":"鎺ㄨ崘","Param":"","OrderIndex":1},{"Type":2,"Title":"澶╁ぉ鐗逛环","Param":"",
     * "OrderIndex":2},{"Type":3,"Title":"鏂板搧","Param":"","OrderIndex":3},{"Type":20,"Title":"灞呭","Param":"A1",
     * "OrderIndex":4},{"Type":20,"Title":"闆堕","Param":"A2","OrderIndex":5},{"Type":20,"Title":"缇庡","Param":"A3",
     * "OrderIndex":6},{"Type":20,"Title":"鏈嶉グ","Param":"A4","OrderIndex":7},{"Type":20,"Title":"娲楁姢","Param":"A5",
     * "OrderIndex":8},{"Type":20,"Title":"鎴峰","Param":"A6","OrderIndex":9},{"Type":20,"Title":"鐢电珵","Param":"A7",
     * "OrderIndex":10},{"Type":20,"Title":"杞︾敤","Param":"A8","OrderIndex":11}]
     * BannerList : [{"Image":"http://img.usoft100.com/upload/image/20170818/1503025419497527.jpg",
     * "Title":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","Type":30,"Param":"3","OrderIndex":1},
     * {"Image":"http://img.usoft100.com/upload/image/20170818/1503025413756160.jpg","Title":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","Type":30,"Param":"2","OrderIndex":2}]
     * Brand : {"Image":"http://img.usoft100.com/upload/image/20170815/1502786357708628.png","Title":"鍝佺墝澶у巶鐩翠緵",
     * "Type":4,"Param":"tant","OrderIndex":10,"ProductList":[{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
     * "SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"}]}
     * New : {"Image":"http://img.usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"姣忓懆鏂板搧","Type":0,
     * "Param":"","OrderIndex":11,"ProductList":[{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
     * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
     * "SellingPoint":"濂戒骇鍝�"},{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":0,
     * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧4",
     * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧5","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧6","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧7","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧8","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]}
     * Recommend : {"Image":"http://img.usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"浜烘皵鎺ㄨ崘",
     * "Type":0,"Param":"","OrderIndex":12,"ProductList":[{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧1","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧2","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]}
     * Specials : {"Image":"http://img.usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"澶╁ぉ鐗逛环",
     * "Type":0,"Param":"","OrderIndex":13,"ProductList":[{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":2,
     * "ProductImage":"http://img.usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg",
     * "ProductName":"鑺辫姳鍏瓙 T鎭� 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂戒骇鍝�"},{"ProductId":0,"ProductImage":"http://img
     * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
     * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]}
     * Like : {"Image":"http://img.usoft100.com//Content/Images/Default/pic420x200.jpg","Title":"鐚滀綘鍠滄","Type":0,
     * "Param":"","OrderIndex":14,"ProductList":[{"ProductId":1,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
     * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},{"ProductId":2,
     * "ProductImage":"http://img.usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg",
     * "ProductName":"鑺辫姳鍏瓙 T鎭� 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
     * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
     * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
     * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null}]}
     */

    private DataBean data;

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getAct() {
        return act;
    }

    public void setAct(Object act) {
        this.act = act;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * Image : http://img.usoft100.com/upload/image/20170815/1502786357708628.png
         * Title : 鍝佺墝澶у巶鐩翠緵
         * Type : 4
         * Param : tant
         * OrderIndex : 10
         * ProductList : [{"ProductId":3,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
         * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
         * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
         * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
         * "SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
         * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
         * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":1,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
         * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"}]
         */

        private BrandBean Brand;
        /**
         * Image : http://img.usoft100.com//Content/Images/Default/pic420x200.jpg
         * Title : 姣忓懆鏂板搧
         * Type : 0
         * Param :
         * OrderIndex : 11
         * ProductList : [{"ProductId":3,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
         * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
         * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null},{"ProductId":2,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
         * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
         * "SellingPoint":"濂戒骇鍝�"},{"ProductId":1,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
         * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},
         * {"ProductId":0,"ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg",
         * "ProductName":"鍟嗗搧4","ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,
         * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧5",
         * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,
         * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧6",
         * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,
         * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧7",
         * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,
         * "ProductImage":"http://img.usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧8",
         * "ProductPrice":0,"ProductOldPrice":0,"Tag":null,"SellingPoint":null}]
         */

        private NewBean New;
        /**
         * Image : http://img.usoft100.com//Content/Images/Default/pic420x200.jpg
         * Title : 浜烘皵鎺ㄨ崘
         * Type : 0
         * Param :
         * OrderIndex : 12
         * ProductList : [{"ProductId":0,"ProductImage":"http://img
         * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧1","ProductPrice":0,
         * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
         * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧2","ProductPrice":0,
         * "ProductOldPrice":0,"Tag":null,"SellingPoint":null},{"ProductId":0,"ProductImage":"http://img
         * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
         * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]
         */

        private RecommendBean Recommend;
        /**
         * Image : http://img.usoft100.com//Content/Images/Default/pic420x200.jpg
         * Title : 澶╁ぉ鐗逛环
         * Type : 0
         * Param :
         * OrderIndex : 13
         * ProductList : [{"ProductId":1,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
         * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},
         * {"ProductId":2,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
         * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
         * "SellingPoint":"濂戒骇鍝�"},{"ProductId":0,"ProductImage":"http://img
         * .usoft100.com//Content/Images/Default/pic150x150.jpg","ProductName":"鍟嗗搧3","ProductPrice":0,
         * "ProductOldPrice":0,"Tag":null,"SellingPoint":null}]
         */

        private SpecialsBean Specials;
        /**
         * Image : http://img.usoft100.com//Content/Images/Default/pic420x200.jpg
         * Title : 鐚滀綘鍠滄
         * Type : 0
         * Param :
         * OrderIndex : 14
         * ProductList : [{"ProductId":1,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg","ProductName":"鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓
         * 浼戦棽瑁呴煩鐗� 绔嬮鐢疯","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒","SellingPoint":"濂藉悆"},
         * {"ProductId":2,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766357148814_300X300.jpg","ProductName":"鑺辫姳鍏瓙 T鎭�
         * 鐢疯2017澶忓鏂版鐢峰＋浼戦棽鍗婅涓婅。绾琛ｆ湇鐭T鎭�","ProductPrice":1,"ProductOldPrice":1,"Tag":"鐖嗗搧,婊¤禒",
         * "SellingPoint":"濂戒骇鍝�"},{"ProductId":3,"ProductImage":"http://img
         * .usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg",
         * "ProductName":"闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448","ProductPrice":2,"ProductOldPrice":10,
         * "Tag":"鐖嗗搧,婊¤禒","SellingPoint":null}]
         */

        private LikeBean Like;
        /**
         * Type : 1
         * Title : 鎺ㄨ崘
         * Param :
         * OrderIndex : 1
         */

        private List<HeadMenuListBean> HeadMenuList;
        /**
         * Image : http://img.usoft100.com/upload/image/20170818/1503025419497527.jpg
         * Title : 闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448
         * Type : 30
         * Param : 3
         * OrderIndex : 1
         */

        private List<BannerListBean> BannerList;

        public BrandBean getBrand() {
            return Brand;
        }

        public void setBrand(BrandBean Brand) {
            this.Brand = Brand;
        }

        public NewBean getNew() {
            return New;
        }

        public void setNew(NewBean New) {
            this.New = New;
        }

        public RecommendBean getRecommend() {
            return Recommend;
        }

        public void setRecommend(RecommendBean Recommend) {
            this.Recommend = Recommend;
        }

        public SpecialsBean getSpecials() {
            return Specials;
        }

        public void setSpecials(SpecialsBean Specials) {
            this.Specials = Specials;
        }

        public LikeBean getLike() {
            return Like;
        }

        public void setLike(LikeBean Like) {
            this.Like = Like;
        }

        public List<HeadMenuListBean> getHeadMenuList() {
            return HeadMenuList;
        }

        public void setHeadMenuList(List<HeadMenuListBean> HeadMenuList) {
            this.HeadMenuList = HeadMenuList;
        }

        public List<BannerListBean> getBannerList() {
            return BannerList;
        }

        public void setBannerList(List<BannerListBean> BannerList) {
            this.BannerList = BannerList;
        }

        public static class BrandBean {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private String OrderIndex;
            /**
             * ProductId : 3
             * ProductImage : http://img.usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg
             * ProductName : 闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448
             * ProductPrice : 2
             * ProductOldPrice : 10
             * Tag : 鐖嗗搧,婊¤禒
             * SellingPoint : null
             */

            private List<ProductListBean> ProductList;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public String getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(String OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            public List<ProductListBean> getProductList() {
                return ProductList;
            }

            public void setProductList(List<ProductListBean> ProductList) {
                this.ProductList = ProductList;
            }

            public static class ProductListBean implements IProductItem{
                private int ProductId;
                private String ProductImage;
                private String ProductName;
                private double ProductPrice;
                private double ProductOldPrice;
                private String Tag;
                private String SellingPoint;
                private String AcceptIntegral;

                public String getAcceptIntegral() {
                    return AcceptIntegral != null && !AcceptIntegral.isEmpty() ? AcceptIntegral : "" ;
                }

                public void setAcceptIntegral(String acceptIntegral) {
                    AcceptIntegral = acceptIntegral;
                }

                public int getProductId() {
                    return ProductId;
                }

                public void setProductId(int ProductId) {
                    this.ProductId = ProductId;
                }

                public String getProductImage() {
                    return ProductImage;
                }

                public void setProductImage(String ProductImage) {
                    this.ProductImage = ProductImage;
                }

                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                public double getProductPrice() {
                    return ProductPrice;
                }

                public void setProductPrice(double ProductPrice) {
                    this.ProductPrice = ProductPrice;
                }

                public double getProductOldPrice() {
                    return ProductOldPrice;
                }

                public void setProductOldPrice(double ProductOldPrice) {
                    this.ProductOldPrice = ProductOldPrice;
                }

                public String getTag() {
                    return Tag != null ? Tag : "";
                }

                public void setTag(String Tag) {
                    this.Tag = Tag;
                }

                public String getSellingPoint() {
                    return SellingPoint;
                }

                public void setSellingPoint(String SellingPoint) {
                    this.SellingPoint = SellingPoint;
                }
            }
        }

        public static class NewBean {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private int OrderIndex;
            /**
             * ProductId : 3
             * ProductImage : http://img.usoft100.com/upload/image/20170815/s_1502766942430946_300X300.jpg
             * ProductName : 闊╅兘琛ｈ垗2017澶忚鏂版闊╃増瑁ゅ瓙瀹芥澗鍝堜鸡瑁よ繍鍔ㄩ暱瑁ゅコ浼戦棽瑁Y5448
             * ProductPrice : 2
             * ProductOldPrice : 10
             * Tag : 鐖嗗搧,婊¤禒
             * SellingPoint : null
             */

            private List<ProductListBean> ProductList;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            public List<ProductListBean> getProductList() {
                return ProductList;
            }

            public void setProductList(List<ProductListBean> ProductList) {
                this.ProductList = ProductList;
            }

            public static class ProductListBean implements IProductItem {
                private int ProductId;
                private String ProductImage;
                private String ProductName;
                private double ProductPrice;
                private double ProductOldPrice;
                private String Tag;
                private String SellingPoint;
                private String AcceptIntegral;

                public String getAcceptIntegral() {
                    return AcceptIntegral != null && !AcceptIntegral.isEmpty() ? AcceptIntegral : "" ;
                }

                public void setAcceptIntegral(String acceptIntegral) {
                    AcceptIntegral = acceptIntegral;
                }

                public int getProductId() {
                    return ProductId;
                }

                public void setProductId(int ProductId) {
                    this.ProductId = ProductId;
                }

                public String getProductImage() {
                    return ProductImage;
                }

                public void setProductImage(String ProductImage) {
                    this.ProductImage = ProductImage;
                }

                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                public double getProductPrice() {
                    return ProductPrice;
                }

                public void setProductPrice(double ProductPrice) {
                    this.ProductPrice = ProductPrice;
                }

                public double getProductOldPrice() {
                    return ProductOldPrice;
                }

                public void setProductOldPrice(double ProductOldPrice) {
                    this.ProductOldPrice = ProductOldPrice;
                }

                public String getTag() {
                    return Tag != null ? Tag : "";
                }

                public void setTag(String Tag) {
                    this.Tag = Tag;
                }

                public String getSellingPoint() {
                    return SellingPoint;
                }

                public void setSellingPoint(String SellingPoint) {
                    this.SellingPoint = SellingPoint;
                }
            }
        }

        public static class RecommendBean {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private int OrderIndex;
            /**
             * ProductId : 0
             * ProductImage : http://img.usoft100.com//Content/Images/Default/pic150x150.jpg
             * ProductName : 鍟嗗搧1
             * ProductPrice : 0
             * ProductOldPrice : 0
             * Tag : null
             * SellingPoint : null
             */

            private List<ProductListBean> ProductList;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            public List<ProductListBean> getProductList() {
                return ProductList;
            }

            public void setProductList(List<ProductListBean> ProductList) {
                this.ProductList = ProductList;
            }

            public static class ProductListBean implements IProductItem, Parcelable {
                private int ProductId;
                private String ProductImage;
                private String ProductName;
                private double ProductPrice;
                private double ProductOldPrice;
                private String Tag;
                private String SellingPoint;
                private String AcceptIntegral;

                public String getAcceptIntegral() {
                    return AcceptIntegral != null && !AcceptIntegral.isEmpty() ? AcceptIntegral : "" ;
                }

                public void setAcceptIntegral(String acceptIntegral) {
                    AcceptIntegral = acceptIntegral;
                }

                public int getProductId() {
                    return ProductId;
                }

                public void setProductId(int ProductId) {
                    this.ProductId = ProductId;
                }

                public String getProductImage() {
                    return ProductImage;
                }

                public void setProductImage(String ProductImage) {
                    this.ProductImage = ProductImage;
                }

                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                public double getProductPrice() {
                    return ProductPrice;
                }

                public void setProductPrice(double ProductPrice) {
                    this.ProductPrice = ProductPrice;
                }

                public double getProductOldPrice() {
                    return ProductOldPrice;
                }

                public void setProductOldPrice(double ProductOldPrice) {
                    this.ProductOldPrice = ProductOldPrice;
                }

                public String getTag() {
                     return Tag != null ? Tag : "";
                }

                public void setTag(String Tag) {
                    this.Tag = Tag;
                }

                public String getSellingPoint() {
                    return SellingPoint;
                }

                public void setSellingPoint(String SellingPoint) {
                    this.SellingPoint = SellingPoint;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.ProductId);
                    dest.writeString(this.ProductImage);
                    dest.writeString(this.ProductName);
                    dest.writeDouble(this.ProductPrice);
                    dest.writeDouble(this.ProductOldPrice);
                    dest.writeString(this.Tag);
                    dest.writeString(this.SellingPoint);
                    dest.writeString(this.AcceptIntegral);
                }

                public ProductListBean() {
                }

                protected ProductListBean(Parcel in) {
                    this.ProductId = in.readInt();
                    this.ProductImage = in.readString();
                    this.ProductName = in.readString();
                    this.ProductPrice = in.readDouble();
                    this.ProductOldPrice = in.readDouble();
                    this.Tag = in.readString();
                    this.SellingPoint = in.readString();
                    this.AcceptIntegral = in.readString();
                }

                public static final Parcelable.Creator<ProductListBean> CREATOR = new Parcelable.Creator<ProductListBean>() {
                    @Override
                    public ProductListBean createFromParcel(Parcel source) {
                        return new ProductListBean(source);
                    }

                    @Override
                    public ProductListBean[] newArray(int size) {
                        return new ProductListBean[size];
                    }
                };
            }
        }

        public static class SpecialsBean {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private int OrderIndex;
            /**
             * ProductId : 1
             * ProductImage : http://img.usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg
             * ProductName : 鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓 浼戦棽瑁呴煩鐗� 绔嬮鐢疯
             * ProductPrice : 1
             * ProductOldPrice : 1
             * Tag : 鐖嗗搧,婊¤禒
             * SellingPoint : 濂藉悆
             */

            private List<ProductListBean> ProductList;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            public List<ProductListBean> getProductList() {
                return ProductList;
            }

            public void setProductList(List<ProductListBean> ProductList) {
                this.ProductList = ProductList;
            }

            public static class ProductListBean implements IProductItem{
                private int ProductId;
                private String ProductImage;
                private String ProductName;
                private double ProductPrice;
                private double ProductOldPrice;
                private String Tag;
                private String SellingPoint;
                private String AcceptIntegral;

                public String getAcceptIntegral() {
                    return AcceptIntegral != null && !AcceptIntegral.isEmpty() ? AcceptIntegral : "" ;
                }

                public void setAcceptIntegral(String acceptIntegral) {
                    AcceptIntegral = acceptIntegral;
                }

                public int getProductId() {
                    return ProductId;
                }

                public void setProductId(int ProductId) {
                    this.ProductId = ProductId;
                }

                public String getProductImage() {
                    return ProductImage;
                }

                public void setProductImage(String ProductImage) {
                    this.ProductImage = ProductImage;
                }

                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                public double getProductPrice() {
                    return ProductPrice;
                }

                public void setProductPrice(double ProductPrice) {
                    this.ProductPrice = ProductPrice;
                }

                public double getProductOldPrice() {
                    return ProductOldPrice;
                }

                public void setProductOldPrice(double ProductOldPrice) {
                    this.ProductOldPrice = ProductOldPrice;
                }

                public String getTag() {
                    return Tag != null ? Tag : "";
                }

                public void setTag(String Tag) {
                    this.Tag = Tag;
                }

                public String getSellingPoint() {
                    return SellingPoint;
                }

                public void setSellingPoint(String SellingPoint) {
                    this.SellingPoint = SellingPoint;
                }
            }
        }

        public static class LikeBean {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private int OrderIndex;
            /**
             * ProductId : 1
             * ProductImage : http://img.usoft100.com/upload/image/20170815/s_1502766155031239_300X300.jpg
             * ProductName : 鎴樺湴鍚夋櫘 鐭T鎭ょ敺 2017澶忓 浼戦棽瑁呴煩鐗� 绔嬮鐢疯
             * ProductPrice : 1
             * ProductOldPrice : 1
             * Tag : 鐖嗗搧,婊¤禒
             * SellingPoint : 濂藉悆
             */

            private List<ProductListBean> ProductList;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            public List<ProductListBean> getProductList() {
                return ProductList;
            }

            public void setProductList(List<ProductListBean> ProductList) {
                this.ProductList = ProductList;
            }

            public static class ProductListBean implements IProductItem {
                private int ProductId;
                private String ProductImage;
                private String ProductName;
                private double ProductPrice;
                private double ProductOldPrice;
                private String Tag;
                private String SellingPoint;
                private String AcceptIntegral;

                @Override
                public String getAcceptIntegral() {
                    return AcceptIntegral != null && !AcceptIntegral.isEmpty() ? AcceptIntegral : "" ;
                }

                public void setAcceptIntegral(String acceptIntegral) {
                    AcceptIntegral = acceptIntegral;
                }

                @Override
                public int getProductId() {
                    return ProductId;
                }

                public void setProductId(int ProductId) {
                    this.ProductId = ProductId;
                }

                @Override
                public String getProductImage() {
                    return ProductImage;
                }

                public void setProductImage(String ProductImage) {
                    this.ProductImage = ProductImage;
                }

                @Override
                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                @Override
                public double getProductPrice() {
                    return ProductPrice;
                }

                public void setProductPrice(double ProductPrice) {
                    this.ProductPrice = ProductPrice;
                }

                @Override
                public double getProductOldPrice() {
                    return ProductOldPrice;
                }

                public void setProductOldPrice(int ProductOldPrice) {
                    this.ProductOldPrice = ProductOldPrice;
                }

                @Override
                public String getTag() {
                    return Tag != null ? Tag : "";
                }

                public void setTag(String Tag) {
                    this.Tag = Tag;
                }

                @Override
                public String getSellingPoint() {
                    return SellingPoint;
                }

                public void setSellingPoint(String SellingPoint) {
                    this.SellingPoint = SellingPoint;
                }
            }
        }

        public static class HeadMenuListBean implements Comparable<HeadMenuListBean>,Parcelable {
            private String Type;
            private String Title;
            private String Param;
            private int OrderIndex;

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }


            @Override
            public int compareTo(@NonNull HeadMenuListBean other) {
                return this.getOrderIndex() > other.getOrderIndex() ? 1 : -1;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.Type);
                dest.writeString(this.Title);
                dest.writeString(this.Param);
                dest.writeInt(this.OrderIndex);
            }

            public HeadMenuListBean() {
            }

            protected HeadMenuListBean(Parcel in) {
                this.Type = in.readString();
                this.Title = in.readString();
                this.Param = in.readString();
                this.OrderIndex = in.readInt();
            }

            public static final Parcelable.Creator<HeadMenuListBean> CREATOR = new Parcelable.Creator<HeadMenuListBean>() {
                @Override
                public HeadMenuListBean createFromParcel(Parcel source) {
                    return new HeadMenuListBean(source);
                }

                @Override
                public HeadMenuListBean[] newArray(int size) {
                    return new HeadMenuListBean[size];
                }
            };
        }

        public static class BannerListBean implements Comparable<BannerListBean>,Parcelable {
            private String Image;
            private String Title;
            private String Type;
            private String Param;
            private int OrderIndex;

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getParam() {
                return Param;
            }

            public void setParam(String Param) {
                this.Param = Param;
            }

            public int getOrderIndex() {
                return OrderIndex;
            }

            public void setOrderIndex(int OrderIndex) {
                this.OrderIndex = OrderIndex;
            }

            @Override
            public int compareTo(@NonNull BannerListBean other) {
                return this.getOrderIndex() > other.getOrderIndex() ? 1 : -1;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.Image);
                dest.writeString(this.Title);
                dest.writeString(this.Type);
                dest.writeString(this.Param);
                dest.writeInt(this.OrderIndex);
            }

            public BannerListBean() {
            }

            protected BannerListBean(Parcel in) {
                this.Image = in.readString();
                this.Title = in.readString();
                this.Type = in.readString();
                this.Param = in.readString();
                this.OrderIndex = in.readInt();
            }

            public static final Parcelable.Creator<BannerListBean> CREATOR = new Parcelable.Creator<BannerListBean>() {
                @Override
                public BannerListBean createFromParcel(Parcel source) {
                    return new BannerListBean(source);
                }

                @Override
                public BannerListBean[] newArray(int size) {
                    return new BannerListBean[size];
                }
            };
        }
    }
}
