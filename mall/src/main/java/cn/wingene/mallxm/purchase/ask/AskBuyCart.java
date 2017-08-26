package cn.wingene.mallxm.purchase.ask;

import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import junze.androidxf.http.requestargs.RequestArgs;
import junze.androidxf.kit.AKit;

import cn.wingene.mallxf.http.Ask.BaseSignRequest;
import cn.wingene.mallxf.http.Ask.MyBaseResponse;

/**
 * Created by Wingene on 2017/8/26.
 */

public class AskBuyCart {
    public static class Response extends MyBaseResponse {
        private Data data;
        @Override
        protected void initData(JsonElement json) {
            data = AKit.getGson().fromJson(json,Data.class);
        }
    }

    public static class Request extends BaseSignRequest<Response> {
        /**
         * 购物车IDs	不可 如 1,2,3 组合
         */
        @SerializedName("CartIds")
        @RequestArgs
        private String cartIds;

        public Request(String cartIds) {
            super(HttpAddress.ORDER_BUY_CART, new Response());
            this.cartIds = cartIds;
        }
    }

    private static class Data {
        /**
         * 商品信息列表	不可
         */
        private List<ProductList> ProductList;

        /**
         * 会员账户	不可
         */
        private Account Account;

        /**
         * 收货地址	可空
         */
        private Address Address;

        /**
         * 总购买数量	不可
         */
        @SerializedName("SumNumber")
        private Integer sumNumber;

        /**
         * 总金额	不可
         */
        @SerializedName("SumPrice")
        private Double sumPrice;

        /**
         * 折扣率	不可
         */
        @SerializedName("Discount")
        private Double discount;

        /**
         * 折扣金额	不可
         */
        @SerializedName("DiscountPrice")
        private Double discountPrice;

        /**
         * 运费金额	不可
         */
        @SerializedName("DeliveryFee")
        private Double deliveryFee;

        /**
         * 实付金额	不可
         */
        @SerializedName("PayPrice")
        private Double payPrice;


        /**
         * 商品信息列表	不可
         */
        public List<ProductList> getProductList() {
            return ProductList;
        }

        /**
         * 会员账户	不可
         */
        public Account getAccount() {
            return Account;
        }

        /**
         * 收货地址	可空
         */
        public Address getAddress() {
            return Address;
        }

        /**
         * 总购买数量	不可
         */
        public Integer getSumNumber() {
            return sumNumber;
        }

        /**
         * 总金额	不可
         */
        public Double getSumPrice() {
            return sumPrice;
        }

        /**
         * 折扣率	不可
         */
        public Double getDiscount() {
            return discount;
        }

        /**
         * 折扣金额	不可
         */
        public Double getDiscountPrice() {
            return discountPrice;
        }

        /**
         * 运费金额	不可
         */
        public Double getDeliveryFee() {
            return deliveryFee;
        }

        /**
         * 实付金额	不可
         */
        public Double getPayPrice() {
            return payPrice;
        }


    }

    public static class ProductList {
        /**
         * 商品ID	不可
         */
        @SerializedName("Id")
        private Integer id;

        /**
         * 商品名称	不可
         */
        @SerializedName("Name")
        private String name;

        /**
         * 图片路径	不可
         */
        @SerializedName("DefaultImage")
        private String defaultImage;

        /**
         * 销售价格	不可
         */
        @SerializedName("Price")
        private Double price;

        /**
         * 市场价格	不可
         */
        @SerializedName("PriceMarket")
        private Double priceMarket;

        /**
         * 库存数量	不可
         */
        @SerializedName("Stock")
        private Integer stock;

        /**
         * 购买数量	不可
         */
        @SerializedName("BuyNum")
        private Integer buyNum;

        /**
         * 规格ID	不可
         */
        @SerializedName("SpecId")
        private Integer specId;

        /**
         * 规格名称	可空
         */
        @SerializedName("SpecValue")
        private String specValue;

        /**
         * 促销活动ID	可空
         */
        @SerializedName("PromotionId")
        private Integer promotionId;


        /**
         * 商品ID	不可
         */
        public Integer getId() {
            return id;
        }

        /**
         * 商品名称	不可
         */
        public String getName() {
            return name;
        }

        /**
         * 图片路径	不可
         */
        public String getDefaultImage() {
            return defaultImage;
        }

        /**
         * 销售价格	不可
         */
        public Double getPrice() {
            return price;
        }

        /**
         * 市场价格	不可
         */
        public Double getPriceMarket() {
            return priceMarket;
        }

        /**
         * 库存数量	不可
         */
        public Integer getStock() {
            return stock;
        }

        /**
         * 购买数量	不可
         */
        public Integer getBuyNum() {
            return buyNum;
        }

        /**
         * 规格ID	不可
         */
        public Integer getSpecId() {
            return specId;
        }

        /**
         * 规格名称	可空
         */
        public String getSpecValue() {
            return specValue;
        }

        /**
         * 促销活动ID	可空
         */
        public Integer getPromotionId() {
            return promotionId;
        }


    }

    public static class Account {
        /**
         * 游币	不可 使用比例 1:1
         */
        @SerializedName("Amount")
        private Double amount;

        /**
         * 应币	不可 使用比例 100:1
         */
        @SerializedName("Integral")
        private Integer integral;


        /**
         * 游币	不可 使用比例 1:1
         */
        public Double getAmount() {
            return amount;
        }

        /**
         * 应币	不可 使用比例 100:1
         */
        public Integer getIntegral() {
            return integral;
        }


    }

    public static class Address {
        /**
         * 地址ID	不可
         */
        @SerializedName("Id")
        private Integer id;

        /**
         * 手机号码	不可
         */
        @SerializedName("Mobile")
        private String mobile;

        /**
         * 联系人	不可
         */
        @SerializedName("Consignee")
        private String consignee;

        /**
         * 区域名称	不可
         */
        @SerializedName("Region")
        private String region;

        /**
         * 区域编码	不可
         */
        @SerializedName("RegionCode")
        private String regionCode;

        /**
         * 地址详情	不可
         */
        @SerializedName("Address")
        private String address;


        /**
         * 地址ID	不可
         */
        public Integer getId() {
            return id;
        }

        /**
         * 手机号码	不可
         */
        public String getMobile() {
            return mobile;
        }

        /**
         * 联系人	不可
         */
        public String getConsignee() {
            return consignee;
        }

        /**
         * 区域名称	不可
         */
        public String getRegion() {
            return region;
        }

        /**
         * 区域编码	不可
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * 地址详情	不可
         */
        public String getAddress() {
            return address;
        }


    }

}