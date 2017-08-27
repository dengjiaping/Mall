package cn.wingene.mallxm.display.home.firstMenu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import cn.wingene.mall.R;
import cn.wingene.mallxm.display.home.firstMenu.data.ProductListModel;

/**
 * Created by wangcq on 2017/8/27.
 * 天天特价适配器
 */

public class SpecialOfferRecyclerVAdapter extends RecyclerView.Adapter {

    private List<ProductListModel.DataBean.ListBean> mDataBeanList;

    public SpecialOfferRecyclerVAdapter(List<ProductListModel.DataBean.ListBean> dataBeanList) {
        mDataBeanList = dataBeanList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommend_person_recommend_item_layout,
                parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        return new SpecialHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SpecialHolder specialHolder = (SpecialHolder) holder;
        ProductListModel.DataBean.ListBean productItemData = mDataBeanList.get(position);

        specialHolder.personRecommendItemImgV.setImageURI(productItemData.getDefaultImage());
        specialHolder.personRecommendProductNameV.setText(productItemData.getName());
        specialHolder.personRecommendItemMarkOneV.setVisibility(View.GONE);
        specialHolder.personRecommendProductDesV.setVisibility(View.GONE);
        specialHolder.personRecommendItemMarkTwoV.setText(productItemData.getTag().toString().replace(",",
                "/"));
        specialHolder.personRecommendProductPriceV.setText("¥" + productItemData.getPrice());
    }

    @Override
    public int getItemCount() {
        return mDataBeanList.size();
    }

    class SpecialHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView personRecommendItemImgV;
        private TextView personRecommendItemMarkOneV;
        private TextView personRecommendItemMarkTwoV;
        private TextView personRecommendProductNameV;
        private TextView personRecommendProductDesV;
        private TextView personRecommendProductPriceV;

        public SpecialHolder(View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View root) {
            personRecommendItemImgV = (SimpleDraweeView) root.findViewById(R.id.personRecommendItemImgV);
            personRecommendItemMarkOneV = (TextView) root.findViewById(R.id.personRecommendItemMarkOneV);
            personRecommendItemMarkTwoV = (TextView) root.findViewById(R.id.personRecommendItemMarkTwoV);
            personRecommendProductNameV = (TextView) root.findViewById(R.id.personRecommendProductNameV);
            personRecommendProductDesV = (TextView) root.findViewById(R.id.personRecommendProductDesV);
            personRecommendProductPriceV = (TextView) root.findViewById(R.id.personRecommendProductPriceV);
        }
    }
}