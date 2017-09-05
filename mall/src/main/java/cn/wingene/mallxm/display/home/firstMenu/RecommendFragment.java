package cn.wingene.mallxm.display.home.firstMenu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dalong.refreshlayout.OnRefreshListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yanzhenjie.nohttp.rest.Response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Exchanger;

import cn.wingene.mall.R;
import cn.wingene.mallxf.adapter.ImagePagerAdapter;
import cn.wingene.mallxf.http.HttpConstant;
import cn.wingene.mallxf.model.BaseResponse;
import cn.wingene.mallxf.nohttp.GsonUtil;
import cn.wingene.mallxf.nohttp.HttpListener;
import cn.wingene.mallxf.nohttp.NoHttpRequest;
import cn.wingene.mallxf.ui.MyBaseFragment;
import cn.wingene.mallxf.ui.jd_refresh.JDRefreshLayout;
import cn.wingene.mallxf.util.ActivityUtils;
import cn.wingene.mallxf.util.SpaceItemDecoration;
import cn.wingene.mallxm.JumpHelper;
import cn.wingene.mallxm.display.home.FirstMenuFragment;
import cn.wingene.mallxm.display.home.firstMenu.activity.ProductActivity;
import cn.wingene.mallxm.display.home.firstMenu.activity.ProductRecommendActivity;
import cn.wingene.mallxm.display.home.firstMenu.activity.ProductSecondActivity;
import cn.wingene.mallxm.display.home.firstMenu.activity.SearchActivity;
import cn.wingene.mallxm.display.home.firstMenu.adapter.BrandProductAdapter;
import cn.wingene.mallxm.display.home.firstMenu.adapter.DaySpecialPriceAdapter;
import cn.wingene.mallxm.display.home.firstMenu.adapter.PerWeekProductAdapter;
import cn.wingene.mallxm.display.home.firstMenu.adapter.PersonRecommendAdapter;
import cn.wingene.mallxm.display.home.firstMenu.adapter.YouLikeProduceAdapter;
import cn.wingene.mallxm.display.home.firstMenu.data.RecommendModel;

/**
 * Created by wangcq on 2017/8/8.
 * 推荐
 */

public class RecommendFragment extends MyBaseFragment implements ViewPager.OnPageChangeListener, View
        .OnClickListener, HttpListener<String> {
    private ViewPager mRollViewPager;
    private RecyclerView brandProductRecyclerV;
    private SimpleDraweeView perWeekBGV;
    private TextView perWeekNameV;
    private RecyclerView perWeekRecyclerV;
    private RecyclerView personRecommendRecyclerV;
    private RecyclerView daySpecialPRecyclerV;
    private RecyclerView youLikeRecyclerV;

    private ImagePagerAdapter mImagePagerAdapter;
    private List<String> urlList = new ArrayList<>();

    private RecommendModel recommendModel;

    int currentIndex = 0;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mRollViewPager.setCurrentItem(currentIndex + 1, false);

            mHandler.sendEmptyMessageDelayed(1, 5000);

        }
    };
    private RelativeLayout brandTitleGroupV;
    private RelativeLayout perWeekTitleGroupV;
    private RelativeLayout personRecommendTitleGroupV;
    private RelativeLayout daySpecialTitleGroupV;
    private RelativeLayout youLikeTitleGroupV;

    private SimpleDraweeView brandBackV;
    private SimpleDraweeView personRecommendBgV;
    private SimpleDraweeView daySpecialBgV;
    private SimpleDraweeView youLikeBgV;

    public static RecommendFragment newInstance(Bundle bundle) {
        RecommendFragment recommendFragment = new RecommendFragment();
        recommendFragment.setArguments(bundle);

        return recommendFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend_layout, container, false);
        initView(view);
        initEvent();
