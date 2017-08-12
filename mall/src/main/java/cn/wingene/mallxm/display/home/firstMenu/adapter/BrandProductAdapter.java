package cn.wingene.mallxm.display.home.firstMenu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.wingene.mall.R;
import cn.wingene.mallxm.JumpHelper;

/**
 * Created by wangcq on 2017/8/11.
 * 品牌大厂适配器
 */

public class BrandProductAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommend_brand_item_layout, parent,
                false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JumpHelper.startCommodityDetailActivity(parent.getContext());
//                Log.e("", "click !");
//                ObjectAnimator scale_X_objectAnimator = ObjectAnimator.ofFloat(v, "scaleX", 1f, 1.2f);
//                scale_X_objectAnimator.setDuration(100);
//                scale_X_objectAnimator.setInterpolator(new AccelerateInterpolator());
//
//                ObjectAnimator scale_Y_objectAnimator = ObjectAnimator.ofFloat(v, "scaleY", 1f, 1.2f);
//                scale_Y_objectAnimator.setDuration(100);
//                scale_Y_objectAnimator.setInterpolator(new AccelerateInterpolator());
//
//                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(v, "translationZ", 0, 30);
//                objectAnimator.setDuration(100);
//                objectAnimator.setInterpolator(new AccelerateInterpolator());
//                objectAnimator.start();
//
//                AnimatorSet animatorSet = new AnimatorSet();
//                animatorSet.play(objectAnimator).with(scale_X_objectAnimator).with(scale_Y_objectAnimator);
            }
        });
        return new BrandHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class BrandHolder extends RecyclerView.ViewHolder {

        public BrandHolder(View itemView) {
            super(itemView);
        }
    }
}
