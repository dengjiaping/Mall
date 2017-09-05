package cn.wingene.mallxm.purchase;

import java.math.BigDecimal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import static cn.wingene.mallxm.purchase.RechargeIndexActivity.Major.MAJOR_AMOUNT;
import static cn.wingene.mallxm.purchase.RechargeIndexActivity.Major.MAJOR_INTEGRAL;

import junze.java.util.StringUtil;

import junze.widget.Tile;

import junze.androidxf.core.Agent;

import cn.wingene.mall.R;
import cn.wingene.mallxf.cacheData.UserData;
import cn.wingene.mallxf.ui.MyBaseActivity;
import cn.wingene.mallxm.JumpHelper;
import cn.wingene.mallxm.purchase.ask.AskAmountIndex;
import cn.wingene.mallxm.purchase.ask.AskIntegralIndex;
import cn.wingene.mallxm.purchase.ask.AskIntegralIndex.Response;

/**
 * Created by Wingene on 2017/9/5.
 */

public class RechargeIndexActivity extends MyBaseActivity {
    private BigDecimal mBigDecimal;

    private Tile tlBack;
    private TextView tvTitle;
    private Tile tlList;
    private TextView tvRecharge;
    private TextView tvLabel;
    private TextView tvCount;
    private TextView tvCash;
    private TextView tvIntegral;
    private TextView tvAmount;

    protected void initComponent() {
        tlBack = (Tile) super.findViewById(R.id.tl_back);
        tvTitle = (TextView) super.findViewById(R.id.tv_title);
        tlList = (Tile) super.findViewById(R.id.tl_list);
        tvRecharge = (TextView) super.findViewById(R.id.tv_recharge);
        tvLabel = (TextView) super.findViewById(R.id.tv_label);
        tvCount = (TextView) super.findViewById(R.id.tv_count);
        tvCash = (TextView) super.findViewById(R.id.tv_cash);
        tvIntegral = (TextView) super.findViewById(R.id.tv_integral);
        tvAmount = (TextView) super.findViewById(R.id.tv_amount);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
        initComponent();
        tlBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        initListener();
        askInit();
    }

    private void initListener() {
        tlList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvRecharge.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                RechargeSubmitActivity.major.startForMajor(getActivity(), getMajor());
            }
        });
        tvCash.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvAmount.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvAmount.isSelected()) {
                    askIntegral();
                }
            }
        });
        tvIntegral.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvIntegral.isSelected()) {
                    askAmount();
                }
            }
        });
    }


    public void askInit() {
        switch (getMajor()) {
        case MAJOR_INTEGRAL:
            askIntegral();
            break;
        case MAJOR_AMOUNT:
        default:
            askAmount();
            break;
        }
    }

    private void askIntegral() {
        ask(new AskIntegralIndex.Request() {
            @Override
            public void updateUI(Response rsp) {
                mBigDecimal = new BigDecimal(rsp.getIntegral());
                setMajor(Major.MAJOR_AMOUNT);
                RechargeIndexActivity.this.updateUI2();
            }
        });
    }

    private void askAmount() {
        ask(new AskAmountIndex.Request() {
            @Override
            public void updateUI(AskAmountIndex.Response rsp) {
                mBigDecimal = new BigDecimal(rsp.getAmount());
                setMajor(Major.MAJOR_INTEGRAL);
                RechargeIndexActivity.this.updateUI2();
            }
        });
    }

    public void updateUI2() {
        switch (getMajor()) {
        case MAJOR_INTEGRAL:
            tvTitle.setText("应币余额");
            tvLabel.setText("应币余额(元)");
            tvCount.setText(String.format("%s", mBigDecimal != null ? mBigDecimal : "0"));

            //            tvRecharge // 充值
            tvCash.setVisibility(View.INVISIBLE);

            tvIntegral.setSelected(true);
            tvAmount.setSelected(false);
            break;
        case MAJOR_AMOUNT:
        default:
            tvTitle.setText("游币余额");
            tvLabel.setText("游币余额(元)");
            tvCount.setText(String.format("%s", mBigDecimal != null ? mBigDecimal : "0"));

            //            tvRecharge // 充值
            tvCash.setVisibility(View.VISIBLE);

            tvAmount.setSelected(true);
            tvIntegral.setSelected(false);
            break;
        }
    }


    public static class Major extends Agent.Major {
        public static final int MAJOR_AMOUNT = 0;
        public static final int MAJOR_INTEGRAL = 1;

        public Major(Class<? extends RechargeIndexActivity> clazz) {
            super(clazz);
        }

        public void startForIntegral(Context src) {
            if (!StringUtil.isValid(UserData.getverifiCode())) {
                JumpHelper.startLoginActivity(src);
                return;
            }
            builder(src).setMajor(MAJOR_INTEGRAL).startActivity();
        }

        public void startForAmount(Context src) {
            if (!StringUtil.isValid(UserData.getverifiCode())) {
                JumpHelper.startLoginActivity(src);
                return;
            }
            builder(src).setMajor(MAJOR_AMOUNT).startActivity();
        }
    }
}