//        requestData();
        if (getArguments() != null) {
            getDataFromJson(getArguments().getString(FirstMenuFragment.RESULT_ARG));
        }
        return view;
    }

    /**
     * 请求数据
     */
    private void requestData() {
        NoHttpRequest<BaseResponse> responseNoHttpRequest = new NoHttpRequest<>(BaseResponse.class);
        responseNoHttpRequest.request(getActivity(), HttpConstant.HOME_RECOMMEND, null, 1, this, false, "recommend",
                true, true);
    }

    private void initView(View root) {

        mRollViewPager = (ViewPager) root.findViewById(R.id.rollPagerV);
        brandProductRecyclerV = (RecyclerView) root.findViewById(R.id.brandProductRecyclerV);
        perWeekBGV = (SimpleDraweeView) root.findViewById(R.id.perWeekBGV);
        perWeekNameV = (TextView) root.findViewById(R.id.perWeekNameV);
        perWeekRecyclerV = (RecyclerView) root.findViewById(R.id.perWeekRecyclerV);
        personRecommendRecyclerV = (RecyclerView) root.findViewById(R.id.personRecommendRecyclerV);
        daySpecialPRecyclerV = (RecyclerView) root.findViewById(R.id.daySpecialPRecyclerV);
        youLikeRecyclerV = (RecyclerView) root.findViewById(R.id.youLikeRecyclerV);

        brandTitleGroupV = (RelativeLayout) root.findViewById(R.id.brandTitleGroupV);
        perWeekTitleGroupV = (RelativeLayout) root.findViewById(R.id.perWeekTitleGroupV);
        personRecommendTitleGroupV = (RelativeLayout) root.findViewById(R.id.personRecommendTitleGroupV);
        daySpecialTitleGroupV = (RelativeLayout) root.findViewById(R.id.daySpecialTitleGroupV);
        youLikeTitleGroupV = (RelativeLayout) root.findViewById(R.id.youLikeTitleGroupV);

        brandBackV = (SimpleDraweeView) root.findViewById(R.id.brandBackV);
        personRecommendBgV = (SimpleDraweeView) root.findViewById(R.id.personRecommendBgV);
        daySpecialBgV = (SimpleDraweeView) root.findViewById(R.id.daySpecialBgV);
        youLikeBgV = (SimpleDraweeView) root.findViewById(R.id.youLikeBgV);


    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        brandTitleGroupV.setOnClickListener(this);
        perWeekTitleGroupV.setOnClickListener(this);
        personRecommendTitleGroupV.setOnClickListener(this);
        daySpecialTitleGroupV.setOnClickListener(this);
        youLikeTitleGroupV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.getActivity(), ProductRecommendActivity.class);
        switch (v.getId()) {
            case R.id.brandTitleGroupV://品牌大厂
                intent = new Intent(this.getActivity(), SearchActivity.class);
                if (recommendModel != null) {
                    intent.putExtra("type", recommendModel.getData().getBrand().getType());
                    intent.putExtra("key", recommendModel.getData().getBrand().getParam());
                    intent.putExtra("title", recommendModel.getData().getBrand().getTitle());
                    intent.putExtra("typeCode", "");
                }
                break;
            case R.id.perWeekTitleGroupV://每周更新
                if (recommendModel != null) {
                    intent.putExtra("type", recommendModel.getData().getNew().getType());
                    intent.putExtra("key", "");//recommendModel.getData().getNew().getParam());
                    intent.putExtra("title", recommendModel.getData().getNew().getTitle());
                }

                break;

            case R.id.personRecommendTitleGroupV://人气推荐
                if (recommendModel != null) {
                    intent.putExtra("type", recommendModel.getData().getRecommend().getType());
                    intent.putExtra("key", "");//recommendModel.getData().getRecommend().getParam());
                    intent.putExtra("title", recommendModel.getData().getRecommend().getTitle());
                }

                break;
            case R.id.daySpecialTitleGroupV://天天特价
                if (recommendModel != null) {
                    intent.putExtra("type", recommendModel.getData().getSpecials().getType());
                    intent.putExtra("key", "");//recommendModel.getData().getSpecials().getParam());
                    intent.putExtra("title", recommendModel.getData().getSpecials().getTitle());
                }

                break;
            case R.id.youLikeTitleGroupV:
//                if (recommendModel != null) {
//                    intent.putExtra("type", recommendModel.getData().getLike().getType());
//                    intent.putExtra("key", recommendModel.getData().getLike().getParam());
//                    intent.putExtra("title", recommendModel.getData().getLike().getTitle());
//                }
                return;
//            break;
            default:
//                Intent intent = new Intent(this.getActivity(), ProductActivity.class);
//                startActivity(intent);

                break;
        }
        startActivity(intent);

    }

    /**
     * 猜你喜欢
     */
    private void initYouLike(RecommendModel.DataBean.LikeBean likeBean) {
        youLikeRecyclerV.setNestedScrollingEnabled(false);
        youLikeBgV.setImageURI(likeBean.getImage());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        youLikeRecyclerV.setLayoutManager(gridLayoutManager);

        YouLikeProduceAdapter youLikeProduceAdapter = new YouLikeProduceAdapter(likeBean.getProductList());
        youLikeRecyclerV.setAdapter(youLikeProduceAdapter);

        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(10, 10, 10, 10);
        youLikeRecyclerV.addItemDecoration(spaceItemDecoration);
    }

    /**
     * 天天特价
     */
    private void initDaySpecial(RecommendModel.DataBean.SpecialsBean specialsBean) {
        daySpecialPRecyclerV.setNestedScrollingEnabled(false);
        daySpecialBgV.setImageURI(specialsBean.getImage());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager
                .VERTICAL, false);
        daySpecialPRecyclerV.setLayoutManager(linearLayoutManager);

        DaySpecialPriceAdapter daySpecialPriceAdatper = new DaySpecialPriceAdapter(specialsBean.getProductList());
        daySpecialPRecyclerV.setAdapter(daySpecialPriceAdatper);

        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(10, 10, 10, 10);
        daySpecialPRecyclerV.addItemDecoration(spaceItemDecoration);

    }

    /**
     * 人气推荐
     */
    private void initPersonRecommend(RecommendModel.DataBean.RecommendBean recommendBean) {
        personRecommendRecyclerV.setNestedScrollingEnabled(false);
        personRecommendBgV.setImageURI(recommendBean.getImage());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,
                false);
        personRecommendRecyclerV.setLayoutManager(linearLayoutManager);

        PersonRecommendAdapter personRecommendAdapter = new PersonRecommendAdapter(recommendBean.getProductList());
        personRecommendRecyclerV.setAdapter(personRecommendAdapter);

        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(10, 10, 10, 10);
        personRecommendRecyclerV.addItemDecoration(spaceItemDecoration);
    }

    /**
     * 每周新品
     */
    private void initPerWeekProduct(RecommendModel.DataBean.NewBean newBean) {
        perWeekRecyclerV.setNestedScrollingEnabled(false);
        perWeekBGV.setImageURI(newBean.getImage());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager
                .HORIZONTAL, false);
        perWeekRecyclerV.setLayoutManager(linearLayoutManager);

        PerWeekProductAdapter perWeekProductAdapter = new PerWeekProductAdapter(newBean.getProductList());
        perWeekRecyclerV.setAdapter(perWeekProductAdapter);

        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(10, 10, 10, 10);
        perWeekRecyclerV.addItemDecoration(spaceItemDecoration);
    }

    /**
     * 品牌大厂
     */
    private void initBrandProduct(RecommendModel.DataBean.BrandBean brandBean) {
        brandProductRecyclerV.setNestedScrollingEnabled(false);

        brandBackV.setImageURI(brandBean.getImage());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), 2);
        brandProductRecyclerV.setLayoutManager(gridLayoutManager);

        BrandProductAdapter brandProductAdapter = new BrandProductAdapter(brandBean.getProductList());
        brandProductRecyclerV.setAdapter(brandProductAdapter);

        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(10, 10, 10, 10);
        brandProductRecyclerV.addItemDecoration(spaceItemDecoration);

    }

    private void initRollPager(final List<RecommendModel.DataBean.BannerListBean> bannerListBeens) {
        Collections.sort(bannerListBeens);
        urlList.clear();
//        urlList.add(bannerListBeens.get(bannerListBeens.size() - 1).getImage());

        for (RecommendModel.DataBean.BannerListBean bannerListBean : bannerListBeens) {
            urlList.add(bannerListBean.getImage());
        }
//        urlList.add(bannerListBeens.get(0).getImage());


        mImagePagerAdapter = new ImagePagerAdapter(urlList);
        mRollViewPager.setAdapter(mImagePagerAdapter);
        mRollViewPager.addOnPageChangeListener(this);
        mHandler.sendEmptyMessageDelayed(1, 1000);

        mImagePagerAdapter.setBinnerClickListener(new ImagePagerAdapter.BinnerClickListener() {
            @Override
            public void binnerItemClick(int position) {
                try {
                    JumpHelper.startCommodityDetailActivity(getActivity(), Integer.parseInt(bannerListBeens.get
                            (position).getParam()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
//        if (position == urlList.size() - 1) {
//            currentIndex = 1;
//        } else if (position == 0) {
//            currentIndex = urlList.size() - 2;
//        } else {
            currentIndex = position;
//        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == ViewPager.SCROLL_STATE_IDLE) {
            mRollViewPager.setCurrentItem(currentIndex, false);
        }
    }

    @Override
    public void onSucceed(int what, Response<String> response) {
        getDataFromJson(response.get());

    }

    private void getDataFromJson(String resultJson) {
        try {
            GsonUtil<RecommendModel> gsonUtil = new GsonUtil<>(RecommendModel.class);
            recommendModel = gsonUtil.fromJson(resultJson);
            initRollPager(recommendModel.getData().getBannerList());
            initBrandProduct(recommendModel.getData().getBrand());
            initPerWeekProduct(recommendModel.getData().getNew());
            initPersonRecommend(recommendModel.getData().getRecommend());
            initDaySpecial(recommendModel.getData().getSpecials());
            initYouLike(recommendModel.getData().getLike());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailed(int what, Object tag, Exception exception, int responseCode, long networkMillis) {

    }
}
