package com.example.list_view_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<UserModel> userList;
    UserListAdapter adp;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        fillList();

    }

    public void fillList(){

        userList=new ArrayList<>();

        UserModel user1=new UserModel("Aleksandr","Alekhine","30","a");
        UserModel user2=new UserModel("Siegbert","Tarrasch","25","b");
        UserModel user3=new UserModel("Wilhelm","Steinitz","50","c");
        UserModel user4=new UserModel("Mikhail","Botvinnik","60","d");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        adp=new UserListAdapter(userList,this);
        listView.setAdapter(adp);


    }

    void tanimla(){
        listView=(ListView) findViewById(R.id.listView);
    }

}