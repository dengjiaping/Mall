package cn.wingene.mallxm.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.limecn.ghmall.R;

import junze.java.able.ICallBack;

import junze.widget.Tile;

import junze.androidxf.core.Agent;

import cn.wingene.mallxf.ui.MyBaseActivity;
import cn.wingene.mallxm.purchase.ask.AskAddressList.AddressItem;
import cn.wingene.mallxm.purchase.ask.AskAddressSave;
import cn.wingene.mallxm.purchase.ask.AskAddressSave.Response;
import cn.wingene.mallxm.purchase.tool.ZoneTool;
import cn.wingene.mallxm.purchase.tool.ZoneTool.Zone;

/**
 * Created by Wingene on 2017/8/19.
 */

public class AddressAddActivity extends MyBaseActivity {
    public static Major major = new Major(AddressAddActivity.class);
    private int mId;
    private String mRegion;
    private String mRegionCode;

    private Tile tlBack;
    private EditText etName;
    private EditText etPhone;
    private TextView tvArea;
    private EditText etAddress;
    private ImageView ivCheck;
    private TextView tvSave;

    protected void initComponent(){
        tlBack = (Tile) super.findViewById(R.id.tl_back);
        etName = (EditText) super.findViewById(R.id.et_name);
        etPhone = (EditText) super.findViewById(R.id.et_phone);
        tvArea = (TextView) super.findViewById(R.id.tv_area);
        etAddress = (EditText) super.findViewById(R.id.et_address);
        ivCheck = (ImageView) super.findViewById(R.id.iv_check);
        tvSave = (TextView) super.findViewById(R.id.tv_save);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_add);
        initComponent();
        AddressItem bean = major.parseParams(this);
        if(bean != null){
            mId =bean.getId();
            mRegionCode = bean.getRegionCode();
            mRegion = bean.getRegion();
            tvArea.setText(mRegion);
            etAddress.setText(bean.getAddress());
            etName.setText(bean.getConsignee());
            etPhone.setText(bean.getMobile());
            ivCheck.setSelected(bean.getIsDefault());
        }

        tlBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        tvSave.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final AddressItem item = new AddressItem(mId,ivCheck.isSelected(), etPhone.getText().toString(),
                        etName.getText().toString(), mRegion, mRegionCode, etAddress.getText().toString());
                ask(new AskAddressSave.Request(item) {
                    @Override
                    public void updateUI(Response rsp) {
                        setResult(Activity.RESULT_OK,major.buildResult(item));
                        finish();
                    }
                });
            }
        });
        tvArea.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ZoneTool.showExecutiveChoiseDialog(getAgent(), new Zone(), new ICallBack<Zone>() {

                    @Override
                    public void callBack(Zone zone) {
                        mRegion = zone.getAllName();
                        mRegionCode = zone.getAllCode();
                        tvArea.setText(mRegion);
                    }
                });
            }
        });
        ivCheck.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ivCheck.setSelected(!ivCheck.isSelected());
            }
        });
    }

    public static class Major extends Agent.Major {
        public Major(Class<? extends AddressAddActivity> clazz) {
            super(clazz);
        }

        public void startForResult(Activity src, int rc) {
            builder(src).startActivityForResult(rc);
        }

        public Intent buildResult(AddressItem item) {
            return Agent.Major.buildResult(item);
        }

        public AddressItem parseResult(Intent data) {
            return parseResult(data, AddressItem.class);
        }

        public void startForResult(Activity src, AddressItem item, int rc) {
            buildParams(src, item).startActivityForResult(rc);
        }

        public AddressItem parseParams(Activity target) {
            return parseParam(target, AddressItem.class);
        }

    }
}
