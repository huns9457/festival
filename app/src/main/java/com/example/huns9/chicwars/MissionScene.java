package com.example.huns9.chicwars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MissionScene extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_scene);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }
    private   void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("주점");
        listDataHeader.add("무대");
        listDataHeader.add("화장실");

        List<String> e = new ArrayList<>();
        e.add("달갈 날달걀 구별하기");
        e.add("시간내에 삶은 계란 까기");
        e.add("룰렛 돌리기");
        e.add("다트 던지기");
        e.add("야바위 게임");
        e.add("시간 플랫 맞추기(치킨경품!)");
        e.add("초성퀴즈!");


        List<String> a = new ArrayList<>();
        a.add("닭 탈 쓴 사람과 사진찍기");
        a.add("주변 쓰레기 5개 주워오기");
        a.add("단체 줄넘기");
        a.add("코끼리코 돌고 캔 쌓기");
        a.add("글자 맞추기(5명 단체게임)");


        List<String> x = new ArrayList<>();
        x.add("치킨 브랜드 맞추기");
        x.add("맥주 브랜드 맞추기");
        x.add("치킨 무로 탑 쌓기");
        x.add("입으로만 닭다리 발골하기");
        x.add("콜라 빨리마시기");


        listHash.put(listDataHeader.get(0), e);
        listHash.put(listDataHeader.get(1), a);
        listHash.put(listDataHeader.get(2), x);


    }
}