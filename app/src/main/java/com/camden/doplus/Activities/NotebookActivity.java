package com.camden.doplus.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;

import com.camden.doplus.Adapters.NotebookAdapter;
import com.camden.doplus.Models.RecordModel;
import com.camden.doplus.R;

import java.util.ArrayList;
import java.util.List;

public class NotebookActivity extends AppCompatActivity {

    private RecyclerView rvNotebook;
    private NotebookAdapter notebookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notebook);

        rvNotebook = findViewById(R.id.rv_notebook);
        rvNotebook.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        notebookAdapter = new NotebookAdapter(this);
        rvNotebook.setAdapter(notebookAdapter);

        initData();

    }

    private void initData() {

        List<RecordModel> list = new ArrayList<>();
        RecordModel note = new RecordModel(1);
        RecordModel image = new RecordModel(2);
        RecordModel todo = new RecordModel(3);

        note.setTitle("这是一个笔记item");
        note.setContent("<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p>");

        image.setImageUrl("https://images.unsplash.com/photo-1562447574-060ac8999b29?ixlib=rb-1.2.1" +
                "&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1575&q=80");

        todo.setTitle("这是一个待办item");
        todo.setContent("<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>" +
                "<p>这是一个笔记的内容</p><br>");

        list.add(note);
        list.add(image);
        list.add(todo);

        notebookAdapter.addList(list);
        notebookAdapter.notifyDataSetChanged();

    }
}
