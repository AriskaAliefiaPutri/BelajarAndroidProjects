package com.example.recyclerviewcardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Axel", "Surabaya"));
        siswaList.add(new Siswa("Caca", "Surabaya"));
        siswaList.add(new Siswa("Chindita", "Surabaya"));
        siswaList.add(new Siswa("Chris", "Surabaya"));
        siswaList.add(new Siswa("Fernando", "Surabaya"));
        siswaList.add(new Siswa("Ghaza", "Surabaya"));
        siswaList.add(new Siswa("Greg", "Surabaya"));
        siswaList.add(new Siswa("Kadit", "Surabaya"));
        siswaList.add(new Siswa("Kevin", "Surabaya"));
        siswaList.add(new Siswa("Manuela", "Surabaya"));
        siswaList.add(new Siswa("Maudy", "Surabaya"));
        siswaList.add(new Siswa("Maxwell", "Surabaya"));
        siswaList.add(new Siswa("Nabil", "Surabaya"));
        siswaList.add(new Siswa("Nasywa", "Surabaya"));
        siswaList.add(new Siswa("Nevin", "Surabaya"));
        siswaList.add(new Siswa("Oliv", "Surabaya"));
        siswaList.add(new Siswa("Sandy", "Surabaya"));
        siswaList.add(new Siswa("Shakira", "Surabaya"));
        siswaList.add(new Siswa("Xavierra", "Surabaya"));
        siswaList.add(new Siswa("Yesaya", "Surabaya"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }
}