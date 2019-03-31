package com.example.baijunling0329.presenter;

import com.example.baijunling0329.model.Contantees;
import com.example.baijunling0329.model.HttpUitls;

import com.example.baijunling0329.model.JsonBean;
import com.example.baijunling0329.view.activity.TwoActivity;
import com.example.baijunling0329.view.interfaces.IMainView;

public class MainPresenter extends  BasePresnter<IMainView<JsonBean>> {

    private final HttpUitls instance;

    public   MainPresenter(TwoActivity twoActivity){
         instance = HttpUitls.getInstance();


    }

      public  void ShowData(){
          instance.getData(Contantees.SHOW, JsonBean.class, new HttpUitls.CallBackData() {


              @Override
              public void onResponse(Object o) {
                  getView().onSeccuss((JsonBean)o);
              }

              @Override
                public void onFail(String err) {

                }
            });
      }
}
